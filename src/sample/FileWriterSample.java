package sample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {

	public static void main(String[] args) {
		String data = "Java 輸入與輸出 ( java.io 函式庫 )";
		FileWriter fw = null;
		try {
			 fw = new FileWriter("src/sample/NewFile2.txt");
			fw.write(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fw.close();//資源沒關閉會沒辦法寫入
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
