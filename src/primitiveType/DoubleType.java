package primitiveType;

import java.math.BigDecimal;

//double的宣告方式
public class DoubleType {
	/*
	資料類別		資料型態		位元組數(bytes)	位元數(bits)		資料範圍					初始值
	浮點數		double		8				64				-1.7E+308~1.7E+308		0.0D
	*/
	public static void main(String[] args) {
		double d1=2.5f;			//前面大的資料型態字面值可以容小的資料型態，前面小的不能容大的字面值
		double d2=10e4;			//科學記號表示104=100000.0 (10往左移4位=右邊補4個0)
		double d3=10e-4;		//0.001 (10.000=1往右移4位)
		System.out.println(d2);
		System.out.println(d3);
		/*float與double的乘法與除法運算結果均為「近似值」
		  IEEE 754 floating-point arithmetic(二進制浮點數算術標準)float與double採二進制分數與指數來表示小數位
		 */
		double x=0.3+0.3+0.3;		
		System.out.println(x);		//0.8999999999999999
		System.out.println(x==0.9);	//false
		//讓浮點數明確的計算出真正的數值,可使用java.math.BigDecimal類別所提供的方法來運算
		BigDecimal b = new BigDecimal("0.3");//字串
		b=b.add(b).add(b);
		System.out.println(b.doubleValue()==0.9);//用字串解析相加時才會true，整數時會false
	}

}
