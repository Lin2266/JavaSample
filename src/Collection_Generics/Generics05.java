
package Collection_Generics;

//Iterator也支援泛型

import java.util.Iterator;
import java.util.Vector;

public class Generics05 {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Java");
        v.add("Tiger");
        v.add("SCJP");
        Iterator<String> it = v.iterator();//泛化後的Iterator,省去轉型
        
        while(it.hasNext()){
            String data = it.next();//不用轉型
            System.out.print(data + ", ");
        }
        System.out.println();
    }
    
}
