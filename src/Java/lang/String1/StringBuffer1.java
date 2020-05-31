
package Java.lang.String1;


/*
StringBuffer是為了提昇程式效率又不浪費記憶體空間，與String不同的是提供更多操作字串的方法，更允許在同一塊字串記憶體內進行操作
(其實就是利用char[]的特性來做操作)，以降低記憶體的浪費。
StringBuffer所提供的字串鏈結方法append()，在效率上大大超越了String串接時所使用的『+』運算子與concat()方法，是一種
mutable(易變)的字串，在實作上是thread-safe的，對外所提供的方法定義上都加了synchronized關鍵字
*/
//字串緩衝
public class StringBuffer1 {

    public static void main(String[] args) {
        //StringBuffer類別中append()使用方法與在記憶體中的變化，會直接在原地增加空間來存放新的內容
        StringBuffer x = new StringBuffer("Java");
        x.append("SCJP").append("7.0");//append可以連續使用，因為在原地增加空間來存放，所以可以不用指派
        System.out.println("x = " + x);
        
        
    }
    
}
