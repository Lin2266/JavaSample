package referenceType;
//陣列跟new
public class ArrayType1 {
/*
 宣告陣列時，可利用new關鍵字來產生陣列實體，例如:int[] i=new int[5];。new運算子會傳回一個參考(reference)，用來指向
 物件變數的實體，並為該物件在記憶體中配置一個實體的空間。
 */
	public static void main(String[] args) {
		/*
		 宣告一個int陣列其長度為10，也就是說，int陣列中可存放10組element，其物件索引範圍(維度)是從[0~9]，陣列宣告後
		 會預先在每個維度內容中給定該資料型別的初始值，以int來說，其初始值是0，所以int[]中的每一個維度初始值預設是0。
		 */
		int i[] = new int[10];//必需要宣告長度
		//修改維度內容
		i[0]=1;
		i[1]=2;
		
		//一維陣列直接給定預設內容值的宣告方式，會根據{}內元素個數(以逗號區分個別元素資料)來配置記憶體空間
		int[] a = new int[]{1,2,3,4,5};
		//int[] c = new int[5]{1,2,3,4,5};//不合法
		int[] b = {1,2,3,4,5};
		Object[] o = new Object[10];//可宣告成Object型態

	}

}
