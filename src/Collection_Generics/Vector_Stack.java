
package Collection_Generics;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;


/*
Java Se 1.4版之前的集合中具有thread-safe的集合僅有Hashtable(Map)、Vector、Stack，這三個集合也是Java的原始集合，
之所以是thread-safe主要是集合的原始碼中所有對外的public方法都加上synchronized修飾字，若要讓其他集合也能享有thread-safe
的機制，就是使用Collections類別所提供的synchronizedXXX()方法

Vector(向量)類實作List，特性與ArrayList相同，唯一不同的是，在多執行緒的機制下，Vector在同步維護上是Thread-safe的，
所以效率上比ArrayList來得差，除非在實作上必須要將Thread-safe
的問題考慮進去，才會建議使用Vector。
用Netbeans7.X來開發Java程式在宣告Vector集合時會發生Obsolete Collection(過時的集合)的警告，並不表示Vector不建議使用，
而是提醒Vector屬於同步的集合，若是單執行緒的環境實作不建議使用，應使用ArrayList等其他非同步的集合

Stack(堆疊)是Vector的子類別，除了具有其特性，還具有LIFO(Last-in-first-out)後進先出順序來處理元素，
push()優先加入最前面
peek()取得元素內容，不刪除
pop()取得元素內容，並將該元素刪除

有些集合可以取得目前所配置容積數量(可用空間)(例如:Vector)使用的是capacity()方法，容積數量通常會>=size()(空間大於數量)
*/
public class Vector_Stack {

    public static void main(String[] args) {
        Vector v = new Vector();//有次序的，可重複
        v.add("CCC");
        v.add("BBB");
        v.add("AAA");
        v.add("DDD");
        v.add("AAA");
        System.out.println(v.capacity());//取得容積數量
        System.out.println("排序前: " + v.toString());
        //利用Collections的sort()讓Vector物件變自然排序
        Collections.sort(v);
        System.out.println("排序後: " + v.toString());
        
        //讓其他集合也能享有thread-safe的機制，但會大量流失效能，
        //5.0後有更有效率的concurrent collection並行集合，concurrentHashMap、CopyOnWritheArrayList、CopyOnWritheArraySet
        Map m = Collections.synchronizedMap(new TreeMap());
        System.out.println(m);
    }
    
}
