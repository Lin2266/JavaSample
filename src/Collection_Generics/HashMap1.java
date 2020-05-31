
package Collection_Generics;

//元素加入的順序與鍵值排列順序可能不同，key、value允許null
//效能評比以查詢走訪元素(iteration)而言，LinkedHashMap優於HashMap，新增/刪除元素方面則是HashMap優於LinkedHashMap
import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {
        //鍵值型態只要是Object的子孫類別就可，鍵值不存在於該集合中時，執行階段不會產生例外，只會回傳null
        
        HashMap map = new HashMap();
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
        System.out.println(map.get(null));
        System.out.println("key=new Object : " + map.get(new Object().toString()));//取不到資料
        System.out.println(map.getClass());//看建構子的型態
    }
    
}
