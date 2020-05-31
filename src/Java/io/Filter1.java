
package Java.io;

/*

FilterInputStream(過濾):
實作上除非自行實作一個類別並且去繼承FilterInputStream才可以呼叫到FilterInputStream的建構子，
不然只有java.io的涵式庫中的類別才可以呼叫得到
建構子(存取權限)                                說明
Protected FilterInputStream(InputStream in)     藉由傳入的InputStream物件建立FilterInputStream

FilterOutputStream:
public FilterOutputStream(OutputStream out)     藉由傳入的OutputStream物件建立FilterOutputStream
                                                所傳入的out是指OutputStream下所有的子類別皆可傳入並建立
                                                FilterOutputStream物件

FilterReader:
protected FilterReader(Reader in)               藉由所傳入的Reader物件建立一個FilterReader

FilterWriter:
protected FilterWriter(Writer out)              藉由所傳入的Writer物件建立一個FilterWriter
*/
public class Filter1 {

    
    public static void main(String[] args) {
        
    }
    
}
