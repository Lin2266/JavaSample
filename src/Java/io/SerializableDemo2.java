
package Java.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//將AddInt物件存檔成IntBean.ser
class SaverAddIntBean{
    public void write(){//寫
        AddInt ai = new AddInt();
            ai.calc(1,2,3,4); 
        String path="src/LIN/IntBean.ser";//沒東西寫進去
        try(FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(ai);
            System.out.println("Successfully");//順利
            //oos.flush();

        } catch (Exception e) {
            System.out.println("Error:" + e);//java.io.FileNotFoundException: src\io\IntBean.ser (系統找不到指定的路徑。)
            System.out.println("Error:" + e.toString());//java.io.FileNotFoundException: src\io\IntBean.ser (系統找不到指定的路徑。)
           
            System.out.println("Error:" + e.getMessage());//src\io\IntBean.ser (系統找不到指定的路徑。)
            System.out.println("Error:" + e.getStackTrace());//[Ljava.lang.StackTraceElement;@15db9742 記憶體跟蹤
            System.out.println("Error:" + e.getCause());//null
           
            
        }
    }
}
public class SerializableDemo2 {

    public static void main(String[] args) {
        new SaverAddIntBean().write();
    }
    
}
