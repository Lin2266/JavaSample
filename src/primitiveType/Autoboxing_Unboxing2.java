
package primitiveType;

//基本資料型別的Wrapper Class使用Autoboxing/Unboxing的寫法
public class Autoboxing_Unboxing2 {

    public static void main(String[] args) {
       Character c = 'A';
       Byte b = 10;
       Short s = 10;
       Integer i = 10;
       Long l = 10L;//要加上L或l轉型
       Float F = 10.0F;//要加上F或f轉型
       Double d = 10.0D;//在Double中允許不加上D或d
       
       //在轉型中要注意的有:
       Long l2 = (long)i;//i為Integer，要使用轉型符號()，注意不要寫成(Long)了，不合法:Long l2 = (Long)i;
       Long l3 = i.longValue();//合法，Integer使用longValue()方法
       Integer i2 = b.intValue();//合法，Byte使用intValue()方法
       Integer i3 = (int)b;//這樣也可以，不合法:Integer i = b; Integer i = (byte)b;
       System.out.println(i2);
    }
    
}
