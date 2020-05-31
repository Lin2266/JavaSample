package flowControl_if_for;
//for-loop與逗號(,)運算子
public class For_loop3 {
	/*逗號(,)在for-loop迴圈中是用來分隔敘述句，只限定在initialization與stepping區段中，
	  for(;;)會無窮迴圈，for-loop中的2個分號(;)是不能省略，initialization與stepping敘述若不止一個可用逗號分隔
	
	 */
	public static void main(String[] args) {
		
		//合法，initialization區塊中宣告「int i=0,j=0」表示變數i跟j的資料型別皆為int
		for(int i=0,j=0;i<5;i++){
			}
		
		//錯誤，第二個變數不可在initialization區塊中自行定義資料型別
//		for(int i=0,long j=0;i<5;i++){
//			}
		
		//合法，i跟j可以在for-loop外部自行定義，且資料型別可以不相同
		int i=0;
		long l=0;
		for(i=0,l=0;i<5;i++,l++){
			System.out.println("i是int" + i + "," + "l是long" + l);
		}
		
		//錯誤，j必須在外部定義
//		int ii =0;
//		for(ii=0,int j=0;i<5;ii++){	
//		}
		char c = 'a';
		String s =null;
		int i2 =0;
		for(i2=1,s="a";i2<5;i2++,c++){//s++會編譯錯誤，只能放基本型態
			System.out.println("合法，for-loop的初始化可以放字串型態" + i2 + c);//c++時，會從'a'.'b'.往下加
		}
		
		//stepping中的逗號(,)運算子
		for(int i3=0,j=0;i3<5;i3++){
			System.out.println("可以多個初始化跟步進敘述" + i3 + j);
		}

	}

}
