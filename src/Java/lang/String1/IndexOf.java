
package Java.lang.String1;


/*
IndexOf 查詢字元位存在於字串內位置,以0為起始。
IndexOf(字串)，有找到字串時會回傳第一個字元的位置，IndexOf如查詢不到，則會回傳-1。
字串內的內容存放可視為一連續空間，而每一個字元均存放在順序的位置上，如下表所示：

字串    S   M   A   R   T
索引    0   1   2   3   4
*/
public class IndexOf {

    public static void main(String[] args) {
        String smart = "Smart";
        int idx = smart.indexOf("m");
        System.out.println("m所在位置:"+idx);
        //m所在位置:1
        
        idx = smart.indexOf("rt");
        System.out.println("rt所在位置:"+idx);
        //rt所在位置:3
        
        idx = smart.indexOf("z");
        System.out.println("z所在位置:"+idx);
        //z所在位置:-1
        
        //中文部份
        String chinese = "中華民國";
        int cidx = chinese.indexOf("民");
        System.out.println("民所在位置:"+cidx);
        //民所在位置:2
        
        cidx = chinese.indexOf("中華");
        System.out.println("中華所在位置:"+cidx);
        //中華所在位置:0
        
        cidx = chinese.indexOf("台灣");
        System.out.println("台灣所在位置:"+cidx);
        //台灣所在位置:-1, 不存在
    }
    
}
