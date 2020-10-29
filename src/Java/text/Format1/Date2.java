package Java.text.Format1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		
		Date date1=null;
		Date date2=null;
		try {
			date1 = new SimpleDateFormat("yyyy-mm-dd").parse("2006-06-08");
			date2 = new SimpleDateFormat("yyyy-mm-dd").parse("2006-06-12");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

		long l = date1.getTime()-date2.getTime()>0 ? date1.getTime()-date2.getTime():
		date2.getTime()-date1.getTime();

		System.out.println(l/1000+"秒");

		//日期相減得到相差的日期
		long day = (date1.getTime()-date2.getTime())/(24*60*60*1000)>0 ? (date1.getTime()-date2.getTime())/(24*60*60*1000):
		(date2.getTime()-date1.getTime())/(24*60*60*1000);

		System.out.println("相差的日期: " +day +"天");
		
		
		

	}

}
