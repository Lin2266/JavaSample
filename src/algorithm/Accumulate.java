package algorithm;


public class Accumulate {

	public static void main(String[] args) {
		//累加，描述1+2+3...+10的計算過程
		int total =0;
		for(int count =1;count<=10;count++){	
			total +=count;
		}
		System.out.println("從1+ ~ 10的總計:" + total);

	}

}
