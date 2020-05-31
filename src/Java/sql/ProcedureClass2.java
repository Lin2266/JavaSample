
package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//2.建立預儲程序java程式:提供給derby資料庫使用，derby資料庫所執行的方法必須是類別(static)方法
public class ProcedureClass2 {
    //2組in輸入參數與2組out輸出結果
    public static void selectRows(int p1, int p2, ResultSet[] data1,ResultSet[] data2) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement ps1 = conn.prepareStatement("select * from APP.MEMBER where ID = ?");
        ps1.setInt(1, p1);
        data1[0] = ps1.executeQuery();
        PreparedStatement ps2 = conn.prepareStatement("select * from APP.MEMBER where ID >= ?");
        ps2.setInt(1, p2);
        data2[0] = ps2.executeQuery();
        conn.close();
    }
    public static void main(String[] args) {
       
    }
    
}
