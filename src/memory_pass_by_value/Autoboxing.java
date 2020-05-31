package memory_pass_by_value;

public class Autoboxing {
	public static void eatAnything(Object obj){
		System.out.println("I eat " + obj);
	}
	public static void main(String[] args) {
		int primitiveInt = 12345;
		/*
		  eatAnything 吃下去的實際上已經是 Java 自動幫你建立的 Integer 物件的 Reference，
		   而不是原本的 primitive type 的整數了。
		   eatAnything(new Integer(primitiveInt));
		 */
		
		eatAnything(primitiveInt);

	}

}
