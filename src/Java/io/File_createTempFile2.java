package Java.io;

import java.io.File;
import java.io.IOException;

/*
static File createTempFile(String prefix, String suffix, File directory) 
方法會在指定的目錄中一個新的空文件，使用給定前綴和後綴字符串生成其名稱。

directory -- 該目錄中的文件被創建。對於默認的臨時文件目錄nullis來傳遞

在虛擬機終止時，請求刪除此抽象路徑名表示的文件或目錄。也就是說，程序運行deleteOnExit成功後，
File並沒有直接刪除，而是在虛擬機正常運行結束後才會刪除。

 */
public class File_createTempFile2 {

	public static void main(String[] args) {
		try {
			File  f = File.createTempFile("tmp",".txt", new File("src/Java/io/"));
			System.out.println("File Path:"+f.getAbsolutePath());
/*虛擬機終止時刪除文件deletes file when the virtual machine terminate
程序有個需求需要創建臨時文件，這個臨時文件可能作為存儲使用，但是程序運行結束後，這個文件應該就被刪除了。
在哪裡做刪除操作呢，需要監控程序關閉嗎，如果有很多地方可以中止程序，這個刪除操作需要都放置一份嗎？
其實只要這麼寫,程序結束後文件就會被自動刪除了：
*/			f = File.createTempFile("tmp",null,new File("src/Java/io/"));
			System.out.println("File Path:"+f.getAbsolutePath());
			f.deleteOnExit();
		} catch (IOException e) {
			System.out.println("建立檔案異常:"+ e);
		}

	}

}
