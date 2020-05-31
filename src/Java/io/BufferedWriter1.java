
package Java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
緩衝器為暫時置放輸出或輸入資料的記憶體。緩衝器內資料自儲存裝置（如硬碟），放置在緩衝器中，須待機送至CPU或其他運算裝置。
利用資料緩衝區(Buffer)可大量降低檔案操作的次數，以增加程式執行上的效率
*/
public class BufferedWriter1 {

    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String[] data = new String[2];
        data[0] = "\n1z0-803";
        data[1] = "1z0-804";
        try {
            fw = new FileWriter("src/IO/NewFile.txt", true);
            bw = new BufferedWriter(fw);//fw跟bw是資料串流鏈結模式
            for(int i=0;i<data.length;i++){
                bw.write(data[i] + "\n");//這樣也可以換行
//                bw.newLine();//加入新的一行，換行
            }
            /*加強行迴圈
            for(String s:data){
                bw.write(s + "\n");
                bw.newLine();
            }
            */
        } catch (IOException e) {
        }
        finally{
            try {
                //關閉bw同時，也透過資料鏈結夥伴fw將資料寫入實體檔案，隨後fw也將被關閉
                bw.close();//bw跟fw是資料鏈結關係，關閉br即可
                //改成fw.close();bw.close();時，程式雖可順利編譯與執行但實體檔案NewFile.txt卻可能造成資料
                //寫入不完全或根本沒有寫入的痕跡，若沒有撰寫bw.close();NewFile.txt中將不會有新寫入的資料 
            } catch (IOException e) {
            }
        }
    }
    
}
