
package Collection_Generics;
//集合&泛型

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeGenerics1 {

    public static void main(String[] args) {
        Deque<String> myDeque= new ArrayDeque<String>();
        myDeque.push("one");
        myDeque.push("two");
        myDeque.push("three");
        //ArrayDeque堆疊先進後出
        System.out.println(myDeque.pop());
    }
    
}
