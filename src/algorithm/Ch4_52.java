package algorithm;

//求2的多少次方才會大於1000呢
public class Ch4_52 {

	public static void main(String[] args) {
		int i = 1, sum = 2;
		while(sum <= 1000){
			sum = sum * 2;
			i++;
		}
		System.out.println("2的" + i + "次方=" + sum);

	}

}
