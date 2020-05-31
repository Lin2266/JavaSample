package Collection_Generics;


import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;


public class List_Generics {
    // 15-13 泛型 List(容器)自動從0編號，不檢查重複, 15-27 sort 15-15Iterator
    public static void main(String[] args) {
        
        //陣列用Arrays.sort做排序
        //int[] ia = {32, 12, 4, 1, 35};
        //Arrays.sort(ia); 
        
        /*
        for (int i : ia) {
            System.out.println(i);
        }
        */
        
        //員工旅遊登記編號
        //5.0 List只能儲存String這種物件
        //List<String> list = new ArrayList<String>();
        //7.0 new ArrayList<ArrayList> 要一樣，所以<省略>
        //泛型
        List<String> list = new ArrayList<>();
        //List已宣告指定為String，以外的會編譯錯誤
        //list為容器，add負責把元素丟給list容器
        list.add("Simon");
        list.add("Mary");
        list.add("Simon");
        //list.add(new Integer(3));不是String
        
        //5.0以前必用的API，5.0以後有加強型迴圈就沒用了
        //呼叫iterator會把資料包裝成iterator，都是object形態
        Iterator i = list.iterator();
        //hasNext判斷有沒有元素
        while (i.hasNext()) {
            //next使用一個元素
            System.out.println(i.next());
        }
        
        //
        
        /*
        for (String s : list) {
            System.out.println(s.toUpperCase());
        }
        
        /*
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toUpperCase());
        }
        
        
        //java5.0以前的做法
        /* 
        List list = new ArrayList();
        //按照順序編號，但不會排除重複
        list.add("Simon");
        list.add("Mary");
        list.add("Simon");
        //new一個Integer(轉換整數)物件把3放進去
        list.add(new Integer(3)); 
        //把字變大寫toUpperCase()
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof String){
            }
            //把Object型態轉換成字串
            String s = (String)list.get(i);
            System.out.println(s.toUpperCase());
        }
        /*
        list.add(1, "Sam"); //插隊在1號後面
        //size():顯示有幾個元素
        //System.out.println(list.size());
        //移除指定編號的元素(int)
        list.remove(2);
        //移除指定編號的物件(object)
        list.remove("Simon");
        //java會自動幫list加gotring()
        System.out.println(list);
        
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /*
        // list裡的object型態 obj變數
        for (Object obj : list) {
            System.out.println(obj);
        }
        */
    }
    
}
