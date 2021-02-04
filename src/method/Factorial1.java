package method;

import java.io.Console;

public class Factorial1 {
	//自訂階層
    public static long factorial(int p){
        long result = 1L;
        for (int count = 1; count <= p; count++) {
            result = result * count;
        }
        return result;
    }

    public static void main(String[] args) {
        int m, n;
        long ans;
        Console console = System.console();
        long temp[] = new long[3];

        System.out.println("求排列組合C(m,n)");
        System.out.print("m = ");
        m = Integer.parseInt(console.readLine());
        System.out.print("n = ");
        n = Integer.parseInt(console.readLine());
        //共被呼叫了3次
        temp[0] = factorial(m); // 計算 m! 的值
        temp[1] = factorial(n); // 計算 n! 的值
        temp[2] = factorial(m - n); // 計算 (m-n)! 的值
        ans = (temp[0]) / (temp[1] * temp[2]); //C(m,n)=(m!)/(n!*(m-n)!)
        System.out.println("C(" + m + "," + n + ")=" + ans);
    }

}
