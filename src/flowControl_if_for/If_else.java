package flowControl_if_for;

//if-else流程敘述
public class If_else {
	/*
	 if-else其實在程式執行中是很費時的，會一直判斷到條件成立為止，後面的就不會在判斷了，尤其是else if，
	 每一個判斷句都要執行判斷，巢狀式敘述很符合邏輯， 但卻浪費許多執行時間，尤其是外層又包了Loop迴圈
	 */

	public static void main(String[] args) {
		// 在if()判斷句中只能是布林值
		int a = 0;
		if(a==0){//非布林值要用"=="判斷是不是相等，使用"="指派運算子會編譯錯誤	
			System.out.println("進入點1");
		}
		
		boolean b = true;
		if(b=false){//布林值時可以使用"="指派運算子，b不等於false所以無法執行裡面的內容
			System.out.println("進入點2");
		}
		
		//精簡式流程敘述，若if及else的程式執行區塊只有一行則Begin(開始)"{"與End(結束)"}"區塊符號可以不加
		if(a>0)
			System.out.println("精簡進入點1");//精簡式執行區塊只能有一行
		//System.out.println("多一行");//多寫一行時會編譯錯誤，除非用{}括起來
		else
			System.out.println("精簡進入點2");
		System.out.println("這行已不屬於if-else區塊了");//合法

	}

}
