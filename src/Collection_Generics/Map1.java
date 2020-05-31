
package Collection_Generics;

import java.util.HashMap;
import java.util.Map;

/*
Map介面<一 SortedMap(排序圖)介面<一 NavigableMap介面<-- TreeMap(樹圖)類
       <--LinkedHashMap(鏈接哈希圖)類
       <--HashMap(哈希圖)類
       <--Hashable(哈希表格)類

Map(圖)沒有繼承集合介面，被歸類為集合架構的一部份，利用指定的鍵值(key)來決定元素擺放位置，
鍵型的型態只要是Object的子孫類別即可，鍵值不得重複(重複時會被覆蓋)，每一個鍵值最多只能對應一個元素，
雖鍵值不得重複，不同的鍵值卻允許儲存重複的元素內容，Map最大的好處就是可以個別操作keys(鍵值)
與values(元素內容)，以增加程式在實作上的彈性

*/
public class Map1 {

    public static void main(String[] args) {
        //字串與物件之間也是可以使用+串接的，其實最後會呼叫物件的toString()取得物件的字串描述
        Map map = new HashMap();
        //Key => 物件的代表資料，Value(值) =>保存的物件(元素內容)
        map.put("1", "HELLO");//(Object key,Object value)
        map.put("2", "HI");
        map.put(1, "map");
        
        //map要用get讀取
        System.out.println(map.get(1));//(Object key)
        System.out.println(map.get("2"));
        System.out.println(map.get("1"));
    }
    
}
