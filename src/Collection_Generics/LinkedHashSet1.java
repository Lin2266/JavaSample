
package Collection_Generics;

import java.util.Iterator;
import java.util.LinkedHashSet;

//有排序(根據加入的順序)，不重複
public class LinkedHashSet1 {

    public static void main(String[] args) {
        LinkedHashSet lh = new LinkedHashSet();
        //利用add()加入元素內容
        lh.add("Lemon");//檸檬
        lh.add("Watermelon");//西瓜
        lh.add("Pineapple");//鳳梨
        lh.add("Cherry");//Cherry
        lh.add("Strawberry");//草莓
        lh.add("Pineapple");
        lh.add("Cherry");
        
//        Iterator it = lh.iterator();
//        while(it.hasNext()){
//            String s = (String)it.next();
//            System.out.println(s);
//        }
        for(Object obj:lh){
            System.out.println(obj);
        }
        
        
    }
    
}
