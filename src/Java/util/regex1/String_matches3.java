package Java.util.regex1;

public class String_matches3 {

    public static void main(String[] args) {
       // 手機號碼檢查
        String a = "0935751111";
        System.out.println(a.matches("0[0-9]{9}")); // true
        String a1 = "0988-100432";//or  
        System.out.println(a1.matches("[0-9]{4}-[0-9]{6}"));
        
        // Eamil
        String b = "leeeee@yahoo.com.tw";
        System.out.println(b.matches("[A-Za-z_]{1}[A-Za-z1-9_\\.]*@[A-Za-z1-9_]{1}[A-Za-z1-9_\\.]*")); // true

        // 簡易身分證，[A-Z]{1} A~Z任何一個字，[12]{1}1~2任何一個字，[0-9]{8}0~9任何8個字，總共10個字
        String c = "C222990912";
        System.out.println(c.matches("[A-Z]{1}[12]{1}[0-9]{8}")); // true
    }

}
