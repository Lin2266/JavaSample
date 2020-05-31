
package Collection_Generics;

import java.util.ArrayList;
import java.util.Iterator;

//限制型別參數<A extends 類別名稱>
//這樣的定義是為了不讓萬用字元 ? 出現在程式碼中，而用A來定型，用AA或BBB都可以，因為只是一個標示符號
public class Generics10 {
    //sum()使用了<A extends Number>來修飾，在編譯時期會自行判斷所傳進來的物件變數v是否符合A這個資料型態
    //sum()方法中可以直接使用<A>這個定型參數來宣告
    static <A extends Number> int sum(ArrayList<A> v){
        int sum = 0;
        Iterator<A> it = v.iterator();
        while(it.hasNext()){
            sum += it.next().intValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(100);
        v.add(200);
        v.add(300);
        System.out.println("總合 = " + sum(v));
    }
    
}
