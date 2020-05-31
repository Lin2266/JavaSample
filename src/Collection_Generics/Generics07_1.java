
package Collection_Generics;

import java.util.List;
import java.util.Vector;

//不同型別參數解決方法在 Generics8 <?>萬用字元
public class Generics07_1 {

    public static void main(String[] args) {
        //在v的觀點，所有的元素內容都應該是Integer型別的資料，所以v使用v.get(1)時，
        //發生了執行時期物件轉換的例外(ClassCastException)
        
        Vector<Integer> v = new Vector<>();
        v.add(100);
        List v5 = v;
        v5.add("Java");
        System.out.println(v5);
        Integer i = v.get(0);//i=100
        Integer k = v.get(1);//型別轉換例外，發生執行時期錯誤
        System.out.println(k);
    }
    
}
