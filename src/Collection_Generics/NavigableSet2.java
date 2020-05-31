
package Collection_Generics;

import java.util.TreeSet;

//自訂NavigableSet
class MyNavigableSet extends TreeSet<String>{
    //覆寫add()時，參數型別(String value)須符合TreeSet的泛型定義<String>
    @Override
    public boolean add(String value) {
       return super.add(value);
    }
    
}
public class NavigableSet2 {

    public static void main(String[] args) {
        MyNavigableSet obj = new MyNavigableSet();
        obj.add("Hello Java");
        System.out.println(obj);
    }
    
}
