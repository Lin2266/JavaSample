
package Java.sql;

//查詢

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query_Member {

    public static void main(String[] args) {
        //建立查詢語句
        String sql = "SELECT ID, NAME, SEX, EMAIL FROM APP.MEMBER";
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app","app");
             Statement stmt = conn.createStatement();
             //執行select語句並得到一個ResultSet(結果集)物件
             ResultSet rs = stmt.executeQuery(sql)){
            //分析ResultSet物件內容
            while(rs.next()){
                System.out.print(rs.getInt("ID")+"\t");//將ID欄位內容取出並轉成int資料型態
                System.out.print(rs.getString("NAME")+"\t");
                System.out.print(rs.getString("SEX")+"\t");
                System.out.println(rs.getString("EMAIL")); 
               
                System.out.print(rs.getInt(1)+"\t");//也可用欄位順號來取得欄位內容
                System.out.print(rs.getString(2)+"\t");
                System.out.print(rs.getString(3)+"\t");
                System.out.println(rs.getString(4));  
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
