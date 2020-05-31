package Java.sql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class TestJDBC {
	static final String url = "jdbc:mysql://localhost:3306/totalbuy?";
	static final String user = "lin";
	static final String password = "root";
	
	public void insert(Customer data)throws TotalBuyException{
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement("insert into customers(id, name, password, gender, email,birth_date, "
			+ "address, phone,married,blood_type, status, discount, type) value(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,data.getId());
			ps.setString(2,data.getName());
			ps.setString(3,data.getPassword());
			ps.setString(4,String.valueOf(data.getGender()));
			ps.setString(5,data.getEmail());
			
			ps.setDate(6,data.getBirthDate()==null?null:new java.sql.Date(data.getBirthDate().getTime()));
			ps.setString(7,data.getAddress());
			ps.setString(8,data.getPhone());
			ps.setBoolean(9,data.isMarried());
			ps.setString(10,data.getBloodType()==null?null:data.getBloodType().name());
			ps.setInt(11,data.getStatus());
			if(data instanceof VIP){
				ps.setInt(12,((VIP) data).getDiscount());
			}else{
				ps.setInt(12,0);
			}
			ps.setString(13,data.getClass().getSimpleName());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("資源關閉失敗" + e.getErrorCode());
				e.printStackTrace(); 
			}
		}
	}
	
	public void Update(Customer data)throws TotalBuyException{
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement("update customers set name=?, password=?, gender=?, email=?,"
				+ "birth_date=?,address=?, phone=?,married=?,blood_type=?, status=?, discount=?,type=? "
				+ "where id=?");
			ps.setString(1,data.getName());
			ps.setString(2,data.getPassword());
			ps.setString(3,String.valueOf(data.getGender()));
			ps.setString(4,data.getEmail());
			ps.setDate(5,data.getBirthDate()==null?null:new java.sql.Date(data.getBirthDate().getTime()));
			ps.setString(6,data.getAddress());
			ps.setString(7,data.getPhone());
			ps.setBoolean(8,data.isMarried());
			ps.setString(9,data.getBloodType()==null?null:data.getBloodType().name());
			ps.setInt(10,data.getStatus());
			if(data instanceof VIP){
				ps.setInt(11,((VIP) data).getDiscount());
			}else{
				ps.setInt(11,0);
			}
			ps.setString(12,data.getClass().getSimpleName());
			ps.setString(13,data.getId());
			System.out.println(ps.executeUpdate());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("資源關閉失敗" + e.getErrorCode());
				e.printStackTrace(); 
			}
		}
	}
	
	public void Delete(Customer id)throws TotalBuyException{
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement("delete from customers where id=?");
			ps.setString(1,id.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	public Customer get(String id) throws TotalBuyException{
		Connection con= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Customer c=null;
		try {
			con = DriverManager.getConnection(url, user, password);
			if(con!=null)System.out.println("連線成功");
			else System.out.println("連線失敗");
			ps = con.prepareStatement("select id, name, password, gender, email,birth_date, address, phone,married,"
            + " blood_type, status, discount, type from customers where id=?");
			ps.setString(1,id);
			rs = ps.executeQuery();
			while(rs.next()){
				String type = rs.getString("type");
				if(type.equals("VIP")){
					c = new VIP();
				}else{
					c = new Customer();
				}
				c.setId(rs.getString("id"));
				c.setName(rs.getString("name"));
				c.setPassword(rs.getString("password"));
				c.setGender(rs.getString("gender").charAt(0));
				c.setEmail(rs.getString("email"));
				c.setBirthDate(rs.getDate("birth_date"));
				c.setAddress(rs.getString("address"));
				c.setPhone(rs.getString("phone"));
				c.setMarried(rs.getBoolean("married"));
				String btype = rs.getString("blood_type");
				if(btype!=null){
					c.setBloodType(BloodType.valueOf(btype));
				}
				c.setStatus(rs.getInt("status"));
				if(c instanceof VIP){
					((VIP) c).setDiscount(rs.getInt("discount"));
				}
				
				
			}
		} catch (SQLException e) {
			System.out.println("客戶查詢失敗" + id + e.getErrorCode());
			
		}finally{
			
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("資源關閉失敗" + e.getErrorCode());
				e.printStackTrace(); 
			}
		}
		
		
		return c;
	}
	
	public List<Customer> getAll()throws TotalBuyException{
		Connection con = null;
		PreparedStatement ps = null;
		List<Customer> list = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement("SELECT id,name, password, gender, email,birth_date, address, phone,married,"
            + " blood_type, status, discount, type from customers");
			rs = ps.executeQuery();
			while(rs.next()){
				Customer c;
				String type = rs.getString("type");
				if(type.equals("type")){
					c=new VIP();
				}else{
					c=new Customer();
				}
				
				c.setId(rs.getString("id"));
				c.setName(rs.getString("name"));
				c.setPassword(rs.getString("password"));
				c.setGender(rs.getString("gender").charAt(0));
				c.setEmail(rs.getString("email"));
				c.setBirthDate(rs.getDate("birth_date"));
				c.setAddress(rs.getString("address"));
				c.setPhone(rs.getString("phone"));
				c.setMarried(rs.getBoolean("married"));
				String btype = rs.getString("blood_type");
				if(btype!=null){
					c.setBloodType(BloodType.valueOf(btype));
				}
				c.setStatus(rs.getInt("status"));
				if(c instanceof VIP){
					((VIP) c).setDiscount(rs.getInt("discount"));
				}
				if(list==null){
					list = new ArrayList<>();
				}
				list.add(c);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("資源關閉失敗" + e.getErrorCode());
				e.printStackTrace(); 
			}
		}
		
		return list;
	}
	public static void main(String[] args) {
		TestJDBC t = new TestJDBC();
		Customer c = null;
		try {
			
			c = new VIP("A444444444","凱莉","123456",'F',"a123@yahoo.com");
			
			//t.insert(c);
			System.out.println(t.get("A123456789"));
			//Customer c = new Customer("A222222222","山姆","123456","a123@yahoo.com");//必要欄位還是要填
			//Customer c1 = new Customer("A246810111","山姆","123555","021111");
			//t.Update(c);
			//Customer c2 = new Customer("A22222222");
			//t.Delete(c2);
			
			//System.out.println(t.getAll());
		} catch (TotalBuyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
