package Java.io;

import java.io.*;
import java.sql.*;

import org.apache.poi.hssf.usermodel.*;

public class MySql2Excel {
	
	public MySql2Excel() throws Exception
	{
	Connection con = null ;
	DBConnection db = new DBConnection() ;
	con = db.getDB() ;
	System.out.println("資料庫連線成功");
	String sql ="select * from employee" ;
	ResultSet rs = con.createStatement().executeQuery(sql) ;
	// 獲取總列數
	int CountColumnNum = rs.getMetaData().getColumnCount() ;
	int i =1 ;
	// 建立Excel文件
	HSSFWorkbook wb = new HSSFWorkbook() ;
	// sheet 對應一個工作頁
	HSSFSheet sheet = wb.createSheet("公司員工資料") ;
	HSSFRow firstrow = sheet.createRow(0); //下標為0的行開始
	HSSFCell[] firstcell = new HSSFCell[CountColumnNum];
	String[] names = new String[CountColumnNum];
	names[0] ="id";
	names[1] ="firstname";
	names[2] ="lastname";
	names[3] ="birthdate";
	names[4] ="salary";
	for(int j= 0 ;j<CountColumnNum; j++ ){
	firstcell[j] = firstrow.createCell((short)j);
	firstcell[j].setCellValue(new HSSFRichTextString(names[j]));
	}
	while(rs.next())
	{
	// 建立電子表格的一行
	HSSFRow row = sheet.createRow(i) ; // 下標為1的行開始
	for(int j=0;j<CountColumnNum;j++ )
	{
	// 在一行內迴圈
	HSSFCell cell = row.createCell((short) j) ;
	// 設定表格的編碼集，使支援中文
	//// 先判斷資料庫中的資料型別
	// 將結果集裡的值放入電子表格中
	cell.setCellValue(new HSSFRichTextString(rs.getString(j+1))) ;
	}
	i++ ;
	}
	// 建立檔案輸出流，準備輸出電子表格
	OutputStream out = new FileOutputStream("E:\\employee.xls") ;
	wb.write(out) ;
	out.close() ;
	System.out.println("資料庫匯出成功") ;
	rs.close() ;
	con.close() ;
	}
	public static void main(String[] args)
	{
	try {
	@SuppressWarnings("unused")
	MySql2Excel excel = new MySql2Excel() ;
	} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("資料庫匯出失敗");
	}
	}

}
