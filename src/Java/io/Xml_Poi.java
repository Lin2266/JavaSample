package Java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xml_Poi {

	public static void main(String[] args) throws Exception{
		//建立xlsx跟xls檔案，建立1張及多張工作表
		try {
			XSSFWorkbook xlsx = new XSSFWorkbook();
			FileOutputStream out_xlsx = new FileOutputStream(new File("E:/employee1.xlsx"));
			FileOutputStream out_xls = new FileOutputStream(new File("E:/employee1.xls"));
			XSSFSheet sheet_xlsx1 = xlsx.createSheet("測試");//建立第1個工作表						
			XSSFSheet sheet_xlsx2 = xlsx.createSheet("測試1");//建立第2個工作表
			xlsx.write(out_xlsx);
			out_xlsx.close();
			
			HSSFWorkbook xls = new HSSFWorkbook();
			HSSFSheet sheet_xls=xls.createSheet("xls工作簿");
			xls.write(out_xls);
			out_xls.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
			System.out.println("建立成功");
	}

}
