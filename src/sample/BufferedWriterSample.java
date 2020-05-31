package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		String[] s = new String[2];
		s[0]="\n1z0-803";
		s[1]="1z0-804";
		
		try {
			fw = new FileWriter("src/sample/NewFile.txt",true);
			bw = new BufferedWriter(fw);
			for(String ss:s){
				bw.write(ss);
				bw.newLine();
			}
//			for(int i = 0; i<s.length;i++){
//				bw.write(s[i]);
//				bw.newLine();
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
