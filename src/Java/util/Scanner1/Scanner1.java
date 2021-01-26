
package Java.util.Scanner1;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
//       Scanner取得輸入會依據空白字元、空白鍵、Tab，傳回下一個輸入
//       第一種 nextInt()：取得使用者輸入的整數 
         int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入三個數字(以空白鍵分開)：");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        System.out.println("您輸入第一個數字為：" + num1 );
        System.out.println("您輸入第二個數字為：" + num2 );
        System.out.println("您輸入第三個數字為：" + num3 );
        
//        第二種 nextFloat()：取得使用者輸入的浮點數
//        float float1, float2, float3;
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("請輸入三個浮點數(以Tab鍵分開)：");
//        float1 = scanner.nextFloat();
//        float2 = scanner.nextFloat();
//        float3 = scanner.nextFloat();
//        System.out.println("您輸入第一個浮點數為：" + float1 );
//        System.out.println("您輸入第二個浮點數為：" + float2 );
//        System.out.println("您輸入第三個浮點數為：" + float3 );
//
//        第三種 nextLine()：取得使用者輸入的字串(包含空白字元、空白鍵、Tab)
//
//        String str1, str2, str3;
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("請輸入一字串：");
//        str1 = scanner.nextLine();
//        System.out.println("您輸入的字串一為：\n" + str1 );
//
//        第四種 next()：取得使用者輸入的字串(不包含空白字元、空白鍵、Tab)
//
//        String str1, str2, str3;
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("請輸入一字串：(不包含空白字元、空白鍵、Tab)");
//        str2 = scanner.next();
//        System.out.println("您輸入的字串一為：\n" + str2 );
    }
    
}
