
package Java.sql;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//建立MySql資料表欄位
public class CreateTable_MySql {

    public static void main(String[] args) throws UnsupportedEncodingException {
        //新增表格會在建好的資料庫lin加入(還未連線時)，所以url區碼後面的資料庫名稱沒寫也沒關係(只限創表格時用)
        String jdbcURL = "jdbc:mysql://localhost:3306/lin?zeroDateTimeBehavior=convertToNull";
        String username = "root";
        String password = "";
        
        //建立資料表SQL語句，沒有設定編碼，中文會亂碼
            String sql = "CREATE TABLE LIN.MEMBER("+"ID INTEGER not null primary key,"+
                         "NAME VARCHAR(10),"+
                         "SEX VARCHAR(1),"+
                         "EMAIL VARCHAR(60)"+
                         ")";
                        
        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("建立資料表失敗" + e.getMessage());
        }
    }
    
}
