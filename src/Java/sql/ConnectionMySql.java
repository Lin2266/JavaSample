
package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//連線mysql資料庫
public class ConnectionMySql {
//驅動要在專案那新增
	static final String jdbcURL = "jdbc:mysql://localhost:3306/totalbuy?characterEncoding=utf-8";
	static final String username = "lin";
	static final String password = "root";
    public static void main(String[] args) throws TotalBuyException {
         

         try(Connection conn = DriverManager.getConnection(jdbcURL, username, password)) {
         if(conn != null)
                 System.out.println("連線成功");
        } catch (SQLException ex) {
            System.out.println("連線失敗:" + ", errorCode:" + ex.getErrorCode());
        }
    }
    
}
