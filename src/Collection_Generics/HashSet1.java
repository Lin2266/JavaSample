
package Collection_Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*HashSet:沒次序，不允許重複，non-thread-safe，為了提升存取效率，會以hashCode()(數學公式計算所得的值)
來搜尋指定的元素
*/
public class HashSet1 {
    
    public static void main(String[] args) {
        
        //集合
        Set set = new HashSet();//叫不出Hashset的方法
        
        
        HashSet hs = new HashSet();//叫出自已的方法
        //利用add()加入元素內容
        hs.add("Lemon");//檸檬
        hs.add("Watermelon");//西瓜
        hs.add("Pineapple");//鳳梨
        hs.add("Cherry");//Cherry
        hs.add("Strawberry");//草莓
        hs.add("Pineapple");
        hs.add("Cherry");
        
        //Iterator(走訪器)5.0以前,取出集合內每個元素，適用於Set
        Iterator it = hs.iterator();
        while(it.hasNext()){
            //next()取出it的集合元素，回傳值是Object，所以要適當的轉型
            String data = (String)it.next();
            System.out.println(data);
        }
        //toArray()(將集合內容轉換成Object[]，先轉換成陣列再使用，5.0之前
//        Object[] objs = hs.toArray();//有加強型迴圈不需要這個
//        for(Object obj:objs){
//            System.out.println(obj);
//        }
    }
    
}
