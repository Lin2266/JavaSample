
package Collection_Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;


//限制型別參數<? extends 類別名稱>
//可在屬性、引數、方法使用、物件型態參數
//<?>定義範圍比較廣，因此提供限制型別參數的語法，讓其限制在某一個類別所屬的子類別中
class aa<A>{
    private Vector<? extends Number> a;
}
public class Generics09 {
    //只要是Number的子類別都可以接收
    static void printMyArrayList (ArrayList<? extends Number> v){//包括自已
        Iterator<? extends Number> it = v.iterator();
        while(it.hasNext()){
            Number data = it.next();
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Number> v1 = new ArrayList<>();
        v1.add(100);
        v1.add(200);
        v1.add(300);
        ArrayList<Float> v2 = new ArrayList<>();
        v2.add(1.1f);
        v2.add(2.2f);
        v2.add(3.3f);
        
        printMyArrayList(v1);
        printMyArrayList(v2);
        
        
//        ArrayList<String> v3 = new ArrayList<String>();//只加前面會執行時期錯誤
//        v3.add("Java");
//        v3.add("Tiger");
//        v3.add("SCJP");
//        printMyArrayList(v3);//<String>前後有加才會有編譯錯誤
        
//        ArrayList v4 = new ArrayList();//執行時期發生類別轉換例外
//        v4.add(new Integer(10));
//        v4.add(new Integer(20));
//        v4.add("Java");
//        printMyArrayList(v4);
    }
    
}
