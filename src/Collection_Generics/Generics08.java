
package Collection_Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//型別萬用字元 <？> <A>一樣
//可在類別、屬性、引數、方法使用、物件型態參數
class bb<A>{
    private Vector<? extends Number> a;
}
public class Generics08 {
    //<?>任何型別參數都可以接受，?不能用無蝦咪的？
    static void printMyArrayList (ArrayList <?> v){//ArrayList型別萬用字元?
        Iterator<?> it = v.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //不同的型別參數
        ArrayList<String> v1 = new ArrayList<>();
        v1.add("Java");
        v1.add("Tiger");
        v1.add("SCJP");
        ArrayList<Integer> v2 = new ArrayList<>();
        v2.add(100);
        v2.add(200);
        v2.add(300);
        
        printMyArrayList(v1);
        printMyArrayList(v2);
    }
    
}
