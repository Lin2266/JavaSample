package algorithm.classCh;

import java.util.Scanner;

//迴文判斷(12321是就顯示數字及"是迴文"，不是則印出數字及"不是迴文"
public class Ch4_44 {

	public static void main(String[] args) {
		// 宣告及初值設定
		int d1,d2=0,d3,i;
		int[] a=new int[10];
		String result;
		//輸入
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入一串數字:");
		String strNumber=in.next();
		d1 = Integer.parseInt(strNumber);
		d3=d1;
		for(i=1;i<=10;i++){
			a[i]=d1%10;//3,2(d1=12%10),1
			System.out.print(a[i]);
			d1=(int)(d1/10);//12,1,0
			System.out.print(d1);
			d2=d2*10+a[i];//3,32,321
			System.out.print(d2);
			System.out.println();
			if(d1==0)
				break;
			
		}
		if(d2==d3)
			result="是迴文";
		else
			result="不是迴文";
		//輸出
		System.out.println(d3+result);
		
		for(int aa:a){
			System.out.println(aa);
		}

	}

}
