package sample;

import java.io.FileReader;
import java.io.IOException;

public class FileReadSample {

	public static void main(String[] args) {
		char[] buffer = new char[1];
		FileReader fr = null;
		try{
			fr = new FileReader("src/sample/NewFile.txt");
			while(fr.read(buffer) !=-1){
				System.out.print(buffer);
			}
//		try(FileReader fr = new FileReader("src/sample/NewFile.txt");) {
//			while(fr.read(buffer) !=-1){
//				System.out.print(new String(buffer));
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
