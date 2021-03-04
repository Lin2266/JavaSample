package Lambda;

public class Lambda1 {
	/*
	 如果說Lambda語法是用來表示一個匿名類別的話，那就不太正確了。實際上Lambda語法只能用來表示一個
	 「只擁有一個方法的介面」所實作出來的匿名類別。

	 //第一種：沒有大括號，可以表達單行程式區塊
	(輸入參數,輸入參數,...) -> 單行邏輯程式區塊


	//第二種：大括號，可以表達多行程式區塊
	(輸入參數,輸入參數,...) -> { ... 多行邏輯程式區塊 ...}
	 
	 四種輸入參數寫法：
	第一種，無任何參數，如:
		()
	第二種，一個參數: (x)
		(x)
	第三種，多個參數並指定資料類型
		(int x,int y)
	第四種，多個參數(自動推斷資料型):
		(x,y)
	
	五種程式邏輯區塊表達式：
	第一種，無任何程式區塊:
		{}
	第二種，單行不回傳值:
		System.out.println("...");
	第三種，多行不回傳值:
		{
    		...
 			System.out.println("...");
    		...
		}
	第四種，單行，回傳值:
		x+y
	第五種，多行，回傳值:
		{
    		...程式邏輯運算...
    		x++;
			y-=x;
    		return x+y;
		}
	 
	 */
	
	public static void main(String[] args) {
		/*		 
		  查看官方 Runnable 源始碼
		@FunctionalInterface
		public interface Runnable {
    		public abstract void run();
		}
		 */
		
		//傳統寫法
		Runnable runnbale1 = new Runnable() {
		     public void run() {
		      System.out.println("匿名類別傳統寫法");
		     }
		 };
		 runnbale1.run();
		 
		 //Lambda表達式
		 Runnable runnbale2 = () -> System.out.println("匿名類別Lambda表達式");
		 runnbale2.run();

	}

}
