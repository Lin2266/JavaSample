package Java.sql;

//附加記錄

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//利用executeUpdate()亦可建立新增、修改或刪除資料記錄(Record)
public class AddendRecord_MySql {

    public static void main(String[] args) throws UnsupportedEncodingException {
        //新增、修改、刪除、查詢，要完整url
        String jdbcURL = "jdbc:mysql://localhost:3306/lin?zeroDateTimeBehavior=convertToNull";
        String username = "root";
        String password = "";
        
        //建立記錄資料Record SQL語句，有編碼問題
            String sql = //新增記錄
                         "INSERT INTO lin.Member(id, name, sex, email)"
                        +"VALUES (1,\'Vincent\',\'男\',\'Vincent@xxx.xxx\')";
                         //修改
                         //"UPDATE LIN.Member SET name = 'Howard'WHERE id = 1";
                         //刪除
                         //"DELETE FROM LIN.Member WHERE ID = 1";
            try(Connection conn = DriverManager.getConnection(jdbcURL, username, password);
                    PreparedStatement ps = conn.prepareStatement(sql)) {
                int count = ps.executeUpdate();
                System.out.println("異動筆數" + count);
            
        } catch (SQLException e) {
                System.out.println("異動失敗" + e.getMessage());
        }
    }

}
