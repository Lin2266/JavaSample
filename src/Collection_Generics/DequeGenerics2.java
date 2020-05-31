
package Collection_Generics;

import java.util.ArrayDeque;
import java.util.Deque;



public class DequeGenerics2 {

    public static void main(String[] args) {
       Deque<String> deq = new ArrayDeque<String>(2);
       deq.addFirst("one");
       deq.addFirst("two");
       deq.addFirst("three");
       //addFirst 由下往上輸出
       System.out.println(deq);
        //pollLast取出最下面元素並刪掉
       System.out.println(deq.pollLast());
        System.out.println(deq.pollLast());
        System.out.println(deq.pollLast());
    }
    
}
