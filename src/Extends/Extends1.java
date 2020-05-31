
package Extends;

//繼承關係下的建構子
public class Extends1 {
	static class Father {
		// 編譯時會產生預設建構子，所以必須看成以下:
		public Father() {
			System.out.println("父");
			aBC();// 子類別有覆寫這個方法時，會先用子類別的方法，要用父類別的就要轉型
		}

		public String aBC() {
			System.out.println("父方法");
			return "父方法";
		}

	}

	static class Son extends Father {
		// 編譯時會產生預設建構子，所以必須看成以下:
		public Son() {//子類有無參數建構子，父類沒有會編譯錯誤，父類必須加無參數建構子
			// 但繼承關係，預設時java會在第一行加入super();呼叫父類的無參數建構子
			super();

			System.out.println("子");
		}

		public String aBC() {
			System.out.println("子方法");
			return "子方法";
		}

	}

	public static void main(String[] args) {
		//使用無參數建構子，會先呼叫super到父類別的建構子，在使用自已的建構子
		Son son = new Son();

	}

}
