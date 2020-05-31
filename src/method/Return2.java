
package method;

/*
使用return返回呼叫函式敘述如下：
return;     or      return 函式回傳值;
【語法說明】：
(1)使用return將返回呼叫函式處，並由呼叫函式的下一個敘述開始執行。
(2)一個函式的return並不限定為一個，不過一但執行return敘述後，其餘函式內未被執行的敘述將不會被執行。
(3)無回傳值的函式，不需要用return敘述返回，此時函式將被執行完畢後，才會返回呼叫函式處。而若使用return敘述返回，則在return之後的敘述不會被執行。
*/
public class Return2 {
    //多個return敘述的函式
    public static int func1(){
        int a=5,b=7;
        a++;
        if(a>0) return a+b;//條件達成將結果回傳返回
        //從這到方法結束都不會執行到
        a++;
        if(a>0) return a+b;
        a++;
        return a+b;
    }
    public static void main(String[] args) {
        int k;
        //程式執行到這會先計算a+b的值(6+7=13)，然後回傳給k並返回函式呼叫處
        k=func1();
        //return;完返回這繼續下面程式
        System.out.println("k=" + k);//k=13
    }
    
}
