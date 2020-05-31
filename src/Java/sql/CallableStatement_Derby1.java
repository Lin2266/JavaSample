
package Java.sql;

//5

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatement_Derby1 {

    public static void main(String[] args) {
       //建立callable查詢語句
        String sql = "{call APP.DRS2(?,?)}";
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                CallableStatement cs = conn.prepareCall(sql)){
            cs.setInt(1, 1);
            cs.setInt(2, 3);
            
            boolean hasResults = cs.execute();
            
            while (hasResults){
                ResultSet rs = cs.getResultSet();
                while(rs.next()){
                    System.out.println(rs.getString("ID") + "\t" + rs.getString("NAME"));
                }
                rs.close();
                hasResults = cs.getMoreResults();
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
