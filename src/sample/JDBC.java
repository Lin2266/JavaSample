package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {
	static final String url = "jdbc:mysql://localhost:3306/totalbuy?";
	static final String user = "lin";
	static final String password = "root";

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			if(con!=null){
				System.out.println("連線成功");
			}else{
				System.out.println("連線失敗");
			}
			PreparedStatement ps = con.prepareStatement("select * from totalbuy");
			
			System.out.println(ps.executeQuery());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
