package Polymorphism;
//多型與static
class A{//inner class的屬性、方法不能用static
	static String name = "A";
	
	static String greeting(){
		return "class A";
	}
}

class B extends A{
static String name = "B";
	
	static String greeting(){
		return "class B";
	}
}

public class Polymorphism2 {
	
	public static void main(String[] args) {
		// 當多型的屬性、方法有static時，會以前面的型態來調用屬性跟方法
		A b = new B();
		System.out.println(b.name + ",");//A，不是B
		System.out.println(b.greeting());//class A
	}

}
