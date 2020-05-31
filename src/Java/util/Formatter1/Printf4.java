
package Java.util.Formatter1;



/*
 StringFormat1 例題一樣

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
public class Printf4 {

    public static void main(String[] args) {
        int pricePositive = 12000;

        System.out.printf("Price positive %d%n", pricePositive);
        System.out.printf("Price positive %+d%n", pricePositive);
        System.out.printf("Price positive %,d%n", pricePositive);
        System.out.printf("Price positive %(d%n", pricePositive);
        System.out.printf("Price positive %+,010d%n", pricePositive);

        System.out.println();

        int priceNegative = -12000;

        System.out.printf("Price positive %d%n", priceNegative);
        System.out.printf("Price positive %+d%n", priceNegative);
        System.out.printf("Price positive %,d%n", priceNegative);
        System.out.printf("Price positive %(d%n", priceNegative);
        System.out.printf("Price positive %+,010d%n", priceNegative);
    }
    
}
