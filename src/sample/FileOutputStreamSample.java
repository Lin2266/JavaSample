package sample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//把指定的字串寫入到指定的檔案裡
public class FileOutputStreamSample {

	public static void main(String[] args) {
		String s = "Java 輸入與輸出 ( java.io 函式庫 )";
		try(FileOutputStream fos = new FileOutputStream("src/sample/NewFile2.txt",true)) {
			byte[] tytes = s.getBytes();
			fos.write(tytes);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
