package algorithm;

//九九乘法表
public class Ch4_48 {

	public static void main(String[] args) {
		for(int i = 1;i <= 9;i++){
			for(int j = 1;j <= 9;j++){
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}

	}

}
