
package Java.lang.String1;

public class String2 {

    public static void main(String[] args) {
       String s = " Java Duke ";
        //length()空白也會算
       int len = s.trim().length();//trim()只去掉前後的空白，中間的空白仍會在
        System.out.print(len);
    }
    
}
