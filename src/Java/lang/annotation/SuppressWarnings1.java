
package Java.lang.annotation;


/*
SuppressWarnings(註釋警告):
可以用來隱匿警告訊息，相當於關閉警告訊息，只要認為這些法定產生的警告訊息並不影響後續程式的行為，可以考慮使用它。
@SuppressWarnings只限有被定義的程式檔，對於其他程式段的警告則依然保持，到底要關閉/隱匿哪些警告訊息？
提供了7種參數可以加以設定並支援多重設定:
all、deprecation(已過時/禁用)、fallthrought、finally(最後)、path(路徑)、serial(依次的)、unchecked(沒有被制止的)

語法中的參數型態以String[]表示:
@SuppressWarnings(value={"參數1","參數2",..."參數7"})
@SuppressWarnings({"參數1","參數2",..."參數7"})//省略value
例1:@SuppressWarnings(value={"deprecation","finally"})
例2:@SuppressWarnings({"deprecation","finally"})
例3:@SuppressWarnings({"deprecation"})
例4:@SuppressWarnings(value={"unchecked"})//註釋會抑制掉所有警告，一般在專案實作上請儘量避免使用
*/
public class SuppressWarnings1 {
    //@關閉 已過時
    @SuppressWarnings(value={"deprecation"})
    public static void main(String[] args) {
        //利用javac -encoding utf8 -Xlint SuppressWarnings1.java將不會有錯誤訊息
        Dog3 d = new Dog3();
        d.move();
        d.doSomThing();
        
    }
    
}
