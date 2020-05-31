package Recursion;

//recursion遞迴
public class recursion {
//邊際條件是n=1時,總合為1
//該函數可定成int sum(int n)
//sum(n) = n + sum(n - 1)
     public static void main(String[] argv) {
        //1.3.6.10.15.21.28
        //1=1. 2+1=3. 3+3=6. 4+6=10. 5+10=15. 6+15=21. 7+21=28, 第7項在加前面6項的值(21)=28
         System.out.println(sum(7));
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    
}
