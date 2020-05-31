
package Java.lang.String1;

public class split3 {

    public static void main(String[] args) {
        String s="我這只是喜歡.不and是愛";
        //這裡必須使用\\來指明我們使用“.”來分割字符串。如果需要將一個字符串用不同的字符分割的話，
        //可以用“｜”作為連接符 
        String[] ss=s.split("\\.|and");
        int i=0;
        while(i<ss.length)
        {
            System.out.println(ss[i]);
            i++;
        }
    }
    
}
