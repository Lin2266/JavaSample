package constructor;
//建構子
public class Constructor {
/*
 建立物件時，除了在記憶體中配置一塊存放物件的區塊之外，同時也會執行建構子函式，建構子是物件建立時所執行的第一
 個函式，通常設定物件在被引用前所應載入的一些設定以初始化內部物件狀態，建構子在宣告時有二個特性:
 1.沒有回傳值，建構子方法簽章中不可以有void修飾字
 2.必須與類別名稱相同
 語法:
 存取權限 類別名稱 (參數列){
  	程式區塊
 }
 存取修飾:四種都可以用
 修飾子:0, 不可用:static,final,synchronized 
 */
	//無參數建構子
	Constructor(){
		System.out.println("執行 Constructor() 建構子");
	}
	//有參數建構子
	Constructor(String s){
		System.out.println("Java" + s);
	}
	
	
	public static void main(String[] args) {
		//建立物件時指派給一個物件變數c，為的是在之後的程式碼中可以利用c來操控所指向的物件實體
		Constructor c = new Constructor("7");
		//單純地建立一個物件實體與執行建構子
		new Constructor();
		

	}

}
