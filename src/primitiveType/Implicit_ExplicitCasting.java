package primitiveType;

public class Implicit_ExplicitCasting {
	/*
	 隱含式的轉換(Implicit Casting):以較小的資料型別轉成較大的資料型別，無風險，系統會根據程式的需要自動且適時轉型
	 強行式的轉換(Explicit Casting):以較大的資料型別切割較小的資料型別，風險大，必須在程式中指定，系統不自動轉型
	 */
	public static void main(String[] args) {
		int i=1;		//將1指派給i變數(合法)，整數的字面值預設是int資料型別
		double d=0;		//宣告double d(合法)，浮點數的字面值預設是double資料型態
		d=i;			//隱含式轉換
		System.out.println(d);//1.0
		//i=d;			//不合法，大轉小要強行式轉換
		i=(int)d;		//強行式轉換
		float f;		//合法
		//f=2.5;			//不合法，浮點數的字面值預設是double，必須強行式轉換
		f=(float)2.5;	//強行式轉換後合法
		f=2.5f;			//透過F或f特定轉型字元直接轉型成float合法
		
		byte b=(byte)257; //範圍-128~127
		System.out.println(b); //答案1
		/*
		 運算從=右邊開始，257是int資料型別，他的位元組是32bits(00~(20個0)~0100000001=2次方8+2次方0=257
		 經(byte)強制型別轉換後切掉前24個bit，留下剩餘的8個bits，因為byte的資料型別內容長度是8個bits
		 00~(20個0)~01<-切掉24bit   剩8bits 00000001 -> 2的0次方=1
		 */

	}

}
