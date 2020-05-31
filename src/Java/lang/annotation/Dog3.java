
package Java.lang.annotation;


/*
    Annotation_Deprecated1的doSomThing()方法使用@Deprecated(已過時)禁止，用Dog3來測試-Xlint
*/
public class Dog3 extends Deprecated1{

    public static void main(String[] args) {
        //用javac -encoding utf8 Dog3.java
        //沒加-Xlint時編時，java會要求加上-Xlint後再進行編譯，編譯後產生了因使用doSomThing()這個deprecated方法的警告訊息
        Dog3 d = new Dog3();
        d.move();
        d.doSomThing();//@Deprecated(已過時)禁止
    }
    
}
