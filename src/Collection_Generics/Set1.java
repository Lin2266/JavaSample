
package Collection_Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
Collection介面 <一 Set介面  <一 SortedSet介面<一 NavigableSet介面<--TreeSet類
                            <-- LinkedHashSet類(有次序)
                            <-- HashSet類
*/
//沒次序，不允許重複(利用equals()判斷元素內容是否重複
public class Set1 {

    public static void main(String[] args) {
       //object陣列
        Set set = new HashSet();
        //set為容器，add負責把元素丟給list容器
        set.add("Simon");
        set.add("Mary");
        set.add("Simon");
        
        //5.0以前必用的API，5.0以後有加強型迴圈就沒用了
        //呼叫iterator會把資料包裝成iterator，都是object形態，適用Set
        Iterator elements = set.iterator();
        //hasNext判斷有沒有元素
        while (elements.hasNext()) {
            //next取出元素
            //兩種寫法都可以把元素取出來
            System.out.println(elements.next());//1.沒加.next()會變無窮迴圈
//            Object o = elements.next();//2.elements是object形態，所以不用轉型
//            System.out.println(o);
        }
        
        //set不適合用size()，2個元素
        //System.out.println(set.size());
        
        //toArray()(將集合內容轉換成Object[]，先轉換成陣列再使用，5.0之前
//        Object[] objs = set.toArray();
//        for (Object obj : set){
//            System.out.println(obj);
//        }
        
        
    }
    
}
