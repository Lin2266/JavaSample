
package Collection_Generics;
import java.util.LinkedHashMap;

//與LinkedHashSet一樣，元素加入的順序與鍵值排列順序相同，除了順序性外，其它特性與HashMap相同，key、value允許null
//效能評比以查詢走訪元素(iteration)而言，LinkedHashMap優於HashMap，新增/刪除元素方面則是HashMap優於LinkedHashMap
public class LinkedHashMap1 {

    public static void main(String[] args) {
        LinkedHashMap map = new LinkedHashMap();
        map.put("A", "SCJP");
        map.put(1, 100);
        map.put(new Object(), "SCBCD");
        map.put(null, null);
        map.put(5.0, 2.5);
        map.put(true, false);
        map.put('B',"b");
        System.out.println(map.toString());
        System.out.println("key=A : " + map.get("A"));
        System.out.println("key=B : " + map.get('B'));
        System.out.println("key=5.0 : " + map.get(5.0));
        System.out.println("key=1 : " + map.get(1));
        System.out.println("key=new Object : " + map.get(new Object().toString()));//取不到資料
    }
    
}
