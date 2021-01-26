package algorithm.classCh;

//後測試迴圈，do-while先執行迴圈，再判斷條件，至少會執行一次迴圈，條件式後面必須要加上「;」，前測試迴圈的while則不需要
public class Ch4_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1,total = 0;
		do{
			total = total + i;
			i++;
		}while(i<=10);
		System.out.println(total);

	}

}
