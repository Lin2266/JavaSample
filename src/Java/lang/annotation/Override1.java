
package Java.lang.annotation;

/*
java 5.0開始提供Annotation註解它強化了程式註解與javadoc文件註解的功能，使其更有強制力(是一種metadata(元數據)，用來描術資訊中的資訊，在java.lang套件中定義好三個標準的Annotation型別，分別是:
1.Override(覆蓋):表示該方法的目的是覆寫父類別的方法
2.Deprecated(已過時):表示該元素(類別、方法或屬性)是被阻止的，不建議(也就是禁止)被使用。
3.SupperssWarnings(抑制警告):隱匿警告訊息並有參數可加以設定。
也可以說是程式碼對程式碼的註解)，並用來歸納各種條件陳述的變化。
*/
public class Override1 {
    class Animal{
        public void move(){
            System.out.println("移動");
        }
    }
    
    class Dog extends Animal{
        //以正常且合法的做法，繼承並覆寫
//        public void move(){
//            System.out.println("跑跑跳跳");
//        }
        //要覆寫卻寫成了moving()，如果加上@Override時，用cmd執行就會顯示覆寫error
        //@Override 
        public void moving(){
            System.out.println("跑跑跳跳");
        }
        
    }

    public static void main(String[] args) {
        
    }
    
}
