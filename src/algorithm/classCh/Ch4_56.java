package algorithm.classCh;

//continue(繼續)是強迫程式跳到迴圈的起頭
public class Ch4_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		for(int i = 1;i <= 10;i++){
			if(i>5)continue;//>5以後的都會跳離開回到起頭，直到終值條件為止
			num = num + i;
		}
		System.out.println(num);

	}

}
