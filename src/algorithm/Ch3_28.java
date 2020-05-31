package algorithm;

/*撰寫演算法的五點原則:
 * 1.輸入:不一定要有輸入
 * 2.輸出:至少一個輸出(輸入(原始資料)->處理(程式)->輸出(有用的資訊)
 * 3.明確性:如Algorithm()方法例題
 * 4.有限性:不能有無窮迴圈，必須能終止執行，在有限的步驛內完成
 * 5.正確性:演算法是解決問題的方法，正確性是最基本的要求，Algorithm()方法的3.改N為奇數，就變成不正確性
 */
public class Ch3_28 {
	
	/*
	 * 奇數偶數:
	 * 1.輸入一個正整數N
	 * 2.如果N除以2，其餘數為0
	 * 3.則其N為偶數
	 */
	public static void addNumber(int number){
		if(number % 2 == 0){
			System.out.println("偶數");
		}else{
			System.out.println("奇數");
		}
	}

	public static void main(String[] args) {
		addNumber(2);

	}

}
