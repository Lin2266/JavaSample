package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda3 {
	
	/*
	 只要寫方法名稱就好了嗎？甚至連參數也不用傳！是的，Lambda允許這種類型的語法存在，但必須要明確指定方法名稱
	 是在哪個類別或是哪個物件之下，而且最後一個「.」要改成「::」。
	 */
	
	interface B {
		 
		public void doStringWork(String s);
	}
	 
	interface C {
	 
		public double doComputeWork(float x, float y);
	}
	
	public Lambda3() {
		B b = this::printOnce;
		b.doStringWork("哈囉");
	}
	public static void printTwice(String s) {
		System.out.print(s);
		System.out.println(s);
	}
 
	public void printOnce(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = Lambda3::printTwice;
		b.doStringWork("嗨");
		new Lambda3();
 
		C c = Math::pow;
		b.doStringWork(String.valueOf(c.doComputeWork(2.5f, 2)));
		//這樣的結構雖然可以使得程式變得非常精簡，卻也不易閱讀。這種撰寫方式，實際上常與forEach搭配，如下：
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("5");
		list.add("4");
		list.forEach(System.out::print);
	}

}
