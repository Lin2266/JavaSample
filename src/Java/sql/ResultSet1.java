
package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//取得ResultSet需要準備的程序, 需要建立Connection、Statement、ResultSet物件過程繁複
public class ResultSet1 {

    public static void main(String[] args) throws SQLException {
       String sql = "select * from customers ";
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/totalbuy?zeroDateTimeBehavior=convertToNull&characterEncoding=utf-8","root","root1234");
       Statement stmt = conn.createStatement();
       //執行sql select語句並得到一個ResultSet物件
       ResultSet rs = stmt.executeQuery(sql);
       while(rs.next()){           
           System.out.println(rs.getString(1));
       }
       
       
       
    }
    
}
