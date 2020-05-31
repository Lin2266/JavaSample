package Java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestJDBC1 {
	private final static String url = "jdbc:mysql://localhost:3306/totalbuy?";
	private final static String user = "lin";
	private final static String password = "root";
	
	private final static String insert = "insert into customers(id,name,password,gender,email,"
			+ "birth_date,address,phone,married,blood_type,status,discount,type)"
			+ "value(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private final static String update = "update customers set name=?,password=?,gender=?"
			+ ",email=?,birth_date=?,address=?,phone=?,married=?,blood_type=?,status=?,"
			+ "discount=?,type=? where id=?";
	private final static String delete = "delete from customers where id=?";
	private final static String getAll = "select * from customers";
	private final static String get ="select id, name, password, gender, email,birth_date, address, phone,married,"
            + " blood_type, status, discount, type from customers where id=?";
	
	public void insert(Customer data) throws TotalBuyException{
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(insert);
			
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
			System.out.println("新增客戶失敗" + e.getCause());
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("關閉資源失敗");
				e.printStackTrace();
			}
		}
	}
	
	public void update(Customer data)throws TotalBuyException{
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con=DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(update);
			
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
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("修改會員失敗" + e.getCause());
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("關閉資源失敗" + e.getCause());
				e.printStackTrace();
			}
		}
	}
	
	public void delete(String id)throws TotalBuyException{
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(delete);
			ps.setString(1,id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Customer get(String id)throws TotalBuyException{
		Connection con = null;
		PreparedStatement ps = null;
		Customer c = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(get);
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
			System.out.println("查詢客戶資料失敗" + e.getErrorCode());
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("關閉資源失敗");
				e.printStackTrace();
			}
			
		}
		
		return c;
	}
	
	public List<Customer> getAll()throws TotalBuyException{
		List<Customer> list = null;
		Connection con = null;
		PreparedStatement ps = null;
		Customer c = null;
		ResultSet rs = null;
		
		
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(getAll);
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
				if(list == null){
					list = new ArrayList<>();
				}
				list.add(c);
			}
			
		} catch (SQLException e) {
			System.out.println("查詢所有客戶資料失敗" + e.getMessage());
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("關閉資源失敗" + e.getCause());
				e.printStackTrace();
			}
		}
		
		return list;
		
	}
	public static void main(String[] args) {
		
		TestJDBC1 t = new TestJDBC1();
		Customer c = new Customer("A666666666","美麗","123456",'F',"abc@yahoo.com");
		try {
			//t.insert(c);
			//t.update(c);
			//t.delete("A666666666");
			//System.out.println(t.get("A444444444"));
			System.out.println(t.getAll());
		} catch (TotalBuyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
