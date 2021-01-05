package Java.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ars2Test {
	public static final String EXT_NAME = ".ars2";
	
	public static void main(String[] args) {
		File ars2File=null;
		OutputStream output = null;
		try {
			ars2File =  File.createTempFile("Ars2-",".ars2",new File("src/LIN/"));
			System.out.println(ars2File.getAbsolutePath());//取得檔案加路徑
			output = new BufferedOutputStream(new FileOutputStream(ars2File));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
