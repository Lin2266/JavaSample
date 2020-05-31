
package Java.util.Stack1;

import java.util.Stack;


/*
Stack 類別表示後進先出（LIFO）的物件堆疊(stack)空間
是一群相同資料型態的組合，並擁有後進先出(Last In，Frist Out)的特性，
所有的動作均在堆疊頂端進行。
通過五個操作方法對類別Vector 進行了擴展並符合五種基本工作運算：
push()推:把物件壓入堆疊(stack)空間頂部，並傳回新的堆疊。
pop()砰地:移除堆疊(stack)空間頂部的物件，並作為此函數的值返回該物件傳回新的堆疊。
peek()規視:取堆疊(stack)空間頂點物件。
empty()空:測試堆疊(stack)空間是否為空的方法。
search()搜尋:在堆疊(stack)空間中尋找項目物件並確定到堆疊(stack)空間頂距離的方法，以1 為進制。

返回值-1 表示此物件不在堆疊(stack)空間中。

*/
public class Stack1 {

    public static void main(String[] args) {
       //假設堆疊存放字串元素，故使用泛型<String>
        System.out.println("原火車廂號碼排列為: 101號車箱，201號車箱，301號車箱\n");
        //建立空的字串堆疊
        Stack<String> st = new Stack<>();
        
        //堆疊依序壓入三元素物件
        String c1 = "301"; st.push(c1);//推
        String c2 = "101"; st.push(c2);
        String c3 = "201"; st.push(c3);
        
        //堆疊依序彈出三元素物件
        String e1 = st.pop();
        String e2 = st.pop();
        String e3 = st.pop();
        
        //確認資料是否符合後進先出特性
        System.out.println("重新排列後車廂號碼為: " +e1+"號車箱，"+e2+"號車箱，"+e3+"號車箱");
        
    }
    
}
