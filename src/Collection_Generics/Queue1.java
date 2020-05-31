
package Collection_Generics;

import java.util.LinkedList;
import java.util.Queue;

/*
                  (不常見) <--PrioityQueue類
Collection介面<一 Queue(隊列)介面<一 Deque介面

Queue介面是LIFO(Last-in-first-out)後進先出順序來處理元素，5.0提供的新集合，要使用Queue的特性時，不要使用add()與remove()這
兩個標準的新增/移除元素指令，因為Queue使用這二個方法會丟出一個例外且必須加以處理，使用比較繁瑣(要用也可以)，建議以
offer()與poll()二個方法來取代

offer()後端加入指定元素
poll()從最前端取得元素並邊移除
peek()從最前端取得元素但不移除

//使用這三個方法必須要用例外處理
add()後端加入指定元素
remove()從最前端取得元素並移除
element()從最前端取得元素但不移除

實作Queue介面的是LinkedList類，所以LinkedList可以當成一般List使用，也可以當作Queue特性的集合來使用
*/
public class Queue1 {

    public static void main(String[] args) {
        //Queue介面不能建立實體物件，由子類別建立
        Queue q = new LinkedList();
        //offer提供
        q.offer("First");//第一
        q.offer("Second");//第二
        q.offer("Third");//第三
        Object o;
        System.out.println(q.toString());//把元素內容叫出來
        while((o = q.poll())!=null){//poll()邊取得元素內容邊移除該元素
            String s = (String)o;//沒使用泛型，所以必須轉型
            System.out.println(s);
        }
        System.out.println(q.toString());//沒有任何元素
    }
    
}
