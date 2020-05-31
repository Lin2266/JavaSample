package operator;
//指定運算子
public class Assignment {

	public static void main(String[] args) {
		//一般的算法
		int a = 2;
		a = a*2-3;//先乘除後加減
		System.out.println(a);//1
		
		//指定運算子的算法
		int b = 2;
		b *= 2-3;//2-3執行完才會 做+=
		System.out.println(b);//-2

	}

}
