package algorithm;

//break(切斷) 用來中斷程式的執行動作，會使程式強迫跳離迴圈，繼續執行迴圈外下一個敘述
public class Ch4_55 {

	public static void main(String[] args) {
		//1+2+3+...+10的程式中加入break
		int sum=0;
		for(int i = 1;i <= 10;i++){
			if(i>5)break;//直接中斷離開迴圈
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
