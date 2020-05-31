
package primitiveType;


//基本型態物件.parse基本型態  字串轉換成基本型態
public class Wrapper_parse {

    public static void main(String[] args) {
        String Sint = "123";
        int myint = Integer.parseInt(Sint);
        System.out.println("字串轉換成數字:"+myint);
        //字串轉換成數字:123
        
        String SFloat = "123.1";
        float myfloat= Float.parseFloat(SFloat);
        System.out.println("字串轉換成浮點數:"+myfloat);
        //字串轉換成浮點數:123.1
        
        String SDouble = "123.2";
        double mydouble= Double.parseDouble(SDouble);
        System.out.println("字串轉換成雙浮點數:"+mydouble);
        //字串轉換成雙浮點數:123.2
        
        //其它型態以此類推...
    }
    
}
