
package Java.util.Formatter1;
import java.util.Formatter;


public class Formatter3 {
    //將格式化後的資料輸出至StringBuffer(字串建造者)中
    public static void main(String[] args) {
    /*StringBuilder的物件宣告與format()的呼叫，是故意將『圓週』與『率』分開來寫，
    目的是要證明format()方法在輸出地點為StringBuilder的狀態下，會將最後格式化的
    結果利用sb的append()方法來鏈結字串，直接將sb所指向的StringBuilder物件內容輸出。
    */
        StringBuilder sb = new StringBuilder("圓週");
        Formatter f = new Formatter(sb);
        f.format("率 = %f", Math.PI);//格式化後利用append()來鏈結字串
        System.out.println(sb);
    
    }
    
}
