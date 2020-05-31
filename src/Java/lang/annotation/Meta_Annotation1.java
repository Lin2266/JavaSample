
package Java.lang.annotation;

import java.lang.annotation.Annotation;

/*
Meta-Annotation元註釋:
就是對Annotation再做出Annotation的註釋或註記，先前所用的三種標準Annotation都有其Meta-Annotation加以註釋/註記，這樣
一來才知道所定義的Annotation要如何使用。
java 5.0針對其標示註記提供了四種標準Meta-Annotation:
@Target(目標):指定該Annotation可以使用的元素！
@Retention(保留):告訴編譯器javac要如何處理與保留Annotation
@Documented(記錄):讓該Annotation的資訊可以顯示在java API文件上
@Inherited(遺傳):讓子類別透過繼承機制能享有父類別的Annotation
 
利用@interface來自定Annotation型別:
透過@interface可以自定Annotation型別，並看成是一種interface來定義自定的Annotaion型別，加上@符號是告訴編譯器，所定義的不是
一般interface，而是一個annotation，並在編譯的同時自動繼承java.lang.annotation.Annotation。


二點注意事項:
1.不要在程式撰寫時期(.java)自行實作定義interface Copyright extends Annotation的宣告。雖然可以通過編譯，但它(Copyright)在執行
環境中並不是一個Annotation，使用上會出現"Copyright is no an annotation type"的錯誤資訊，因此一定要透過@interface來宣告。
2.@interface的宣告不允許使用extneds關鍵字。不要寫成@interface Copyright extneds Annotation，否則會出現
"extends no allowed(允許) for @interface的編譯時期錯誤訊息。若真要繼承，請在@interface上方使用@Inherited。
*/
public class Meta_Annotation1 {
    //1.一個簡單的自定Annotation型別Copyright: 要import java.lang.annotation.*
    @interface Copyright{
        
    }
    /*編譯成功後，將Copyright.class反組譯得到的程式碼:
    interface Copyright extends Annotation{    
    }
    */
    
    //在Animal類別中使用Copyright這個Annotation註解:
    @Copyright
    class Animal{
        
    }
    
    //2.含value()的Copyright Annotation型別
    //使用Annotation若想給定參數值但又不指定參數名稱，這時預設會自動呼叫該Annotation的value()方了，所以在Copyright的定義中必須先定義一個抽象方法value()。                                                                                               Copyright2這個Annotation的方法成員必須是String(含String[])、列舉與基本資料型別(不能是基本資料型別的Wrapper class包裝類別。
    @interface Copyright2{
        String[] value();//抽象方法
        //Integer value();//不合法的型別，編譯時會產生"invalid(無效) type for annotation member"    
    }
    //在Animal2類別中使用Copyright2這個Annotation註解:
    @Copyright2({"www.foo.com","1.0","2006/01/01"})
    //@Copyright2(value={"www.foo.com","1.0","2006/01/01"})也可以加上value這個參數來定義
    class Animal2{
        
    }
    public static void main(String[] args) {
       
    }
    
}
