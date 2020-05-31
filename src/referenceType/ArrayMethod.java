package referenceType;
//陣列常用方法
public class ArrayMethod {

	public static void main(String[] args) {
		//isArray()用來判斷該物件變數所指向的實體是否是陣列型態
		int[][] array2d = {{0,1,2},{3,4,5,6}};
		System.out.println(array2d.getClass().isArray());
		System.out.println(array2d[0].getClass().isArray());
		
		//arraycopy()陣列複製，System.arraycopy(來源, 起始索引, 目的, 起始索引, 複製長度);
		int [] array = {1,2,3,4,5};
		for(int arraycopy: array){
			System.out.print(arraycopy);
		}
		System.out.println();
		System.arraycopy(array, 2, array, 1, 2);//將array索引2複製到array索引1，複製長度為2
		//13445，將array索引2(3)開始到3(4)長度為2，複製到目的array索引1(3)2(4)
		for(int arraycopy: array){
			System.out.print(arraycopy);
		}
		System.out.println();
		
		//把array陣列全部複製到i
		int[] i = new int[array.length];
		System.arraycopy(array,0, i, 0, array.length);
		for(int arraycopy1: i){
			System.out.print(arraycopy1);
		}
		
	}

}
