
package Java.util.Scanner1;

import java.util.Scanner;


/*
Scanner(掃描儀)簡易的I/O工具:
Java5.0提供了Scanner的簡易I/O類別，並可根據regex(正則運算式的設定)來處理I/O，其建構子根據輸入來源與encode字元編碼的組合，提供了8種建構子:
建構子                              說明
Scanner(File source)                建立一個輸入來源為檔案的Scanner
Scanner(File source,                建立一個輸入來源為檔案且字元編碼為charsetName的Scanner
String charsetName)

Scanner(InputStream source)         建立一個輸入來源為InputStream的Scanner
Scanner(InputStream source,         建立一個輸入來源為InputStream且字元編碼為charsetName為Scanner
String charsetName)

Scanner(Readable source)            建立一個輸入來源為Readable(可讀)的Scanner

Scanner(ReadableByteChannel source) 建立一個輸入來源為ReadableByteChannel(可讀位元通道)的Scanner
Scanner(ReadableByteChannel source, 建立一個輸入來源為ReadableByteChannel(可讀位元通道)且字元編碼為
String charsetName)                 charsetName的Scanner

Scanner(String source)              建立一個輸入來源為字串的Scanner

方法以起頭名稱當作功能面加以分類:
1.findXXX():以正規運算式的pattern來搜尋比對出符合的資料，其方法包含:
findInLine()查找線路、findWithinHorizon()發現在地平線

2.hasXXX():用來判斷是否可以讀取下一筆資料:
hasNext()、hasNextBigDecimal()、hasNextBingInteger()、hasNextBoolean()、hasNextByte()、hasNextDouble()、
hasNextFloat()、hasNextInt()、hasNextLine()、hasNextLong()、hasNextString()

3.nextXXX():讀取一個token(象徵)資料:
讀取字串用next()方法、讀取BigDecimal資料型別用nextBigDecimal()、nextBigInteger()、nextBoolean()、nextByte()、
nextDouble()、nextfFloat()、nextInt()、nextLine()、nextLong()、nextShort()

4.useXXX():設定Scanner使用方法的資訊:
設定分隔符號的useDelimiter()、地域useLocale()、數學基數(10或16進位)useRadix()

*/
public class Scanner3 {

    public static void main(String[] args) {
        //如輸入資料不符型態則會丟出一個InputMismatchExcpetion(輸入匹配例外)
        //Scanner s = new Scanner(System.in);//使用者自行輸入
        //事先在程式中給定資料的方式，可以是hard code(硬編碼)一個字串、檔案或資料串流等。
        Scanner s = new Scanner("100 Java");//Scanner會利用預設的空白(" ")分隔符號來分離100與Java，讓nextInt()跟next()讀出
        //s.useDelimiter(",");//改變分隔符號
        System.out.println("請輸入數字: ");
        int i = s.nextInt();//讀取System.in輸入的int資料
        System.out.println("請輸入字串: ");
        String str = s.next();////讀取System.in輸入的String資料
        System.out.println("您輸入的數字是: " + i);
        System.out.println("您輸入的字串是: " + str);
        s.close();
    }
    
}
