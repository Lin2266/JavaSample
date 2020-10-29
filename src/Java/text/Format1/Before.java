package Java.text.Format1;

import java.util.Date;

public class Before {

	public static void main(String[] args) {
		// create 2 dates
	      Date dt1 = new Date(2017, 3, 31);
	      Date dt2 = new Date(2017, 5, 14);

	      // Check if dt1 is  before dt2
	      boolean result = dt1.before(dt2);//dt1的日期是在dt2的日期之前
	      System.out.println("Date1 is before date2: " + result);

	      // Check if dt2 is  after dt1
	      result = dt2.before(dt1);//2不是在1之前，是之後
	      System.out.println("Date2 is before date1: " + result);
	      
	      result = dt2.after(dt1);//2是在1之後
	      System.out.println("Date2 is after date1: " + result);

	}

}
