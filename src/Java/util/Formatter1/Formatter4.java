
package Java.util.Formatter1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

import flowControl_if_for.if_else6;

//close()方法是用來關閉資源，當使用檔案系統為格式化結果輸出的目的地時，
//記得呼叫Formatter所提供的close()方法來釋放資源，以免產生lock(鎖)的問題。
public class Formatter4 {
//將格式化後的資料輸出至檔案Foo.txt中(沒指定目錄時，預設會放在專案路徑的根目錄下(OCJPJ)
    public static void main(String[] args) {
        try {
            //建構子public Formatter(File file) throws FileNotFoundException檔案不存在例外
            Formatter f = new Formatter(new File("F:/JAVA_C/eclipse-jee-2018-09-win32-x86_64/專案/JavaSample/src/Foo.txt"));//開啟/建立檔案
            if(f != null) {
            f.format("圓週率 = %f",Math.PI);//要存在StringBuilder再印出來
            System.out.printf("圓週率:%f",Math.PI);
            }else {
            	System.out.println("檔案不存在");
            }
            f.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Formatter4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
