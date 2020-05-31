
package Collection_Generics;

import java.util.List;
import java.util.Vector;


//泛型中的多型，被泛化的基底型別，不是型別參數<>
public class Generics07 {

    public static void main(String[] args) {
        //泛型中的多型別資料轉換-基底型別多型,List是Vector的父類
        Vector<Integer> v = new Vector<>();
        List<Integer> v1 = v;
        
        /*
        //不能用型別參數多型   錯誤例題:
        Vector<Integer> v2 = new Vector<>();
        Vector<Number> v3 = v2;//Number是Integer的父類別
        
        Vector<Number> v4 = new Vector<>();
        Vector<Integer> v5 = v4;
        
        Vector<Integer> v6 = new Vector<>();
        Vector<Object> v7 =v6;
        */ 
        //這種寫法特例，可以通過編譯但會有警告，將轉型權交給編譯器並轉換成Object，Java不允許<Object>來撰寫程式
        Vector<Integer> v8 = new Vector<>();
        Vector v9 = v8;
    }
    
}
