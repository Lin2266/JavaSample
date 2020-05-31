
package Collection_Generics;
import java.util.Hashtable;

//是Java原始集合的成員之一(其二為Vector、Stack)，與HashMap都是hash table based(基於哈希表格)的Map集合，
//也是一種無順序性(unordered)
//且無排序性(unsorted)的Map集合，不同的是Hashtable是thread-safe,HashMap不是，key、value不得置入null
public class Hashtable1 {

    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("A", "SCJP");
        table.put(1, 100);
        table.put(new Object(), "SCBCD");
//        table.put(null, null);key、value不得為null
        table.put(5.0, 2.5);
        table.put(true, false);
        table.put('B',"b");
        System.out.println(table.toString());
        System.out.println("key=A : " + table.get("A"));
        System.out.println("key=B : " + table.get('B'));
        System.out.println("key=5.0 : " + table.get(5.0));
        System.out.println("key=1 : " + table.get(1));
        System.out.println("key=new Object : " + table.get(new Object().toString()));//取不到資料
    }
    
}
