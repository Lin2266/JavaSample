
package Collection_Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


//實作SortedSet介面，無次序(自然排序，依照字母大小寫排序)，不重複
//內部運作是紅黑樹(一種二元平衡樹)的資料結構所實作，集合元素中必須都是相同的資料型別且不可為null
public class TreeSet1 {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("Lemon");//檸檬
        hs.add("Watermelon");//西瓜
        hs.add("Pineapple");//鳳梨
        hs.add("Cherry");//櫻桃
        hs.add("Strawberry");//草莓
        hs.add("Pineapple");
        hs.add("Cherry");
        Iterator it = hs.iterator();
        while(it.hasNext()){
            String data = (String)it.next();//隨機取出元素
            System.out.print(data + ",");
        }
        System.out.println("\n--------------------------------------------");
        TreeSet ts = new TreeSet(hs);//將hs放入到TreeSet中
         it = ts.iterator();
        while(it.hasNext()){
            String data = (String)it.next();//自然排序取出元素
            System.out.print(data + ",");
        }
        
    }
    
}
