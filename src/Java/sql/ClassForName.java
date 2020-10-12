package Java.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassForName {
	public void method(){
		int a = 0;
		if(a == 1){
			System.out.println("a = 1");
		}else if(a == 0){
			System.out.println("a = 0-1");
		}else if(a == 0){
			System.out.println("a = 0-2");
		}
	}
	
	public static void main(String[] args){
		new ClassForName().method();
		
		try {
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:mem:test_mem", "", "");
			Statement stmt = conn.createStatement();
			stmt.execute("create table Person(id int,name varchar(255)) ");
			stmt.execute("insert into Person(id,name) values(1, 'Mary')");
			ResultSet r = stmt.executeQuery("select * from Person");
			while(r.next()){
				String id = r.getString(1);
				String name = r.getString(2);
				System.out.println("id["+id+"],name["+name+"]");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
