
package Java.util.Formatter1;

import java.util.Formatter;

/* Java5.0
Formatter是一種格式化譯印工具(譯印器)，能方便地撰寫想要的格式化輸出，不論是Numeric(數字)、String(字串)、Date/Time
(日期/時間)、Locale-Specific(地域特定格式)，皆可透過Formatter來轉換成所需要的格式輸出，而且輸出地點、編碼方式與
地域格式也可自行設定。
Formatter建構子分為14種，除了無帶參數的建構子外，其餘的13個建構子都是輸出地點(sink)、編碼方式(encoding)與
地域格式(locale)三種參數的組合。
『輸出地點』分成三種:

1.Appendable(可追加):
BufferdWiriter, CharArrayWriter, CharBuffer, FileWriter, FilterWriter,LogStream, OutputStream, PipedWriter,
PrintStream(此外LogStream也就是PrintStream的子類別)，PrintWriter, Stringbuffer, StringBuilder, StringWriter, Writer。
其相關建構子:PrintStream是實作Appendable
Formatter(Appendable a)
Formatter(Appendable a, Locale l)
Formatter(PrintStream ps)

2.File:
其相關建構子:
Formatter(File file)
Formatter(File file, String csn)
Formatter(File file, String csn, Locale l)
指定檔案名稱類:
Formatter(String fileName)
Formatter(String fileName, String csn)
Formatter(String fileName, String csn, Locale l)

3.OutputStream:
BytearrayOutputStream, FileOutputStream, FilterOutputStream, ObjectOutputStream, OutputStream, PipedOutputStream。
其相關建構子:
Formatter(OutputStream os)
Formatter(OutputStream os, String csn)
Formatter(OutputStream os, String csn, Locale l)

『編碼方式』包含big5、utf-8、iso8859-1。
『地域格式(locale)』則可以置入Locale物件，最後的兩個建構子就是:
Formatter()
Formatter(Locale l)

*/
public class Formatter1 {

    public static void main(String[] args) {
    	//格式化3種模式
    	int a = 10 ;
        int b = 20 ; 
        int c = 30 ;
    	//1.使用printf
        System.out.printf("%d %d %d \n",a,b,c);
        //%[index$][標識][最小寬度]轉換方式:第一個參數由 "1$" 引用，第二個參數由 "2$" 引用
        System.out.printf("%2$d %1$d %3$d \n",a,b,c);
    	
        //2.使用String.format
        System.out.println("整數百分比:" + String.format("%d%%", 12));
    	
        //3.使用Formatter的format()格式化後利用append()來鏈結字串
        StringBuilder sb = new StringBuilder("圓週");
        Formatter f = new Formatter(sb);
        f.format("率 = %f", Math.PI);//格式化後利用append()來鏈結字串
        System.out.println(sb);
        
    }
    
}
