package method;

/*
 (3)類別內撰寫的函式分為static method與一般method，其中，static method內的敘述只能呼叫static method。
 (4)static關鍵字：由於主函式被宣告為static，而static method內的程式碼只能呼叫static method，因此為了要讓主函式main呼叫，故必須宣告為static method。
(5)參數群：
1.method名稱小括號內則是參數群，每宣告一個輸入參數，都必須清楚地宣告該參數的資料型態，也同時宣告該輸入參數在函式中所代表的變數名稱。而參數的資料型態將會限制住傳入引數之
資料型態。
2.參數的命名規則與一般變數的命名規則相同。
3.輸入參數在函式主體內屬於合法的資料變數，也就是說，我們不用在函式主體內宣告這些參數，就可以直接將這些輸入參數當作已宣告的變數使用。
4.若無引數需要傳遞，則參數列可以為空白，但( )不可省略。
 */
public class StaticMethod1 {
	int i = 1;

    //void沒有回傳值
    public void showWelcome(int print_times) {
        for (int a = 1; a <= print_times; a++) {
            System.out.println("您好，歡迎光臨");
        }
    }
    //有回傳值，回傳值的資料型態為int
    public static int Mul(int a, int b) {//在main主體內使用輸入參數a,b
        int result;
        result = a * b;
        return result;
        //return回傳資料，result為Mul函式的回傳值，執行完畢控制權返回呼叫函式的下一個敘述
    }

    public static double Add(double a, double b) {
        return (a + b);
    }

    public static void main(String[] args) {
        //static方法呼叫non-static的方法要用new的
        StaticMethod1 sm = new StaticMethod1();
        sm.showWelcome(2);
        //static method呼叫static method只要方法跟引數就好
        System.out.println("2*3的回傳值:"+ Mul(2,3));
        System.out.println("2+3的Double回傳值:"+ Add(2,3));
        

    }

}
