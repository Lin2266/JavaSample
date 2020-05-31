/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author User
 */
public class ObjectInputStream1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String path = "src/Java/io/IntBean.ser";
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
