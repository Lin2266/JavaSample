package Java.text.Format1;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormat1 {

    public static void main(String[] args) {
        double d = 123.45;
		
        NumberFormat format = NumberFormat.getCurrencyInstance();
        NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat formatDE = NumberFormat.getCurrencyInstance(Locale.GERMANY);
	//國家的貨幣符號	
        System.out.println("Format currency (default): " + format.format(d));
        System.out.println("Format currency (US): " + formatUS.format(d));
        System.out.println("Format currency (DE): " + formatDE.format(d));
		
        try {//分析貨幣變數字而已
            Number n = format.parse("NT$123.45");
            System.out.println("Parsed currency 1 : " + n);
		
            Number n2 = formatUS.parse("$123.45");
            System.out.println("Parsed currency 2 (US) : " + n2);

            Number n3 = formatDE.parse("123,45 €");
            System.out.println("Parsed currency 3 (DE) : " + n3);
	
        } 
        catch (ParseException e) {
            System.out.println(e);
        }
        
    }

}
