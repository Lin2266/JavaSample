package algorithm;

//敘述使用者登入帳號與密碼時，系統檢查過程
public class Algorithm1 {
	public static void checkId(String id,String password){
		if(id!=null && (id=id.trim()).length() == 6){
			System.out.println("帳號PASS");
		}else{
			System.out.println("請輸入對的帳號格式");
		}
		if(password!=null && (password=password.trim()).length() == 4){
			System.out.println("密碼PASS");
		}else{
			System.out.println("請輸入對的密碼格式");
		}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkId("12345","1234");
	}

}
