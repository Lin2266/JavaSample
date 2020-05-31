
package Collection_Generics;

import java.util.ArrayList;
import java.util.ListIterator;
               
/*
                  (不常見) <--PrioityQueue類
              <一 Queue介面<一 Deque介面
                           <-^-LinkedList類                           
Collection介面<一 List介面 <-- Vector類 <一 Stack類
                           <-- ArrayList類

(List列表)有次序，可重複
像Array一樣，但可修改內容大小(陣列不行)，擁有較優的隨機存取機制，可自由地擴增容量，用add()與get()置入與取出元素即可
集合在取得總元素個數時常使用size()。
*/
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        String s = "ABC";
        al.add("Lemon");//檸檬
        al.add("Watermelon");//西瓜
        al.add("Pineapple");//鳳梨
        al.add("Cherry");//Cherry
        al.add("Strawberry");//草莓
        al.add("Pineapple");
        al.add("Cherry");
//        al.add(1);//錯誤
//        al.add('A');//錯誤
        //List的方法listIterator()，傳回ListIterator物件
        //ListIterator介面可以在List中逆向移動
        ListIterator it = al.listIterator();
        //hasNext()判斷下面是否還有list元素，hasPrevious()則是判斷上面
        while(it.hasNext()){
            int index = it.nextIndex();//向下取得index(0開始)，previousIndex()向上(-1開始)
            String data = (String)it.next();
            System.out.print(index + " = " + data + ", ");
            
        }
            System.out.println("size:"+al.size());
        for(Object o: al){
//            String data = (String)o;不用轉型也可
            System.out.print(o + ", ");
        }
    }
    
}
