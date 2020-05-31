
package Java.sql;

//預編敘述物件

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchUpdate_PreparedStatement2 {
//PreparedStatement可將sql字串內的參數以『？』代替，之後再於程式中將內容對應到指定的『？』即可，
//以降低系統上sql字串拼湊的風險
    public static void main(String[] args) {
        //建立記錄資料Record(事件)語句,先把還不確定的欄位內容置入『？』
        String sql = "INSERT INTO APP.MEMBER(ID,NAME,SEX,EMAIL) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            //新增欄位資料，將資料放入指定問號順序內
            pstmt.setInt(1,5);//第1個問號放入5
            pstmt.setString(2,"John");//第2個問號放入名稱
            pstmt.setString(3,"男");//第3個問號放入"男"
            pstmt.setString(4,"john@xxx.xxx");//第4個問號放入信箱
            //PreparedStatement物件內的sql送入到資料庫，executeUpdate()方法內不要帶參數
            int count = pstmt.executeUpdate();
            System.out.println("異動筆數:" + count);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
