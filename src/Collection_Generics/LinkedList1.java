
package Collection_Generics;

import java.util.LinkedList;


/*
有次序，可重複，還可從兩端加入或移除元件的處理，以下為方法:
addFirst():從最前面加入
addLast():從最後面加入
push():優先加入最前面
pollFirst():移除最前面
pollLast():移除最後面

查詢走訪元素的效率比ArrayList差，在新增與刪除元素的機制上會好些
實作List跟Deque介面(繼承Queue)，所以LinkedList可以當成一般List使用，也可以當作Queue特性的集合來使用
*/
public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList furits = new LinkedList();
        furits.add("Lemon");
        furits.addLast("Watermelon");//加入最後面
        furits.addFirst("Pineapple");//加入最前面
        furits.push("Cherry");//優先加入最前面
        furits.add("Strawberry");
        System.out.println(furits);
        System.out.println(furits.pollFirst());//取出並刪除最前面
        System.out.println(furits);
        System.out.println(furits.pollLast());//取出並刪除最後面
        System.out.println(furits);
        
    }
    
}
