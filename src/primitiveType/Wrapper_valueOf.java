
package primitiveType;


//String.valueOf 基本型態轉換成字串
public class Wrapper_valueOf {

    public static void main(String[] args) {
        int num = 123;
        String Snum = String.valueOf(num);
        System.out.println("數字變字串:"+Snum);
        //數字變字串:123
        
        double numf = 123.1;    
        String Snumf = String.valueOf(numf);
        System.out.println("浮點變字串:"+Snumf);
        //浮點變字串:123.1
    }
    
}
