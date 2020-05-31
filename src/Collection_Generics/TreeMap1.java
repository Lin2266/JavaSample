
package Collection_Generics;
import java.util.TreeMap;

//TreeMap(樹圖)實作SortedMap(排序圖)元素加入的順序與鍵值排列順序可能不同，鍵值會依字母大小順序排列(自然排序)，
//TreeMap與TreeSet一樣基於red-black tree(紅黑樹)演算法所實作出來的集合，在實作上，ThreeMap所置入的鍵值必須是同一種資料型別，否則在執行時期會產生ClassCastException(類別轉換例外)的例外
public class TreeMap1 {

    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        //鍵值都是字串的型態
        map.put("A", "SCJP");
        map.put("B", new Integer(100));
        map.put("C", "SCBCD");
        System.out.println(map.get("A"));
        System.out.println(map.toString());
        
        //ThreeMap所置入的鍵值必須是同一種資料型別，否則在執行時期會產生ClassCastException(類別轉換例外)的例外
        TreeMap map1 = new TreeMap();
        //鍵值型態都不一樣，所以執行時會發生例外
        map1.put("A", "SCJP");
        map1.put(new Integer(100), new Integer(100));
        map1.put(new Object(), "SCBCD");
        System.out.println(map1.get("A"));
        System.out.println(map1.toString());
    }
    
}
