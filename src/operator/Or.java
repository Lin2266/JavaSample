
package operator;
//or判斷句 | 跟 || 的差別
public class Or {

    public static void main(String[] args) {
       //or | 運算子，程式由左至右，不管第一句是true或fals第二句也還是會執行判斷
       int a = 1;
       int b = 2;
       if ((a<b) | (++a>0)) {//(++a>0)有執行到a才會遞增到
           System.out.println("a = " + a);//a=2
       }
       //or || 運算子，第一句判斷為true就會執行內容，第二句就不會在執行判斷
       int c = 1;
       int d = 2;
       if ((c<d) || (++c>0)) {//(++a>0)沒執行到a不會遞增到
           System.out.println("c = " + c);//a=1
       }
    }
    
}
