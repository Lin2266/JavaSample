
package Java.io;


import java.io.FileOutputStream;

/*
可以將物件目前的狀態利用writeObject()方法寫入檔案中保存，日後再利用ObjectOutputStream所提供的readObject()
來取得該物件
*/

public class ObjectOutputStream1 {

    public static void main(String[] args) {
         AddInt ai = new AddInt();
            ai.calc(1,2,3,4); 
        String path="src/LIN/IntBean.ser";//沒東西寫進去
        try(FileOutputStream fos = new FileOutputStream(path);
            java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos)) {
            
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
