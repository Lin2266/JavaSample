
package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

/*
交易模式:
在資料庫系統中，一個交易(事務)指「由一系列資料庫操作組成的一個不可拆分完整邏輯過程，並具備有ACID特性」。
若在此邏輯過程中，有任何一個子集發生錯誤皆會導致交易失敗，且資料庫必須恢復至交易前的狀態。
ACID是指資料庫管理系統(DBMS):為保證交易是正確可靠的， 在寫入/異動資料的過程中必須具備四個特性
1.原子性（Atomicity):一個交易過程中的所有操作，要嘛全部完成，要嘛全部不完成，不會結束在中間某個環節。
  事務在執行過程中發生錯誤，會被回滾(Rollback)到交易開始前的狀態，就像這個事務從來沒有執行過一樣
2.一致性(Consistency):在事務開始之前和事務結束以後，資料庫的完整性沒有被破壞。
  這表示寫入的資料必須完全符合所有的預設規則，這包含資料的精確度、串聯性以及後續資料庫可以自發性地完成預定的工作
3.隔離性(Isolation):當兩個或多個事務併發訪問(此處訪問指查詢和修改的操作)資料庫的同一資料時所表現出的相互關係。
  事務隔離分為不同級別，包括讀未提交(Read uncommitted)、讀提交(read committed)、可重複讀(repeatable read)和序列化
4.持久性(Durability):在事務完成以後，該事務對資料庫所作的更改便持久地保存在資料庫之中，並且是完全的

JDBC交易模式:
JDBC在預設情況下是自動提交模式，也就是每一個sql語句完成後會自動提交到資料庫，但是若把一個單一sql語句或一組sql語句
作為一個邏輯單元(一個交易)，只要有任何語句失敗整個交易就失敗，若要達到此需求就必須在程式中關閉
自動提交setAutoCommit(false),直到執行到commit()(承諾)方法後始能進行提交到資料庫的動作。

交易模式方法            說明
setAutoCommit(flag)     設定認可模式。flag(旗) == true:自動認可模式，每做完一個statement自動認可
                                      flag(旗) == false:手動認可模式，接收到commit()命令才會認可
commit()                建立一個BufferedWriter物件，其參數out必須屬於Writer物件，sz為設定buffer大小的參數
setSavepoint(point)     設定一個新的RollBack回復點(JDBC 3.0)
releaseSavepoint(point) 刪除RollBack回復點(JDBC 3.0)
rollback(point)         交易失敗的回復動作，回復到point(點)的狀態
*/
//JDBC交易模式:針對交易模式與RollBack回復點
public class JDBCTransaction {

    public static void main(String[] args) {
        String sql = "SELECT ID, NAME, SEX, EMAIL FROM APP.MEMBER";
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
             Statement stmt = conn.createStatement()){
            //設定認可模式為手動，遇到commit()才做提交的動作
            conn.setAutoCommit(false);//false是關閉自動提交
            stmt.executeUpdate("insert into APP.MEMBER values(5,'Sam','男','sam@xxx.xxx')");
            //RollBack回復點，程式有執行rollback()命令所要回復到的地方
            Savepoint point = conn.setSavepoint("point");
            stmt.executeUpdate("insert into APP.MEMBER values(6,'Jane','女','jane@xxx.xxx')");
            conn.rollback(point);//回復點，資料庫的內容會回復到Savepoint回復點的狀態
            conn.releaseSavepoint(point);//釋放回復點
            stmt.executeUpdate("insert into APP.MEMBER values(7,'Tom','男','tom@xxx.xxx')");
            conn.commit();//認可提交
            
            //執行sql select語句並得到一個ResultSet物件
            ResultSet rs = stmt.executeQuery(sql);
            //分析ResultSet物件內容
            while(rs.next()){
                System.out.print(rs.getInt("ID") + "\t");
                System.out.print(rs.getString("NAME") + "\t");
                System.out.print(rs.getString("SEX") + "\t");
                System.out.println(rs.getString("EMAIL"));
            }
            rs.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    
}
