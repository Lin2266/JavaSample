package Java.io;


import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelCreateInvoice {

	public static void main(String[] args) {
		try {
		Workbook workbook = new XSSFWorkbook();
		Sheet sh = workbook.createSheet("Invoices");
		
		String[] columnHeadings = {"Item id","Item Name","Qty","Item Price","Sold Date"};
		//前景顏色跟粗體
		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short)12);
		headerFont.setColor(IndexedColors.BLACK.index);
		//用字體創建一個單元樣式
		CellStyle headerStyle = workbook.createCellStyle();
		headerStyle.setFont(headerFont);
		headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
		//創建標題行
		Row headerRow = sh.createRow(0);//從第0行
		//遍歷列標題以創建列
		for(int i=0;i<columnHeadings.length;i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columnHeadings[i]);
			cell.setCellStyle(headerStyle);
		}
		//檔案資料
		ArrayList<Invoices> a = createData();
		CreationHelper creationHelper = workbook.getCreationHelper();
		CellStyle dateStyle = workbook.createCellStyle();
		dateStyle.setDataFormat(creationHelper.createDataFormat().getFormat("mm/dd/yyyy"));
		int rownum =1;
		for(Invoices i: a) {
			Row row = sh.createRow(rownum++);//從第1行
			row.createCell(0).setCellValue(i.getIntmId());
			row.createCell(1).setCellValue(i.getItemName());
			row.createCell(2).setCellValue(i.getItemQty());
			row.createCell(3).setCellValue(i.getTotalPrice());
			Cell dateCell = row.createCell(4);
			dateCell.setCellValue(i.getItemSoldDate());
			dateCell.setCellStyle(dateStyle);
		}
		//Group and collapse rows分組和折疊行
		int noOfRows = sh.getLastRowNum();
		sh.groupRow(1,noOfRows);
		sh.setRowGroupCollapsed(1,true);		
		
		//create a sum row 建立公式
		Row sumRow = sh.createRow(rownum);
		Cell sumRowTitle = sumRow.createCell(0);//從第0欄
		sumRowTitle.setCellValue("Total");
		sumRowTitle.setCellStyle(headerStyle);
		
		String strFormula = "SUM(D2:D" + rownum +")";
		Cell sumcell = sumRow.createCell(3);//從第3欄
		sumcell.setCellFormula(strFormula);
		sumcell.setCellValue(true);
		
		//autosize columns自動調整列
		for(int i=0;i<columnHeadings.length;i++) {
			sh.autoSizeColumn(i);
		}
		Sheet sh2 = workbook.createSheet("Second");
		//write the output to file將輸出寫入文件
		FileOutputStream fileOut = new FileOutputStream("src/Java/io/invoices.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
		System.out.println("Completed");
		}catch (Exception e) {
			System.out.println("建立excel失敗");
		}
	}
	
	private static ArrayList<Invoices> createData() throws ParseException{
		ArrayList<Invoices> a = new ArrayList<>();
		a.add(new Invoices(1,"Book", 2, 10.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(2,"Table", 1, 50.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(3,"Lamp", 5, 100.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(4,"Pen", 100, 20.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(5,"Book", 2, 10.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(6,"Table", 1, 50.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(7,"Lamp", 5, 100.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(8,"Pen", 100, 20.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(9,"Book", 2, 10.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(10,"Table",1, 50.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(11,"Lamp", 5, 100.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(12,"Pen", 100, 20.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(13,"Book", 2, 10.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/01/2020")));
		a.add(new Invoices(14,"Table", 1, 50.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/02/2020")));
		a.add(new Invoices(15,"Lamp", 5, 100.0, new SimpleDateFormat("mm/dd/yyyy").parse("01/01/2020")));
		return a;
	}
}
