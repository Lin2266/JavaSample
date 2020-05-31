
package Java.Exception_Assertion;

import java.io.IOException;
import java.sql.SQLException;

//捕捉多組例外、轉拋
public class CatchingMultipleException {
    //access存取,throws例外關係要比throw大，6.0需要更改方法簽章7.0轉拋throws不需要變更方法簽章多加Exception
    private static void access()throws SQLException, IOException{
       //數學隨機 0~1(不含1)之間亂數，小數點後面17位
       
        //繼承關係
//        if(Math.random() < 0.5){ 
//            throw new  FileNotFoundException("找不到檔案");
//        }else{
//            throw new IOException("無法開啟檔案");
//        }
        /*沒有繼承關係,7.0針對重拋例外(Rethrowing)增加更精確的型別判斷來彌補Java6編譯器的不足，
                    由於SQLException與IOException都是一種Exception，且例外處理時做都一樣，所以會想要統一將例外先
                    合併到一個catch區段後在進行拋出。
          java6進行重拋例外必須改變方法簽章，若不改變方法簽章編譯時期將會拋出Uncompliable source code-
          unreported exception...,access()方法簽章在throws中多定義了一個Exception，不過這種方式是危險的，
                    因為方法簽章的改變意味著所有有調用此方法的程序也必須被迫改變，牽一髮而動全身的影響下容易產生程式
                    實作上的風險與不便。
         
         */
        try{
            if(Math.random() < 0.5){ 
                throw new  SQLException("找不到檔案");
            }else{
            throw new IOException("無法開啟檔案");
            }
        }catch(Exception e){
        	/*轉拋
        	 throw e 必定捕捉throw new  SQLException跟throw new IOException，例外型別只有這兩種
        	 */
            throw e;
            
            
        }
        
    }
    
    public static void main(String[] args) {
        
//        try {
//            access();
//            //合併捕捉的處理方式僅限繼承關係
//        } catch (IOException e) {
//            System.out.println(e.getClass() + ":" + e.getMessage());
//        }
        //7.0多捕捉寫法，非繼承關係
        try {
            access();
            //合併捕捉的處理方式僅限繼承關係
        } catch (SQLException | IOException e) {
            System.out.println(e.getClass() + ":" + e.getMessage());
        }
    }
    
}
