
package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//附加記錄
//利用executeUpdate()亦可建立新增、修改或刪除資料記錄(Record)
public class AddendRecord_Member {

    public static void main(String[] args) {
        //建立 derby connection
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
             //建立statement實體
            Statement stmt = conn.createStatement();){
            //建立derby driver instance,JDBC4.0之後會自動參照ClassPath建立
            
            //建立記錄資料Record SQL語句
            String sql = //新增記錄
                         "INSERT INTO APP.Member(id, name, sex, email)"
                        +"VALUES (1,\'Vincent\',\'男\',\'Vincent@xxx.xxx\')";
                         //修改
                         //"UPDATE APP.Member SET name = 'Howard'WHERE id = 1";
                         //刪除
                         //"DELETE FROM APP.Member WHERE ID = 1";
            //將建立記錄資料Record SQL語句送入至Statement物件中並傳到資料庫
            int count = stmt.executeUpdate(sql);
            System.out.println("異動筆數:" + count);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
