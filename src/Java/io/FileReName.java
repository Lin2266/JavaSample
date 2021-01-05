package Java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileReName {

	public static void main(String[] args) {
		/*
		 * 檔案移動最好不要使用Java的renameTo方法，而是應該使用apache的commons-io包，當然也可以自己封裝類似的方法。
			renameTo方法移動失敗是檔案系統不同造成的，補充測試發現不同的檔案系統，就算型別相同，移動也會失敗。
		 */
		 String filePath="src/LIN/NewFile2.txt";
		 File file = new File(filePath);
		 //FileWriter fWriter = new FileWriter(file);
		 	     
	     String c=file.getParent();
	     File mm=new File(c, "new.txt");
//	     boolean b = file.renameTo(mm);
//	     System.out.println(b);
	     //使用apache的FileUtils工具
	     try {
	         FileUtils.moveFile(file,mm);
	         System.out.println("success");
	     } catch (IOException e) {
	         e.printStackTrace();
	     }

	}

}
