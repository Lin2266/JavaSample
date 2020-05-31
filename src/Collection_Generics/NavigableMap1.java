
package Collection_Generics;

import java.util.NavigableMap;
import java.util.TreeMap;

/*
關係圖:
                                         <一 ConcurrrentNavigableMap介面
SortedMap            <一 NavigableMap    <一 TreeMap類
Map                                      <一 ConcurrrentSkipListMap類

NavigableMap可導覽的圖介面:
NavigableMap是一種SortedMap，預設排序根據鍵值(key)做自然排序，元素內容不允許null值，但是鍵值(key)允許

常用的方法參考猛虎451頁
*/
public class NavigableMap1 {

    public static void main(String[] args) {
        //實作上應避免的錯誤宣告
        //NavigableMap<Integer,Integer> nm1 = new HashMap<>();錯誤，非子類別
        NavigableMap<Integer,Integer> nm = new TreeMap<>();//正確，要子類別
    }
    
}
