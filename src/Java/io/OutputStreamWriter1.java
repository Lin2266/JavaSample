
package Java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
資料編碼轉換:
OutputStreamWriter是將character streams的資料轉換為byte streams的橋樑，可利用指定的字元集，
並利用write()方法將character編碼到bytes中

建構子                                                      說明
OutputStreamWriter(OutputStream out, String charsetName)    out是資料輸出端OutputStream物件，
                                                            String charsetName為字元集名稱

方法名稱            傳回值          說明
getEncoding()       String          取得目前Stream的編碼名稱，
                                    InputStreamReader、OutputStreamWriter皆有提供
*/
public class OutputStreamWriter1 {

    public static void main(String[] args) {
        //資料輸出編碼
        //Block of code...
        try(FileOutputStream fo = new FileOutputStream("NewFile.txt");
            //利用ISO2022CN(描述中文的字元集)為output的資料進行編碼
            OutputStreamWriter os = new OutputStreamWriter(fo, "ISO2022CN") ) {
            
            
        } catch (IOException ex) {
            
        }
    }
    
}
