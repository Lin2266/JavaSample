package method;

import java.io.Console;

//製作三個函式（Odd、Even、TotalSum函式），功能分別為計算奇數和、偶數和、整數和。
public class Odd_even_total {
    //用來計算1+3+…+U的奇數和。（total是回傳值）
    public static int odd(int U) {
        int i, total = 0;
        for (i = 1; i <= U; i++) {
            if (i % 2 == 1) {
                total = total + i;
            }
        }
        return total;
    }
    //用來計算2+4+…+U的偶數和。（total是回傳值）
    public static int even(int U) {
        int i, total = 0;
        for (i = 1; i <= U; i++) {
            if (i % 2 == 0) {
                total = total + i;
            }
        }
        return total;
    }
    //用來計算1+2+…+U的整數和。其中呼叫了odd及even函式，幫忙做奇數和與偶數和，合起來就是整數和（函式應盡量重覆使用以減少程式碼）。
    public static int totalSum(int U) {
        return odd(U) + even(U);
    }

    public static void main(String[] args) {
 //1+2+...+n=?請輸入n=10請問要做奇數和(O),偶數和(E),還是整數和(I)?請選擇:I總和為55    
        int n, sum;
        char addChoice;
        Console console = System.console();
        System.out.print("1+2+...+n=?請輸入n=");
        n = Integer.parseInt(console.readLine());

        System.out.print("請問要做奇數和(O),偶數和(E),還是整數和(I)?");
        System.out.print("請選擇:");
        addChoice = console.readLine().charAt(0);
        
 //依據不同的選擇，決定呼叫不同的函式，完成不同的功能。請特別注意，當使用者輸入非「O」、「E」、「I」時，將會執行default的程式，使用return結束main( )的執行，所以此時第59行不會被執行。這說明了return不但具有回傳值的功用，也同時會將控制權交回給呼叫方（會將控制權交還給JVM），中斷函式的執行。
        switch (addChoice) {
            case 'O':
                sum = odd(n);
                break;
            case 'E':
                sum = even(n);
                break;
            case 'I':
                sum = totalSum(n);
                break;
            default:
                System.out.println("選擇錯誤");
                return;//選擇錯誤return;會結束main()的執行，控制權將交回給呼叫方
        }
        //選擇完的結果會指派給sum
        System.out.println("總和為" + sum);//return;這邊不會被執行到
    }

}
