package Java.lang.Class1;

import Java.sql.Customer;

public class Class1 {
	 public class ClassDemo{
		 
	 }

	public static void main(String[] args) {
		Customer c = new Customer();
		System.out.println(c.getClass());//class Java.sql.Customer
		System.out.println(c.getClass().getSimpleName());//取得物件的簡單名稱:Customer
		System.out.println(c.getClass().getName());//取得物件的Class完整名稱:Java.sql.Customer
                
                System.out.println("=================================================");
                
                System.out.println(c.getClass().getTypeName());//取得getClass物件型態:Java.sql.Customer
		System.out.println(c.getClass().getSimpleName().getClass().getTypeName());//取得getClass().getSimpleName()物件型態:java.lang.String
		System.out.println(c.getClass().getName().getClass().getTypeName());//取得getClass().getName()物件型態:java.lang.String
	
	}

}
