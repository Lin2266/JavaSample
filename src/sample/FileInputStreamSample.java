package sample;

import java.io.FileInputStream;
import java.io.IOException;

//開啟一個檔案然後把裡面的中文字印出來，中文字中間有空格也要顯示出來
public class FileInputStreamSample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("src/sample/NewFile.txt")) {
			int bytes = fis.available();
			byte[] buff = new byte[bytes];
			String strch = "中";
			char ch = '中';
			System.out.println((byte)ch+", "+(int)ch);
			
			
			char ch1 = 20014;
			System.out.println(ch1);
			System.out.println(ch);
			System.out.println(strch.getBytes().length);
			System.out.println(strch.getBytes("950").length);
			for(int i =0; i < strch.getBytes().length; i++)
				System.out.println(strch.getBytes()[i]);
//			while(fis.read(buff)!=-1){//
//				System.out.println(new String(buff));
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

