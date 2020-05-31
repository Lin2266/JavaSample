
package flowControl_if_for;

//char跟String
public class Switch_Case1 {

	public static void main(String[] args) {
		char c = 'A';
		final int a = 5;//常數變數可以直接放在case做判斷
		switch (c) {
		case 1:
			System.out.println("50000");
			break;
		case '1':
			System.out.println("40000");
			break;
		case 'A':
			System.out.println("30000");
			break;
		case a://比對子只能放常數的變數，反組譯時，a=5，所以下面的5會跟a重複到
			System.out.println("10000");
			break;
//		case 5://編譯錯誤，因為final變數a的內容被硬編譯成5
//			System.out.println("0");
//			break;
		
		}
		//switch用字串陣列也可以加迴圈使用
		String[] s = { "a", "b", "c" };
		for (String ss : s) {
			switch (ss) {
			case "a":
				System.out.println("a");
				break;
			case "b":
				System.out.println("b");
				break;
			case "c":
				System.out.println("c");

			}
		}
	}

}
