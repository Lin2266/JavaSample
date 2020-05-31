package primitiveType;
//float的宣告方式
public class FloatType {
	/*
	資料類別		資料型態		位元組數(bytes)	位元數(bits)		資料範圍					初始值
	浮點數		float		4				32				-3.4E+38~3.4E+38		0.0F
	*/
	public static void main(String[] args) {
		float f1=2147483647;			//2147483647.0(有小數點)，整數時字面值的預設是int
		float f2='A';					//65.0
		//float f3=3.14;				//編譯錯誤，當是浮點數時，字面值預設資料型態是double
		float f4=3.14f;					//利用F或f轉型
		float f5=(float)3.14;			//也可以利用(float)轉型
		float myArray[];
		float PI=3.141_592_6f;

	}

}
