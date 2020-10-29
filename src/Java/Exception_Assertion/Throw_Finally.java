package Java.Exception_Assertion;

public class Throw_Finally {

	public static void main(String[] args) {
		try{
			int i[] = {1,2};
			if(i.length == i.length)
				throw new Exception("拋測試");
		}catch (Exception e) {
			System.out.println("XX");
		}finally {
			System.out.println("finally");
		}

	}

}
