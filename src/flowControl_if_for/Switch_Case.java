package flowControl_if_for;

//switch-case 選擇性流程敘述
public class Switch_Case {
	/*
	 switch(x)中的x運算過後的值只能是byte、char、short、int、String(7開始支援)、Wrapper、Enumerated Type
	 
	 if-else其實在程式執行中是很費時的，會一直判斷到條件成立為止，後面的就不會在判斷了，尤其是else if，
	 巢狀式敘述很符合邏輯，但卻浪費許多執行時間，尤其是外層又包了Loop迴圈，這時就可以使用switch-case來做控制
	 */

	public static void main(String[] args) {
		//包裝型態，javac會自動將switch(x)改寫成switch(i.intValue())(拆箱)之後再進行編譯
		Integer j = new Integer(1);
		Integer i = 2;
		switch (j) {
		case 1://比對子
			System.out.println("第1名");//符合case 1的程式區塊，執行內容
			break;//中斷來跳出switch-case敘述流程，程式不會繼續執行其他case下的程式區塊
		case 2:
			System.out.println("第2名");
			break;
		default://default代表無任何case符合條件，有點類似else功能
			System.out.println("error");
			break;
		}
		//整數型態
		int weekday = 8;
		//(weekday)與case比對是利用int值來相互比較的，所以可以直接放8進去
		switch (weekday) { //反組譯時 switch(weekday.hashCode()) -> switch(123)
		case 1://反組譯時 case 123: 只用hashCode()判斷也會有風險
			//反組譯時 if(weekday.equals(8))  所以要配合equals()
			System.out.println("half");
			break;
		case 2:
			System.out.println("full");
			break;
		default:
			System.out.println("error");
			break;

		}

	}

}
