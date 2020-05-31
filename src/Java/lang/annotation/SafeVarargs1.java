
package Java.lang.annotation;

import java.util.ArrayList;
import java.util.List;

/*    多加一個*字體會變粗
SafeVarargs安全可變參數:
針對使用泛型來定義不特定長度參數時，編譯器在編譯時期會拋出開發人員執行時期的參數型態可能無法確認的警告
(此警告為heap pollution堆污染)，為了避免警告的繁衍以及開發人員確認已經會避免此問題的發生，在java 7中可透過
@SafeVarargs註釋來抑制這個警告。
 */
public class SafeVarargs1 {
    //1.javac編譯器針對不特定長度參數可能會發生heap pollution的問題，所以會對此方法簽章做出警告
    //2.為了避免警告的爆增與繁衍在Java 6之前只能選擇@SuppressWarnings({"unchecked"})註釋來抑制惱人的警告
    //3.@SafeVarargs註釋協助我們解決此問題
    //@SuppressWarnings({"unchecked"})//雖然可以暫時抑制警告，但其它的警告也會被抑制
    @SafeVarargs
    public static <T> void add(T... x){//Possible heap pollution可能的堆污染
        System.out.println("SafeVarargs");
    }
    public static void main(String[] args) {
       //3.加註@SafeVarargs可以抑制因不特定長度參數可能會發生heap pollution的問題警告
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        SafeVarargs1.<List<Integer>>add(x,y);
        
        
    }
    
}
