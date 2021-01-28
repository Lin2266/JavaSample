package algorithm;

public class Extremum2 {

	public static void main(String[] args) {
		//找極值，6位數
		int a=61,b=2,c=3,d=4,e=5,f=6;
		int Max=0;
		int name='a';
		
		System.out.printf("原數列 a=%d,b=%d,c=%d,d=%d,e=%d,f=%d\n",a,b,c,d,e,f);
		
		if(a>b) {
			Max=a;
			System.out.printf("a>b Max為%c \n",name);
		}else {
			Max=b;
			name='b';
			System.out.printf("b>a Max為%c \n",name);
		}
		
		if(Max>c) {
			Max=Max;
			System.out.printf("Max>c find Max為%c Max=%d \n",name,Max);
		}else {
			Max=c;
			name='c';
			System.out.printf("c>Max find Max為%c Max=%d \n",name,Max);
		}
		
		if(Max>d) {
			Max=Max;
			System.out.printf("Max>d find Max為%c Max=%d \n",name,Max);
		}else {
			Max=d;
			name='d';
			System.out.printf("d>Max find Max為%c Max=%d \n",name,Max);
		}
		
		if(Max>e) {
			Max=Max;
			System.out.printf("Max>e find Max為%c Max=%d \n",name,Max);
		}else {
			Max=e;
			name='e';
			System.out.printf("e>Max find Max為%c Max=%d \n",name,Max);
		}
		
		if(Max>f) {
			Max=Max;
			System.out.printf("Max>f find Max為%c Max=%d \n",name,Max);
		}else {
			Max=f;
			name='f';
			System.out.printf("f>Max find Max為%c Max=%d \n",name,Max);
		}

	}

}
