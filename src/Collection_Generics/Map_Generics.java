package Collection_Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Generics {
    //15-23
    public static void main(String[] args) {
        //Key => 物件的代表資料，Value(值) =>保存的物件(key:Integer,Value:Product)
        //泛型的<型別>設定有限制，以下範別的key只能接收Integer，value是Product的型態
        Map<Integer, Product> map = new HashMap<>();
                  
        Product p = new Product(1, "p", 10, false, 100);
        Product p2 = new Product(2, "p2", 20, false, 200);
        Product p3 = new Product(3, "p3", 30, false, 300);
        //key設為id,數字也可以，後面物件的順序也可以換
        map.put(p.getId(), p);//(1,p)也可
        //key不能重複，重複時會把前面的Value值覆蓋
        map.put(p2.getId(), p2);
        map.put(p3.getId(), p3);
        System.out.println(map.get(p3.getId()));
        
        System.out.println("=================");
        //map讀取資料時直接填key設好的資料(id = 1, 2,3)，後面物件填誰就是呼叫誰的資料
        //System.out.println(map.get(2));
        //map.put(2, p3);
        Set<Integer> set = map.keySet();
        
        for (Integer i : set) {
            System.out.println(map.get(i));
            System.out.println("=======================");
        }
        /*
        //參考用: map比較常用get讀取
        Collection<Product> c = map.values();
        
        for (Product pro : c) {
            System.out.println(pro.toString());
        }
        */

        /*   
        //沒有使用泛型
        Map map = new HashMap();
        //Key => 物件的代表資料，Value(值) =>保存的物件
        map.put("1", "HELLO");
        map.put("2", "HI");
        
        //map要用get讀取
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));
        */
    }
    
}
