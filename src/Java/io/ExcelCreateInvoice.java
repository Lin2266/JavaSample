package Java.io;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelCreateInvoice {

	public static void main(String[] args) {
		try {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Invoices");
		
		String[] columnHeadings = {"Item id","Item Name","Qty","Item Price","Sold Date"};
		//前景顏色跟粗體
		XSSFFont headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short)12);
		headerFont.setColor(IndexedColors.BLACK.index);
		//用字體創建一個單元樣式
		CellStyle headerStyle = workbook.createCellStyle();
		headerStyle.setFont(headerFont);
		headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
		//創建標題行
		XSSFRow headerRow = sheet.createRow(0);
		//遍歷列標題以創建列
		for(int i=0;i<columnHeadings.length;i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columnHeadings[i]);
			cell.setCellStyle(headerStyle);
		}
		ArrayList<Excel_Invoices> arrayList = createData();
		}catch (Exception e) {
			System.out.println("建立excel失敗");
		}
	}
	
	private static ArrayList<Excel_Invoices> createData() throws ParseException{
		ArrayList<Excel_Invoices> a = new ArrayList();
		a.add(new Excel_Invoices(1,"Book", 2, 10.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/01/2020")));
		return a;
	}
}
