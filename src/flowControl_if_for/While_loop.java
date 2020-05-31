package flowControl_if_for;

public class While_loop {
/*
 while-loop 是重複與反複的意思，在程式中當條件為true即不斷反覆執行的迴圈，直到控制項傳回false為止。
 基本板型:
 while(boolean-expression)布林-表達式，true就進入，false就離開
 	程式執行區塊 statement陳述
 */
	public static void main(String[] args) {
		// break與continue
		int i =0;
		while(i<5){//(true)為無限迴圈
			System.out.println(i);
			i++;
			if(i==3){
			System.out.println("continue");
			continue;//直接執行下一個wile判斷
			}
			if(i==4){
			System.out.println("break");
			break;//強制跳離while-loop
			}
			
		}

	}

}
