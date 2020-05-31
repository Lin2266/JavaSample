
package Java.lang.annotation;


/*
Deprecated(已過時)在java API document中常看到@deprecated(小寫)，用來表示該元素(類別、方法或屬性)是被禁止使用，@Deprecated(大寫)這個Annotation(註解)並不是取代API document中的@deprecated，因為在API文件上要使用的是@deprecated，而在程式編譯上檢查程式碼中的元素是否已經被禁止，可以使用@Deprecated annotation，實際使用時二者可一併使用

-Xlint跟-deprecation是相同的效果
*/
public class Deprecated1 {
    //-Xlint:編譯時會發生三個警告(Warnings)訊息，但因沒有發生error或exception，所以仍會產生calss檔。
    //@deprecated:被禁止
    
    @Deprecated public void doSomThing(){//(-Xlint)有加@Deprecated會編譯成功(方法被禁止)，沒加的編譯會有警告
        System.out.println("doSomeThing");
    }
    public void move(){
        System.out.println("移動");
    }
    //javac -encoding utf8 -Xlint Annotation_Deprecated1.java (有加@Deprecated會編譯成功(方法被禁止)，沒加的編譯會有警告)
    

    public static void main(String[] args) {
       
    }
    
}
