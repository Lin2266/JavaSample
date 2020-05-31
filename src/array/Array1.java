
package array;

//array是物件參考型別reference type

import java.util.Arrays;

public class Array1 {
    //reference與obj參照同一個物件
    public static void getReference(String[] reference){
        //兩種輸出陣列內容方法
        for(String s: reference){
            System.out.println(s + " ");
        }  
        System.out.println(Arrays.toString(reference));
    }
    public static void main(String[] args) {
       String[] obj = {"Java","SCJP 7.0"};
        getReference(obj);//傳遞obj參考值
        char[] data = new char[5];
		//data=new char[5];這句宣告跟上面的宣告一樣，有多少個長度
		data[0]='a';
		data[1]='b';
		data[2]='c';
		data[3]='d';
		data[4]='e';
		System.out.println(data[1]);
    }
    
}
