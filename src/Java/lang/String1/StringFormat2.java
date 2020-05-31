package Java.lang.String1;

public class StringFormat2 {
//特殊格式以%index$來做指定，下列範例是將a和b對調顯示
    public static void main(String[] args) {
        //宣告變數
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(String.format("以順序321來顯示:%3$d %2$d %1$d",a,b,c));
        System.out.printf("以特殊格式來做指定:%2$d %3$d %1$d \n",a,b,c);
        System.out.printf("正常順序:%d %d %d \n",a,b,c);
       
    }

}
