package primitiveType;


public class ValueOf1 {

	public static void main(String[] args) {
		short a = 100;
		int b = 200;
		long c = 500l;
		float d = 3.5f;
		double e = 4.8d;
		String s1,s2;
		
		//數字轉字串
		s1 = String.valueOf(a+b);
		System.out.println("a+b:" + s1);
		s1 = String.valueOf(a);
		System.out.println("a:" + s1);
		s1 = String.valueOf(b);
		System.out.println("b:" + s1);
		s1 = String.valueOf(a+b) + String.valueOf(a) + String.valueOf(b);
		System.out.println("(a+b)+a+b:" + s1);
		s2 = Float.toString(d);//返回字串
		System.out.println("Float.toString:" + s2);
		s2 = Double.toString(e);
		System.out.println("Double.toString:" + s2);
		s2 = Float.toString(d)+Double.toString(e);
		System.out.println("Float.toString + Double.toString:" + s2);
		

	}

}
