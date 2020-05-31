
package Collection_Generics;

/*
LIFO(Last-in-first-out)後進先出順序來處理元素
                  (不常見)       <--PrioityQueue(優先隊列)類
              <一 Queue(隊列)介面<一 Deque介面
                           
                                 <-^-LinkedList類                           
Collection介面<一 List(排序)介面 <-- Vector類 <一 Stack類
                                 <-- ArrayList類
              
              <一 Set(設定)介面  <一 SortedSet介面<一 NavigableSet介面<--TreeSet類
                           <-- LinkedHashSet類
                           <-- HashSet類

集合就是Object[],只能存放物件，若要存放基本資料型別的資料就必須利用外包類別，Integer、Character、Long..
操作集合物件的內部元素資料，必備的技巧包含以下三項:
1.如何增加或移除元素
2.如何找出並取出指定元素
3.如何在集合中使用走訪器

集合有四個特性:排序性(Sorted)自然排序(ABCD)、順序性(Ordered)依照放的順序、重複性(Duplicates、鍵值(Use Key)
特性			集合介面/類別
排序性		SortedSet、SortedMap、TreeMap、TreeSet
順序性		List、LinkedHashMap、LinkedHashSet(index)、ArrayList、Vector、LinkedList(index)
無次序		HashSet
不允許重複	Set、SortedSet、LinkedHashSet、HashSet
鍵值的使用	Map、SortedMap、HashMap、Hashtable、LinkedHashMap

Collection的常用方法:
方法名稱                         傳回值     說明
add(Object o)                   boolean     將指定的物件o加入集合中，若傳回值為true表示加入成功，false加入失敗
addAll(Collection c)            boolean     將指定的集合物件c中所有的元素加入集合中，若傳回值為true表示加入成功，false加入失敗
clear()                         void        清除集合中的所有元素
contains(Object o)              boolean     判斷指定物件o是否屬於該集合物件的成員之一，屬於傳回true，不屬於false
containsAll(Collection c)       boolean     判斷指定物件c所有成員是否屬於該集合物件的成員之一，屬於傳回true，不屬於false
equals(Object o)                boolean     比較集合物件與指定的物件o，當實作Set介面指定物件o也實作Set介面時為true
isEmpty()                       boolean     判斷集合是否為空，空的傳回true，不是空的為false
remove(Object o)                boolean     移除集合中某一個元素，該元素所參考的物件等於參數中的o物件即將該集合元素移除，移除成功為true，不成功false
removeaAll(Collection c)        boolean     移除指定集合c中的所有成員(集合c可能包含不只一種集合物件，一律移除)移除成功true，失敗false
size()			 	int         傳回此集合所有元素個數
iterator()		 	Iterator    將此集合回傳一個Iterator，此集合就可以使用Iterator中所有的方法，如:hasNext()、next()、remove()
hashCode()		 	int         傳回一個hash code數值
*/      
public class Collection {

    public static void main(String[] args) {
    	String s = "abcde";
    	s= s.substring(0, 2);
    	System.out.println(s);
        
    }
    
}
