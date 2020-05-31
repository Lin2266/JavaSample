
package Java.sql;

import javax.sql.RowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;


//Java 7取得RowSet需要準備的程序,透過RowSetFactory(行集廠)即可取得RowSet物件，相當方便又直覺
public class RowSet1 {

    public static void main(String[] args) throws Exception {
       //取得RowSetFactory工廠物件
        RowSetFactory factory = RowSetProvider.newFactory();//Provider提供商
        try (RowSet rowSet = factory.createJdbcRowSet()){//取得JdbcRowSet物件實體
            //設定資料庫連線相關資訊
            rowSet.setUrl("jdbc:derby://localhost:1527/sample");
            rowSet.setUsername("app");
            rowSet.setPassword("app");
            //透過setCommand()方法來執行SQL語法
            rowSet.setCommand("select ID, NAME, SEX, EMAIL from APP.MEMBER");//Command命令
            rowSet.execute();//執行查詢
            //與傳統的ResultSet用法相同，皆是使用next()方法來尋訪RowSet物件內的資料
            while(rowSet.next()){
                System.out.print(rowSet.getInt("ID") + "\t");
                System.out.print(rowSet.getString("NAME") + "\t");
                System.out.print(rowSet.getString("SEX") + "\t");
                System.out.println(rowSet.getString("EMAIL"));
            }
        } 
    }
    
}
