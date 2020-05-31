package primitiveType;
//int的宣告方式
public class IntType {
	/*
	資料類別		資料型態		位元組數(bytes)	位元數(bits)		資料範圍								初始值
	整數			int			4				32				-2,147,483,648 ~ 2,147,483,647		0
	*/
	public static void main(String[] args) {
		int i1=1;
		int i2='A';		
		int myArray[];
		int salary=90_0000;
		//可中文相加
		int a='中';				//unicode(十進29226)			
		int b='哇';				//unicode(十進21703)	
		int e=a+b;				//c=29226+21703
		System.out.println(e);	//50929
		
		int c='A';				//ASCII(65)
		int d='B';				//ASCII(66)
		int f=c+d;		
		System.out.println(Byte.MAX_VALUE);	//131
		System.out.println(Byte.MIN_VALUE);

	}

}
