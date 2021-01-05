package Java.io;

import java.io.File;
import java.io.IOException;

/*
static File createTempFile(String prefix, String suffix) 
此方法創建的默認臨時文件目錄的空文件，使用給定前綴和後綴生成其名稱。

prefix -- 前綴字符串定義的文件名;必須至少有三個字符長
suffix -- 後綴字符串定義文件的擴展名;如果為null後綴".tmp" 將被使用

異常
IllegalArgumentException -- 如果前綴參數包含少於三個字符
IOException -- 如果文件創建失敗
SecurityException -- 如果SecurityManager.checkWrite
(java.lang.String)方法不允許創建一個文件
 */

public class File_createTempFile1 {

	public static void main(String[] args) {
		File f=null;
		try{
			//creates temporary(臨時) file
			f = File.createTempFile("tmp", ".txt", new File("src/LIN/"));
			//prints absolute(絕對) path
			System.out.println("File path:"+ f.getAbsolutePath());
			//副檔名沒加會自動加.tmp
			f = File.createTempFile("abc",null, new File("src/LIN/"));
			System.out.println("File path:"+ f.getAbsolutePath());
		}catch (Exception e) {
			System.out.println("參數不正確或檔案建立失敗"+ e);
		}

	}

}
