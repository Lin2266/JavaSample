package overriding;

import java.io.IOException;

//覆寫
public class Overriding {
/*
覆寫的限制與注意事項:
1.覆寫是發生在有繼承關係的類別體系中
2.覆寫的方法名稱宣告必須相同
3.若方法有回傳值，其回傳型態必須相同或是原方法傳回值型別的子類別
4.方法中的參數列都必須相同(不論數量、資料型別、擺放順序)
5.存取權限不可小於原方法，只可以大於或等於，不然會編譯錯誤
6.當父類別方法的方法簽章有拋出例外事件，子類別覆寫方法的方法簽章可以選擇是否要拋出例外，若還擇要拋出例外該
例外類別必須:
	a.與原方法相同
	b.原方法例外事件類別的子類別

 */
	
	class Father{
		void method(){
			System.out.println("呼叫父類別的method！");
		}
		//方法中有修飾例外事件的覆寫
		void method1() throws Exception{
			
		}
	}
	
	class Son extends Father{
		@Override
		void method(){
			System.out.println("呼叫子類別的method！");
		}
		@Override
		void method1() throws IOException{//必須是同型態或子類別，也可以不丟出例外
			
		}
	}
	public static void main(String[] args) {
		Overriding.Son s = new Overriding().new Son();//調用內部類別的寫法
		s.method();
		
		try{
			s.method1();//方法中有拋出例外，所以要try-catch，或者是在main方法上面拋出例外
		}
		catch(IOException io){
			
		}

	}

}
