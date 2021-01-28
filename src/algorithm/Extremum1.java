package algorithm;

public class Extremum1 {
	
	public static void main(String[] args) {
		//找極值，3位數
		int c=100,a=20,b=885;
		int Max=0; //最大值
		char name='a';
		System.out.printf("原數列a=%d,b=%d,c=%d\n",a,b,c);
		//a跟b先比較大小，在跟c比較
		if(a>b) {			
			Max=a;
			System.out.printf("a>b Max為%c\n",name);
		}else {			
			Max=b;
			name='b';
			System.out.printf("b>a Max為%c\n",name);
		}
		//a或b跟c比較
		if(Max<c) {
			System.out.printf("find Max為c Max=%d\n",Max);
			Max=c;
		}else {
			//用name判斷是a或b
			System.out.printf("find Max為%c Max=%d\n",name,Max);
			Max=Max;
		}

	}

}