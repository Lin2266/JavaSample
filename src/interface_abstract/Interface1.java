package interface_abstract;
import java.io.IOException;

public class Interface1 {
	public static void main(String[] args) {
		Tank t = new Tank();
		t.move();
		// 要呼叫抽象方法的非抽象方法的取得方式，不能用new的
		int c = Car_abstract.getInstance();
		System.out.println("抽象類別拿到介面的屬性:" +Car_abstract.attr);
		System.out.println("抽象類別的非抽象方法取得:" + c);
	}
	

}


/*
類別存取權限與類別一樣，default,public,內部類別時無此限制，四種都可以用
介面可多重繼承多個介面類別，不能建立實體物件new，interface是完全抽象的類別，定義的方法及屬性均不能是實体的
 
 */
 interface Interface extends Runnable, Comparable<Object>, Appendable {
	// 屬性要給初值, 編譯後會固定加上public static final
	String attr = "可愛";

	// 不能有建構子，方法編譯後固定加上public abstract
	void cute();
	//void cute(){...}; 編譯錯誤，不可加上{...}實作程式區塊
	
	// 可覆寫父類方法，沒意義，子類別繼承，就會連上層的介面的方法也會一起實作
	@Override
	public int compareTo(Object o);

}

// 抽象可extends跟implements
abstract class Car_abstract extends AbstractMethodError implements Interface {
	// 一般屬性可以
	static final int a = 1;
	int b = 2;
	// abstract int c = 3; 不能有抽象屬性
	// 沒有抽象屬性跟建構子

	// 抽象方法不可以是static, abstract一定要加，不一定要有抽象方法
	public void power() {
	};

	abstract void move();

	public final static int getInstance() {
		int a = 2;
		return a;
	}
}

	// 抽象類別要用繼承來覆寫它的方法
	class Tank extends Car_abstract {

		@Override
		public void move() {
			System.out.println("坦克是用履帶走的...");
		}

		@Override
		public void cute() {
			throw new UnsupportedOperationException("Not supported yet."); // To

		}

		@Override
		public int compareTo(Object o) {
			throw new UnsupportedOperationException("Not supported yet."); // To

		}

		@Override
		public void run() {
			throw new UnsupportedOperationException("Not supported yet."); // To

		}

		@Override
		public Appendable append(CharSequence csq) throws IOException {
			throw new UnsupportedOperationException("Not supported yet."); // To
	
		}

		@Override
		public Appendable append(CharSequence csq, int start, int end) throws IOException {
			throw new UnsupportedOperationException("Not supported yet."); // To

		}

		@Override
		public Appendable append(char c) throws IOException {
			throw new UnsupportedOperationException("Not supported yet."); // To

		}

	}

	


// pet寵物, 介面繼承介面
interface Pet extends Interface {
	// 編譯後產生.class類別檔，class的內容經過jad反組譯後產生如下:
	// public static final String attr = "cute";
	String attr = "cute";

	// public abstract void skill();
	// public abstract void move();
	void skill();

	void move();
	// 可不必覆寫父類，Dog必須實作

}

// 狗實作寵物
class Dog implements Pet {
	// Interface
	@Override
	public void cute() {

	}

	// Pet
	@Override
	public void skill() {
		System.out.println("玩球");
	}

	@Override
	public void move() {
		System.out.println("跑跑跳跳");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Appendable append(CharSequence arg0) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appendable append(char arg0) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appendable append(CharSequence arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
}


	