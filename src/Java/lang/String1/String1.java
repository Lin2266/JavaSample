
package Java.lang.String1;


/*
字串的特性是immutable(永遠不變/一成不變)，內容在記憶體中一經過初始就固定了，不允許更動其內容值，除非重新再建立一塊
新的記憶體來存放新的字串內容。
一般會利用『+』運算子或concat()方法做字串的相加，但這種寫法除了考量執行速度(做字串相連時concat()的速度會比『+』快)之外，
它還會在記憶體中產生不必要的垃圾。

String、StringBuilder跟StringBuffer在取得長度(實際有內容的)時都是使用lenght()。
陣列(String[])取得長度時則使用lenght(是屬性)。
集合在取得總元素個數時常使用size()。
有些集合可以取得目前所配置容積數量(可用空間)(例如:Vector)使用的是capacity()方法，容積數量通常會>=size()(空間大於數量)

*/

public class String1 {
//『+』和concat()時記憶體內部的變化，內容不能改變，會另外在新增一個記憶體
    public static void main(String[] args) {
      //不管是利用『+』或concat()做字串連接，都會在heap中建立新的一塊記憶體空間來存放字串最後變更的內容 
        //『+』
        String x = "Java";
        x = x + "SCJP";
        System.out.println("x = " + x);
        
        //concat()
        String s = "Java";
        s.concat("SCJP");//左邊少了x = 這樣的指派語法，仍可編譯
        System.out.println("x = " + s);//沒指明s物件變數要參照到哪個，所以結果還是Java
        
        s = s.concat("SCJP").concat("7.0");
        s = s.concat("7.0");
        System.out.println("s = " + s);
    }
    
}
