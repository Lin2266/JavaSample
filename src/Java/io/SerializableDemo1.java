package Java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;


/*
 Serializable序列化:
 就是將物件轉換成一種連續性的bytes資料，用以存放(存檔)或在網路環境中的遠端傳遞(例:RMI)，以便日後能還原成序列化之前
 的物件狀態。
 只要在要序列化物件的類別後面宣告定義implements Serializable，不必實作任何方法，也沒有提供任何方法可實作
 反序列化的同時，當下必須要有該序列化物件的類別檔案
 */
//製作一個整數連加器
class AddInt implements Serializable {
    //利用javac -Xlint編譯AddInt.java時會產生未給定serialVersionUID(序列化的版本UID)的警告訊息
    //若想避免該警告的發生，可以在AddInt類別中加入以下的屬性
    /*
     serialVersionUID用來表明類的不同版本間的兼容性。如果你修改了此類,要修改此值。否則以前用老版本的類序列化的類恢復時會出錯。
     為了在反序列化時，確保類版本的兼容性，最好在每個要序列化的類中加入private static final long serialVersionUID這個屬性，
     具體數值自己定義。
     序列化時為了保持版本的兼容性，即在版本升級時反序列化仍保持對象的唯一性。

     你可以隨便寫一個，在Eclipse中它替你生成一個，有兩種生成方式：
     一個是默認的1L，比如：private static final long serialVersionUID = 1L;
     一個是根據類名、接口名、成員方法及屬性等來生成一個64位的哈希字段，比如：private static final long serialVersionUID = -8940196742313994740L;之類的。
     */

    private static final long serialVersionUID = 1;

    /*
     實作Serilizable介面，將不需要序列化的屬性前加上修飾字　transient，序列化物件的時候，這個屬性就不會序列化到指定的目的地中。
     transient短暫，修飾過後的屬性，最後的內容值將不會存留於序列化中，執行時最後求得的結果為0，
     
     */
    //private int sum = 0;
    private transient int sum = 0;
    //transient int i = 2;//加上修飾字  transient ，所以序列化寫入檔案並沒有存入值.
    //static transient int j = 4; //transient 對static變數是無效的，所以值依然可以帶入檔案

    //因為sum沒有被序列化，所以得到的只是sum的初始值

    public void calc(int... c) {//計算
    	File f=null;
    	BufferedWriter bw =null;
		try{
			//creates temporary(臨時) file
			f = File.createTempFile("tmp", ".txt", new File("src/LIN/"));
			
			//prints absolute(絕對) path
			System.out.println("File path:"+ f.getAbsolutePath());
			bw = new BufferedWriter(new FileWriter(f));
        for (int i = 0; i < c.length; i++) {
            System.out.println(sum += c[i]);
            bw.write("transient:" + sum +"\n");//因為是字串串接，所以會被寫到檔案
            bw.write( sum );//此行不會被寫進檔案
            System.out.println();
        }
    }catch (IOException e) {
		System.out.println("寫檔失敗");
	}finally {
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    }	
    public int getSum() {
        return sum;
    }
}

public class SerializableDemo1 {

    public static void main(String[] args) {
        AddInt add = new AddInt();
        add.calc(2,3,4);
        add.getSum();
        

    }

}
