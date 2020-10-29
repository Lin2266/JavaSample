package Java.io;

import java.io.File;

public class FileName1 {

	public static void main(String[] args) {
		// 舉例:
		String fName = "D:/Workspace_wdcs/metadata/plugins/org.eclipse.wst.server.core/tmp5/wtpwebapps/jdcs/tmp";

		// 方法一:

		File tempFile = new File( fName.trim()); 
		String fileName = tempFile.getName(); 
		System.out.println("fileName = " + fileName);
		// 方法二:

		String fName1 = fName.trim(); 
		String fileName1 = fName1.substring(fName1.lastIndexOf("/")+1); //或者 String fileName = fName.substring(fName.lastIndexOf("//")+1); System.out.println("fileName = " + fileName);
		// 方法三:

		String fName2 = fName.trim(); 
		String temp[] = fName2.split("////"); /**split裡面必須是正則表示式,"//"的作用是對字串轉義*/ 
		String fileName2 = temp[temp.length-1]; 
		System.out.println("fileName = " + fileName2); 

	}

}
