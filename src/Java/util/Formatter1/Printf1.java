
package Java.util.Formatter1;


/*
Java5.0版提供的格式化方法，printf()是使用PrintStream中的format()方法來實作，format()原始碼本身就是使用
Formatter物件與物件內已經實作好的format()(non-thread-safe)，再加上synchronized()來加以統合實作，
是thread-safe，所以System.out.printf()也是thread-safe。
PrintWriter類別物件中也提供了format()，與PrintStream一樣，thread-safe

System.out.printf()改成呼叫System.out.format()也會得到相同的結果
*/
public class Printf1 {

    public static void main(String[] args) {
        int i = 0;
        System.out.printf("(0):i ==>" + i + "\n");
        System.out.printf("(02):i ==> %d%n",i);//%d是十進制整數，將參數i的內容值格式化成十進制整數，並放在%d位置，%n是換行
        System.out.printf("(03):PI ==> %f",Math.PI).println();//%f浮點數
        System.out.printf("(04):PI ==> %e%n",Math.PI);//%e為科學符號
        //多個參數
        System.out.printf("(05):PI ==> %f and E ==> %f%n",Math.PI,Math.E);//PI圓周率，E自然對數
        //利用"$"來指定特定順位參數:2$為指定參數2，0為前面補0，9為長度(MissingFormatArgumentException缺少格式參數異常)
        System.out.printf("(06):E ==> %2$09f and PI ==> %1$f%n",Math.PI,Math.E);
        //利用"<"來表示再次使用前一個參數
        System.out.printf("(07):PI ==> %f and PI ==> %<f%n",Math.PI,Math.E);
        //長度(width)與精準度(pecision):%width.precisionf
        System.out.printf("(08):PI ==> %10.2f%n",Math.PI);//長度10，.2精準度為小數點2位(3.14)
        //%f、%e、%E的精確度預設值是0.6。%g、%G的精確度就是顯示所有的數字，因此輸出長度width的限定，將使用科學記號來輸出
        System.out.printf("x ==> %.2f%n",12345.56789);//到小數點2位的精確度
        System.out.printf("y ==> %.10f%n",12345.56789);//小數點後面10位，不夠後面補0
        System.out.printf("z ==> %.2g%n",12345.56789);//e是小數點2位，不夠補科學符號
        //精確度還可以讓%b、%B、%h、%s來決定最大的輸出字元數
        System.out.printf("x ==> %.2s%n",12345.56789);//取出最大兩位數
        //format:flag(-)(+)
        System.out.format("09):PI ==> %-10.2f%n", Math.PI);//(-)數字往左移，3.14為4個長度(10的長度)後面會補6個空格
        System.out.format("09):PI ==> %+10.2f%n", Math.PI);//(+)數字往右移，+3.14為5個長度(10的長度)前面會補5個空格
        
    }
    
}
