
package Collection_Generics;

//將方法的回傳型別參數化

import java.util.Iterator;
import java.util.Vector;

public class Generics06 {
    //在覆寫或多載的判定上是不考慮泛化
    static Vector<String> getMyVector(){//方法的回傳值被泛化了
        //<String>參數化型別
        Vector<String> v = new Vector<>();
        v.add("Java");
        v.add("Tiger");
        v.add("SCJP");
        return v;
    }
    /*
    //泛型多載會編譯時期錯誤(is already defined已經被定義過了)，泛型的定義在執行時會被JVM erasure(抹滅)如下:
    static Vector getMyVector(){}
    static Vector getMyVector(){}
    
    static Vector<Integer> getMyVector(){
        //<String>參數化型別
        Vector<String> v = new Vector<>();
        v.add("Java");
        v.add("Tiger");
        v.add("SCJP");
        return v;
    }
    */
    public static void main(String[] args) {
        Vector<String> v = getMyVector();
        Iterator<String> it = v.iterator();
        while(it.hasNext()){
            String data = it.next();
            System.out.print(data + ", ");
        }
        System.out.println();
    }
    
}
