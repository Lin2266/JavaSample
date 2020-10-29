package Java.io;

import java.io.File;

public class RenameTo {

	public static void main(String[] args) {
		// 修改檔名
		File f=new File("d:/new1.txt");
		String c=f.getParent();
		System.out.println(c);
		//修改後的檔名
		File mm=new File(c, "new2.xml");
		if(f.renameTo(mm))
		{
		System.out.println("修改成功!");
		}
		else
		{
		System.out.println("修改失敗");
		}

	}

}
