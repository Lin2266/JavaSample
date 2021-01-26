package algorithm.classCh;

//前測試迴圈，while先判斷條件式，再執行迴圈，求1+2+3+...+10
public class Ch4_51 {

	public static void main(String[] args) {
		int i=1,total=0;
		while(i<=10){
			total=total+i;
			i++;
		}
		System.out.println(total);

	}

}
