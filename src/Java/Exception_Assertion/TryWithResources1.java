package Java.Exception_Assertion;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 7.0 資源自動關閉
 * 將用到的I/O物件在try()包括裡面先行定義，java7編譯器會在編譯時期自動幫我們加上finally區段與close()
 * 資源關閉語法。
 */
public class TryWithResources1 {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("src/Java/Exception_Assertion/Java.txt");
			FileReader fr = new FileReader("src/Java/Exception_Assertion/Java.txt")) {
			
			fw.write("abcde");
			fw.flush();
			char[] data = new char[1];
			
			while(fr.read(data)!=-1){
				System.out.println(new String(data));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
