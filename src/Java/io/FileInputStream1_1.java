
package Java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//7.0新寫法，try(){}自動關閉，不用finally區塊用close
public class FileInputStream1_1 {

    public static void main(String[] args) {
          
         int totalBytes;
         try(FileInputStream fis = new FileInputStream("src/LIN/NewFile.txt");) {
            totalBytes = fis.available();//available()取得資料位元組總數多少bytes 
            System.out.println("顯示可讀取資料位元組總數:" + totalBytes + "bytes.");
            
            //利用read()讀取2個bytes的資料並放入buffer中，再透過new string()將buffer資料放入，中文就可顯示
            //中文字佔2個byte，中文字之間有空白時產生的亂碼處理
            byte[] buffer = new byte[totalBytes];//設定read()讀取時將資料寫入該陣列中
            if(fis.read(buffer) == totalBytes){//!=-1也可以
                System.out.println("檔案內容:");
                System.out.println("---------------------------------------");
//                String s = new String(buffer);
//                System.out.println(s);
                //System.out.println(new String(buffer));//上面兩段直接寫一成一段也可以
                System.out.println(new String(buffer, 0, totalBytes));//寫這句或上面都可以
            }else{
                System.out.println("資料位元組總數錯誤！");
            }
            /*
            //有中文時用
            while(fis.read(buffer)==2){
                String s = new String(buffer);
                System.out.print(s);
            }
            //剩餘的資料
            //原因是因為不確定總體資長度一定是2的倍數，也就是不一定在while-loop中全部read()完畢，
            //所以寫一段程式來將剩餘的資料印出
            if(totalBytes%2 !=0){
                String s = new String(buffer,0,1);
                System.out.print(s);
            }
            */
            /*沒中文時用，有中文會亂碼
            while(fis.read(buffer) != -1){//將資料讀進buff的byte[]中，直到回傳值等於-1(沒資料可寫入)
                //將buffer[0]中的資料轉成char後印出，不轉型印出會顯示ASCII碼
                System.out.print((char)buffer[0]);
                //System.out.print((char)buffer[0]+"("+ buffer[0] +")");
            }
                    */
         }catch (FileNotFoundException e) {
            System.out.println("File not found.");
        
        } catch (IOException e) {
             System.out.println(e);
        }
    }
    
}
