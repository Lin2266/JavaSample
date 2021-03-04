package Lambda;

public class Lambda2 {
	/*
	 其中 @FunctionalInterface ，此注解是提醒編譯器，檢查該介面是否只有一個抽象方法，若不只一個的話，
	 違反規則則會畫紅色蚯蚓線，提醒開發者，需進行調整。另外也可以防止未來自己或其他開發者，不小心增加方法，
	 破壞了 Lambda 定義的 Functional Interface 即 SAM (Single Abstract Method interfaces)介面。方法介面一定是 Interface 且裡面只能有一個抽象方法。
	 */
	@FunctionalInterface
	public interface MyCalc {
	    void exec(int a, int b);
	}

	public static void main(String[] args) {
		//===傳統寫法===
		MyCalc calc1 = new MyCalc() {
			
			@Override
			public void exec(int a, int b) {
				System.out.println("calc1: " + (a + b));				
			}
		};
		calc1.exec(1, 2);
		
		//===Lambda寫法===
		MyCalc calc2 = (a,b)->System.out.println("calc2: " + (a + b));
		calc2.exec(1, 2);

	}

}
