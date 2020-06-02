package constructor;
//預設建構子
public class DefaultConstructor1 {
/*
 類別裡面一定要有建構子
 預設建構子有五個特點:
 1.每一個class最多只能有一個預設建構子
 2.程式中若沒有定義建構子，在編譯時期會自動加入，所加入的就稱之為預設建構子
 3.預設建構子的存取權限與類別的存取權限相同
 4.預設建構子沒有參數列
 5.除了初始成員變數或繼承時super()的定義外，預設建構子基本上是沒有其他的程式敘述
 */
	
	int k =10;//給初值時
	//int k; 反組譯時會變成這樣1
	public DefaultConstructor1(){
		//k=10; 反組譯時會變成這樣2
	}
	
	public static void main(String[] args) {
		

	}

}
