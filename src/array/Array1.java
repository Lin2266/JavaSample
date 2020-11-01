
package array;

import java.util.Arrays;

public class Array1 {
   
    public static void main(String[] args) {
    	//array是物件參考型別reference type
    	//宣告第1種寫法
    	int[] A = new int[] {1,2,3,4,5};
    	//or
    	int AA[] = {1,2,3,4,5};
    	
    	//宣告第2種寫法
    	//先宣告，後再指定初值時，必須要指定陣列大小,如[5]
    	int[] B = new int[5];    	
    	A[0]=1;
    	A[1]=2;
    	A[2]=3;
    	A[3]=4;
    	A[4]=5;    	
    	
    	System.out.print("第1種輸出方法:");
    	for(int i=0;i<A.length;i++) {
    		System.out.print(A[i]);
    	}
    	
    	System.out.print("\n第2種輸出方法:");
    	for(int array: A) {
    		System.out.print(array);
    	}
    	
    	System.out.print("\n第3種輸出方法:" + Arrays.toString(A));
    	      
    }
    
}
