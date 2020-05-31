
package Collection_Generics;

//poll()跟peek()的差別

import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {

    public static void main(String[] args) {
       Queue q1 = new LinkedList();
       q1.offer("Java");
       
       Queue q2 = new LinkedList();
       q2.offer("Java");
       
        System.out.println(q1.poll());//取得最前端的元素並邊移除
        System.out.println(q1.toString());
        System.out.println();
        System.out.println(q2.peek());//取得最前端的元素不移除
        System.out.println(q2.toString());
    }
    
}
