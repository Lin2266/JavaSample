package primitiveType;
//long的宣告方式
public class LongType {
	/*
	資料類別		資料型態		位元組數(bytes)	位元數(bits)		資料範圍						初始值
	整數			long		8				64				-2的63次方~2的63次方-1		0L
	*/
	public static void main(String[] args) {
		//long l1=2147483648;	//整 數值的預設資料型態是int,當資料範圍超出int的最大值時，會編譯錯誤
		long l2=2147483648L;		//當int資料範圍超出時，將int(32bits)轉換成long(64bits)，值後面加L或l
		int i=2000000000;
		int i2=2000000000;
		System.out.println(i+i2);//加起來超過資料範圍，超出記憶體範圍資料就會溢出導致數值亂掉
		
	}

}
