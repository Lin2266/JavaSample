package primitiveType;
	//char的宣告方式
public class CharType {
	/*
	資料類別		資料型態			位元組數(bytes)		位元數(bits)		資料範圍						初始值
	字元			char(Unicode)	2					16				‘\u0000’~’\uFFFF’0~65535	‘\u0000’
	*/
	 public static void main(String[] args) {
	
		 char c1='A';		//字元
		 char c2='中';		//中文字
		 char c3='\u4E2D';	//Unicode 16進位的'中'
		 char c4=20013;		//Unicode 10進位的'中'
		 char c5=65;		//ASCII(65)的'A'
		 char myArray[];	//字元陣列宣告
		 char n='\0';		//宣告一個空字元
		 char c6=10;		//斷行字元/n

		 System.out.println();
		 System.out.println();
	 
	 }
}
