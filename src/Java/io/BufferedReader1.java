
package Java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
緩衝器為暫時置放輸出或輸入資料的記憶體。緩衝器內資料自儲存裝置（如硬碟），放置在緩衝器中，須待機送至CPU或其他運算裝置。
利用資料緩衝區(Buffer)可大量降低檔案操作的次數，以增加程式執行上的效率
*/
public class BufferedReader1 {

    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("src/Java/io/NewFile.txt");
            br = new BufferedReader(fr);
            String data;
            //字元為null
            while((data=br.readLine()) !=null){
                System.out.println(data);
            }
        } catch (IOException e) {
        }
        finally{
            try {
                //關閉br同時，也透過資料鏈結夥伴fr將資料寫入實體檔案，隨後fw也將被關閉
                br.close();//br跟fr是資料鏈結關係，關閉br即可
                //改成fr.close();br.close();時，程式雖可順利編譯與執行但實體檔案NewFile.txt卻可能造成資料
                //寫入不完全或根本沒有寫入的痕跡，若沒有撰寫br.close();NewFile.txt中將不會有新寫入的資料 
            } catch (Exception e) {
            }
        }
        
                
    }
    
}
