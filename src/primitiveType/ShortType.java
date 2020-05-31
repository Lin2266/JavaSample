package primitiveType;
//short的宣告方式
public class ShortType {
	/*
	資料類別		資料型態		位元組數(bytes)	位元數(bits)		資料範圍				初始值
	整數			short		2				16				-32,768 ~ 32767		0
	*/
	public static void main(String[] args) {
		short s1=1;
		short s2='A';
		short[] myArray;
		//JAVA SE 7 字面值表示式(_)只會發生在程式辜寫階段(.java)方便閱讀,在編譯程式碼(.class)時會將其抹除
		short salary=30_000;		//左邊三個一樣都是30000
		short salary2=3_0000;		
		short salary3=3_0_0_0_0;
		System.out.println(salary2);
	}

}
