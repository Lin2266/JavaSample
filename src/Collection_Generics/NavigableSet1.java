
package Collection_Generics;

import java.util.NavigableSet;
import java.util.TreeSet;

/*
NavigableSet與NavigableMap這二個介面功能比起以往傳統集合更強大使用上更直覺

關係圖
SortedSet
Set             <一(四個) NavigableSet <一 Treeset類
Iterable                               <一 ConcurrrentSkipListSet類
Collection

NavigableSet可導覽之排序工具集合介面:
NavigableSet是一種SortedSet(排序集合)，預設排序根據內容做自然排序，元素內容不允許null值

常用的方法參考猛虎450頁
*/
public class NavigableSet1 {

    public static void main(String[] args) {
        //實作上應避免的錯誤宣告
        //NavigableSet<Integer> ns1 = new HashSet<>();錯誤，非子類別
        NavigableSet<Integer> ns = new TreeSet<>();//正確，要子類別
        ns.add(2);
        ns.add(3);
        ns.add(1);
        ns.add(5);
        ns.add(4);
        System.out.println("預設自然排序:" + ns);
        System.out.println("倒序:" + ns.descendingSet());//倒序
        System.out.println("第一個元素:" + ns.first());//第一，自然排序的第一個元素
        System.out.println("小於3之最大元素:" + ns.lower(3));//降低
        System.out.println("小於等於3之最大元素:" +ns.floor(3));//地板
        System.out.println("大於2之最小元素:" + ns.higher(2));//高
        System.out.println("大於等於2之最小元素:" + ns.ceiling(2));//天花板
        /*
        自然 12345
        倒序 54321
        1 自然排序的第一個元素
        2
        3
        3
        2
        */
    }
    
}
