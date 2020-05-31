package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
addBatch()
優點：發送的是預編譯後的SQL語句，執行效率高。
缺點：只能應用在SQL語句相同，但參數不同的批次處理中。
      因此此種形式的批次處理經常用于在同一個表中批量插入數據，或批量更新表的數據。

第二種處理批次的方式:解決第一種缺點
利用PreparedStatement可將sql字串內的參數以『？』代替，之後再於程式中將內容對應到指定的『？』即可，
以降低系統上sql字串拼湊的風險
*/
 
public class BatchUpdate_PreparedStatement1 {

    public static void main(String[] args) {
        String sql = "insert into app.lin(id,password,email,birthday) values(?,?,?,?)";
        //String sql = "insert into app.member(id,name,sex,email) values(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                PreparedStatement ps = conn.prepareStatement(sql)) {
            for (int i = 0; i < 50000; i++) {
                ps.setInt(1, 1 + i);//問號1
                ps.setString(2, "123" + i);//問號2
                ps.setString(3, "aaa" + i + "@sina.com");//問號3
                ps.setString(4, "1980,10,10");//問號4
                ps.addBatch();
                if (i % 1000 == 0) {      //为防止(list集合) 内存溢出：设定每累加1000条数据就向数据库发送一次
                    ps.executeBatch();
                    ps.clearBatch();
                }
            }
            ps.executeBatch(); //当剩余的条数小于1000条时就不会被发送到数据库，所以此处要在发送一次。
        } catch (SQLException e) {
            System.out.println(e.getNextException());
        }

    }

}
