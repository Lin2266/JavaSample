package array;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		//將陣列a資料，完全複製到陣列b
        int[] a = {11,22,44,33,88};
        int[] b = new int[3];
        System.out.println("記憶體位置1:" + b);
        
        //方法三:Arrays.copyOf()傳回和來源陣列內容大小一樣的陣列
        //b = Arrays.copyOf(a, a.length);
        
        //方法二:如果a不等於b，那麼b會建立一個int[]，a.lenght長度會複製在int[]裡面
        if(a.length != b.length)
            b = new int[a.length];
        //(來源物件，int來源，目的物件，int目的, int長度(lenght)
        System.arraycopy(a, 0, b, 0, a.length);
        
        
        System.out.println("a的記憶體位置:" + a);
        System.out.println("記憶體位置2:" + b);//b複製完會存在一個新的記憶體
        
        System.out.printf("b = %s \n", Arrays.toString(b));

	}

}
