
package Java.util.lint1;

import java.util.Vector;


/*
利用lint來創造安全的程式碼:(java 5.0)
lint是java在編譯時提供給程式設計師的警告訊息，目的是告知程式碼雖然可以編譯，不過有些地方還不夠嚴謹，希望程式設計師再
review/check程式碼一下，以建立安全強固的程式碼
*/
public class Lint1 {

    public static void main(String[] args) {
        //1.一個沒有被泛化的Vector向量
        //Vector vector = new Vector();
        //2.產生警告訊息的原因是，vector並沒有透過泛型來定義該集合元素型別，因此可以用<Object>將其泛化
        //已不會產生任何警告訊息，透過<Object>來泛化vector，雖可消除編譯時的警告訊息，但對實作上沒多大幫助
        Vector<Object> vector = new Vector<Object>();
        vector.add(200);
        vector.add(20.5);
        vector.add("Java");
        /*
        cmd指令:javac -encoding utf8 Lint1.java     (-encoding utf8設定編譯時的編碼，不然會是系統預設的編碼)
        javac希望我們將上例程式透過-Xlint的方式來編譯程式碼，因此稱為『改編譯指令』:
        javac -Xlint Lint1.java 或 javac -source 1.5 -Xlint Lint1.java
        編譯時會發生三個警告(Warnings)訊息，但因沒有發生error或exception，所以仍會產生calss檔。
        
        */
    }
    
}
