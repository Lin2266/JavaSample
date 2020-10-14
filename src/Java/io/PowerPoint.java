package Java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;

public class PowerPoint {

	public static void main(String[] args) throws Exception{
		XMLSlideShow ppt = new XMLSlideShow();
		File file = new File("E:/PowerPoint.pptx");
		try {
			FileOutputStream out = new FileOutputStream(file);
			ppt.write(out);
			System.out.println("document created");
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("開啟檔案失敗");
		}

	}

}
