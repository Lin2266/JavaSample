
package Java.lang.String1;

/*
delete()
方法名稱                    回傳值          說明
delete(int start, int end)  StringBuffer    刪除start與(end-1)位置之間的字串，若start=end則無任何影響
                            StringBuilder

end參數的設定限制:
delete()與replace()在end參數設定上，若超過字串本身的最大維度值，會自動以該最大維度值來表示，並不會產生錯誤，但start的設定值
必須小於或等於(<=)end的設定值，否則會發生執行時期例外:
java.lang.StringIndexOutOfBoundsException: start > end，字串索引超出範圍例外
*/
public class StringBuffer_Builder3 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123456789");
        //sb = sb.delete(0, 3);//不包含index3
        sb.delete(0, 3).replace(0, 100, "Java");
        System.out.println(sb);
        
        //substring()與delete()併用時會造成編譯錯誤，因為sb.substring(0,5)會回傳一個String，
        //對String來說並沒有提供delete()這個方法，所以會產生『cannot find symbol』(找不到符號)的編譯錯誤！
        //sb.substring(0,5).delete(0, 3).replace(0, 3, "Java");
    }
    
}
