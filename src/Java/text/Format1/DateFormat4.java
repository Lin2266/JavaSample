package Java.text.Format1;


import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormat4 {

    public static void main(String[] args) {
        Date date = new Date();
        
        //用us會顯示英文
        Locale locale = Locale.US;
	    
        String s = DateFormat.getDateInstance(DateFormat.SHORT, locale).format(date);
        System.out.println("SHORT : " + s);
	    
        s = DateFormat.getDateInstance(DateFormat.MEDIUM, locale).format(date);
        System.out.println("MEDIUM : " + s);
	    
        s = DateFormat.getDateInstance(DateFormat.LONG, locale).format(date);
        System.out.println("LONG : " + s);
	    
        s = DateFormat.getDateInstance(DateFormat.FULL, locale).format(date);
        System.out.println("FULL : " + s);
	    
        s = DateFormat.getDateInstance(DateFormat.DEFAULT, locale).format(date);
        System.out.println("DEFAULT : " + s);
	    
        try {
            date = DateFormat.getDateInstance(DateFormat.DEFAULT, locale).parse("Feb 8, 2005");
            System.out.println("Parse : " + date);
        } 
        catch (ParseException e) {
            System.out.println(e);
        }
        
    }

}
