package Java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * 讓程式可以直接擷取到使用者輸入(System.in)的資料，並利用PrintWriter()物件將取得的資料輸出(System.out)至螢幕
 * 
 * PrintStream(OutputStream out):建立一個新的PrintStream物件
 * PrintStream(OutputStream out, boolean autoFlush):建立一個新的PrintStream物件，並設定緩衝區資料是否自動清除
 * ，若autoFlush設定為true，表示要將緩衝區內的資料自動清除。
 * PrintStream(OutputStream out, boolean autoFlush, String encoding):建立一個新的PrintStream物件，並設定緩
 * 衝區資料是否自動清除，以及為輸出資料編碼(encoding)
 */
public class SystemInOut1 {

	public static void main(String[] args) {
		InputStreamReader in = null;//將byte轉成char
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
		//System.in傳進來一個Stream型態資料(Bytes),利用InputStreamReader將資料轉換為Unicode character	
		in = new InputStreamReader(System.in);
		//利用br將資料讀入緩衝區，以便readLind()方法逐行讀取資料
		br = new BufferedReader(in);
		//true時會讓緩衝區內的資料自動清除，否則所輸入的資料會暫留緩衝區內，導致無法即時看見輸出的結果
		pw = new PrintWriter(System.out,true);
		String s;
		while(true){
			pw.println("請輸入任意的字串(quit 離開)");
			s = br.readLine();
			if(s.equals("quit")){
				System.out.println("離開中...");
				break;
			}
			pw.println("\n您所輸入的字串是= " + s);
		} 	
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
