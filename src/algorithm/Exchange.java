package algorithm;

public class Exchange {
	
	public static void main(String[] args) {
		//交換
		int temp=0;
		int a=10;
		int b=20;
		
		System.out.printf("交換前a=%d,b=%d\n",a,b);
		temp=a;
		a=b;
		b=temp;
		System.out.printf("交換後a=%d,b=%d\n",a,b);

	}

}
