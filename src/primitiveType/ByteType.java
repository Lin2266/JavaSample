package primitiveType;
//byte的宣告方式
public class ByteType {
	/*
	資料類別		資料型態		位元組數(bytes)	位元數(bits)		資料範圍				初始值
	整數			byte		1				8				-128 ~ 127			0
	*/
	 public static void main(String[] args) {
			
		byte b1;		//若是成員變數，系統會給定初始值0,區域變數沒給初值時，使用會編譯錯誤
		byte b2=1;	
		//b2=b1;		//編譯錯誤，沒給初值不能指派
		short s=b2;		//資料範圍小的可以轉成大的
		//b1=s;			//資料範圍大的不能轉成小的
		byte b3='A';	//ASCII的'A'字元=65
		byte b4='1';	//ASCII的'1'字元=49
		//byte b5=2.5;	//編譯錯誤，所有整數不能有小數點		
		//byte b6=255;	//編譯錯誤，超過byte的資料範圍
		byte b7=071;	//8進制071=57十進制
		byte b8=0x2F;	//16進制0x2F=47十進制
		byte b9=0b1101;	//2進制0b1101=13十進制 (JAVA 7 開始支援)
		
		byte[] Array ;	//byte陣列宣告
		System.out.println(b3);
	 }

}
