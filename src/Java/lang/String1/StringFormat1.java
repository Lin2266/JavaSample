package Java.lang.String1;

/*
 %[index$][標識][最小寬度]轉換方式:
 標識：
 '-'    在最小寬度內左對齊，不可以與「用0填充」同時使用
 '#'    只適用於8進制和16進制，8進制時在結果前面增加一個0，16進制時在結果前面增加0x
 '+'    結果總是包括一個符號（一般情況下只適用於10進制，若對像為BigInteger才可以用於8進制和16進制）
 '  '    正值前加空格，負值前加負號（一般情況下只適用於10進制，若對像為BigInteger才可以用於8進制和16進制）
 '0'    結果將用零來填充
 ','    只適用於10進制，每3位數字之間用「，」分隔
 '('    若參數是負數，則結果中不添加負號而是用圓括號把數字括起來（同『+』具有同樣的限制）
 */
public class StringFormat1 {

    public static void main(String[] args) {
        int no = 2;
        String strNo = String.format("%02d", no);
        System.out.println(strNo);
        
        //d-十進制 o-八進制 x或X-十六進制
        System.out.println(String.format("%1$,09d", -3123));//-0003,123  1$第1個參數，九位數沒滿的補0
        System.out.println(String.format("%1$9d", -31)); //      -31    9位數沒滿的補空格
        System.out.println(String.format("%1$-9d", -31));//-31  -往左縮排
        System.out.println(String.format("%1$(9d", -31)); //     (31)
        System.out.println(String.format("%1$#9x", 5689)); //   0x1639
         System.out.println(String.format("%1$,09d", -31234567));//-31,234,567      加逗號為符號格式
       
       
       
       
       

    }

}
