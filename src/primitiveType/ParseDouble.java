package primitiveType;

import java.util.Scanner;

public class ParseDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		System.out.println("請輸入一個字元:");
		char c = sc2.next().charAt(0);
		System.out.println("===========================");
		
		System.out.println("求X的3次方，請輸入X:");
		short s = Short.parseShort(str1);
		System.out.println("short:" + (s*s*s));
		int i = Integer.parseInt(str1);
		System.out.println("int:" + (i*i*i));
		System.out.println("===========================");
		double d = Double.parseDouble(str1);
		System.out.println("double:" + (d*d*d));
		float f = Float.parseFloat(str1);
		System.out.println("float:" + (f*f*f));
		System.out.println("===========================");
		
		
		
		

	}

}
