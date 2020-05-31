package Java.Exception_Assertion;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
7.0以前的關閉資源寫法
在撰寫I/O相關程式時常常都會被提醒「I/O資源使用完畢或系統結束時請記得要關閉(close)資源
 */
public class TryWithResources {

	public static void main(String[] args) {
		FileWriter witer = null;
		FileReader reader = null;
		try {
			witer = new FileWriter("src/Java/Exception_Assertion/Java.txt");
			reader = new FileReader("src/Java/Exception_Assertion/Java.txt");
			//將"Hello Java 7"字串寫入Java.txt
			witer.write("Hello Java 7");
			witer.flush();//緩衝區
			//宣告一個可以放文字的陣列
			char[] data = new char[1];
			
			//將Java.txt的檔案內容讀出
			while(reader.read(data) !=-1){
				System.out.print(new String(data));//不需轉String也可以
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		finally {
			if(witer !=null){
				try {
					witer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace(System.out);
				}
			}
			if(reader !=null){
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace(System.out);
				}
		}

	}

}
}
