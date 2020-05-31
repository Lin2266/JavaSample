
package Collection_Generics;

import java.util.Comparator;
import java.util.PriorityQueue;


//PrioityQueue優先隊列，實作Queue(隊列)介面
//可以撰寫自已想要的排序規則，只要實作Comparator(比較)介面及裡面提供的compare()抽象方法，最後將該物件放到
//PrioityQueue()建構子中，所建立的集合就會依照compare()邏輯排序元素內容
//不想實作Comparator(比較)介面也可以用PrioityQueue預設的自然法則來排序
public class PriorityQueue_Generics1 {

    public static void main(String[] args) {
       //預設的自然法則(依字母大小排序)，依序取出元素內容
//        PriorityQueue<String> pq = new PriorityQueue<String>();
//        pq.offer("c");
//        pq.offer("a");
//        pq.offer("b");
//        String s;
//        while((s = pq.poll()) !=null){
//            System.out.println(s + ",");
//        }
        
        //自訂排序規則-實作Comparator(比較)介面
        Comparator<String> c = new Comparator<String>() {

            @Override
            public int compare(String a, String b) {
                return a.compareTo(b)*-1;//由大到小排列法則
            }
        };
        //將Comparator物件放到PriorityQueue()建構子設定
        PriorityQueue<String> pq = new PriorityQueue<String>(3,c);
        pq.offer("c");
        pq.offer("a");
        pq.offer("b");
        String s;
        while((s = pq.poll()) !=null){
            System.out.println(s + ",");
        }
        
    }
    
}
