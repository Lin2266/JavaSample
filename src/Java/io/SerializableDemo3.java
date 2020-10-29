
package Java.io;
//將IntBean.ser還原成當時的AddInt物件

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableDemo3 {

    public static void main(String[] args) {
        String path = "src/LIN/IntBean.ser";
        try(FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);) {
            AddInt ai = (AddInt)ois.readObject();
            if(ai != null)
                System.out.println(ai.getSum());
            else
                System.out.println("null");
        } catch (IOException e) {
            System.out.println("Error");
        }catch(ClassNotFoundException e){
            System.out.println("檔案不存在");
        }
    }
    
}
