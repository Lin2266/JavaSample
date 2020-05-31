package GarbageCollection;

public class GC1 {
	/*
	 (1)物件不用時最好顯式置為Null

　　一般而言,為Null的物件都會被作為垃圾處理,所以將不用的物件顯式地設為Null,有利於GC收集器判定垃圾,從而提高了GC的效率。

　　(2)儘量使用StringBuffer,而不用String來累加字串

　　由於String是固定長的字串物件,累加String物件時,並非在一個String物件中擴增,而是重新建立新的String物件,如Str5=Str1 Str2 Str3 Str4,這條語句執行過程中會產生多個垃圾物件,因為對次作“ ”操作時都必須建立新的String物件,但這些過渡物件對系統來說是沒有實際意義的,只會增加更多的垃圾。避免這種情況可以改用StringBuffer來累加字串,因StringBuffer是可變長的,它在原有基礎上進行擴增,不會產生中間物件。

　　(3)能用基本型別如Int,Long,就不用Integer,Long物件

　　基本型別變數佔用的記憶體資源比相應物件佔用的少得多,如果沒有必要,最好使用基本變數。

　　(4)儘量少用靜態物件變數 
	 */
	public class GcTest {
		private String name;
		
		public GcTest(String name) {
			this.name = name;
			System.out.println(name + "建立");
		}
		
		//物件回收前執行,Java提供了預設機制來終止該物件心釋放資源，這個方法就是finalize（）
		//finalize()方法返回之後，物件消失，垃圾收集開始執行。
		protected void finalize() {
			System.out.println(name + "被回收");
		}
	}

	public static void main(String[] args) {
		//少用String,用String buffered
		
		System.out.println("請按Ctrl + C 終止......");
		
		GcTest obj1 = new GC1().new GcTest("object1");
		GcTest obj2 = new GC1().new GcTest("object2");
		GcTest obj3 = new GC1().new GcTest("object3");
		
		//令名稱不參考至物件
		obj1 = null;
		obj2 = null;
		obj3 = null;
		
		System.gc();
		
		//while(true);//不斷執行program, 實際試感覺不出加這段有什麼差異

	}

}
