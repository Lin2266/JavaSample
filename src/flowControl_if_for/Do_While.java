package flowControl_if_for;


public class Do_While {
	/*
	 do-while與while迴圈的差別在於，while會在執行程式區塊前先判斷布林條件是否成立，當回傳值為true時才會執行while
	 區塊，反之則否;do-while回圈則是先執行程式區塊後才判定while布林條件，以決定是否要執行下一次while程式區塊，
	 不論布林條件是否成立，至少會執行一次while程式區塊。
	 do{
	 	程式執行區塊 statement
	 	}while(boolean-expression); <--分號一定要加
	 
	 */
    public static void main(String[] args) {
        int ii = 2;
        int vv = 4;
        do{
            //int vv = 4;//區域變數，while判斷句是在區塊外，判斷句的變數的vv會無效，編譯錯誤
            System.out.println((ii));
            ii++;
        }while(ii < vv);
    }
    
}
