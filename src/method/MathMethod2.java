package method;

import java.io.Console;

public class MathMethod2 {
//自已定義的函式
    public static double power(double X, int n) {
        //power函式的定義，用來計算Xn。回傳值的資料型態是double，接受兩個傳入引數，資料型態分別是double,int，而return後面的變數powerXn是回傳值。
        int i;
        double powerXn = 1;
        for (i = 1; i <= n; i++) {
            powerXn = powerXn * X;
        }
        return powerXn;
    }

    public static void main(String[] args) {
        int k;
        double Ans;
        //Console要用cmd輸出
        Console console = System.console();
        System.out.print("計算3.5的k次方?請輸入k=");
        k = Integer.parseInt(console.readLine());
        //呼叫power函式，傳入的引數為3.5,k，與函式定義的參數名稱不相同，其實這並不重要，只要傳入符合資料型態的數值或變數即可（您也可以將引數與參數名稱設為相同，但即使如此，這兩個仍是不同的變數）。使用Ans變數來存放函式回傳值。
        Ans = power(3.5, k);
        System.out.println("3.5的" + k + "次方=" + Ans);
    }

}
