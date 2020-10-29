package Java.util.Formatter1;

import java.util.Calendar;
import java.util.Date;


public class Calendar2 {

	public static void main(String[] args) {
		// creating a Calendar object 
        Calendar c1 = Calendar.getInstance(); 
  
        // set Month 
        // MONTH starts with 0 i.e. ( 0 - Jan) 
        c1.set(Calendar.MONTH, 11); 
  
        // set Date 
        c1.set(Calendar.DATE, 05); 
  
        // set Year 
        c1.set(Calendar.YEAR, 1996); 
  
        // creating a date object with specified time. 
        Date dateOne = c1.getTime(); 
  
        System.out.println("Date: " + dateOne); 
  
        System.out.println(dateOne.getTime()); 

	}

}
