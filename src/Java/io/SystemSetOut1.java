package Java.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class SystemSetOut1 {

	public static void main(String[] args) {
		InputStreamReader in = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream out = null;

		try {
			in = new InputStreamReader(System.in);//讀字符
			br = new BufferedReader(in);
			fos = new FileOutputStream("src/sample/OutputFile.txt");//輸出byte,預設false檔案有資料會清除
			bos = new BufferedOutputStream(fos);
			//true時會讓緩衝區內的資料自動清除，否則所輸入的資料會暫留緩衝區內，導致無法即時看見輸出的結果
			out = new PrintStream(bos,true);
			System.setOut(out);//將螢幕輸出改成檔案輸出
			String s;
			//
			while((s=br.readLine()).length() !=0){
				out.println("請輸入任意字串(quit 離開):");
				if(s.equals("quit")){
					System.out.println("離開中...");
					break;
				}
				System.out.println("您所輸入的字串是: " + s );
			}
			out.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				out.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

}
