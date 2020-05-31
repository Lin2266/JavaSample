package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//查詢mysql
public class Query_MySql {

    public static void main(String[] args) throws TotalBuyException {
        String jdbcURL = "jdbc:mysql://localhost:3306/totalbuy?characterEncoding=utf-8";
        String username = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
                PreparedStatement ps = conn.prepareStatement("select * from customers")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer c;
                String type = rs.getString("type");
                if (type.equals("VIP")) {
                    c = new VIP();
                } else {
                    c = new Customer();
                }
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setPassword(rs.getString("password"));
                c.setGender(rs.getString("gender").charAt(0));
                c.setEmail(rs.getString("email"));
                c.setBirthDate(rs.getDate("birth_date"));
                c.setAddress(rs.getString("address"));
                c.setPhone(rs.getString("phone"));
                c.setMarried(rs.getBoolean("married"));
                String bType = rs.getString("blood_type");
                if (bType != null) {
                    c.setBloodType(BloodType.valueOf(bType));
                }
                c.setStatus(rs.getInt("status"));
                if (c instanceof VIP) {
                    ((VIP) c).setDiscount(rs.getInt("discount"));
                }

                System.out.println(c);

            }

        } catch (SQLException ex) {
            System.out.println("查詢全部客戶失敗:" + ", errorCode:" + ex.getErrorCode());
            throw new TotalBuyException("查詢全部客戶失敗:", ex);
        }
    }

}
