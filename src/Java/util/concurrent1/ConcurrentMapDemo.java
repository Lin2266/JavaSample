
package Java.util.concurrent1;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

//putIfAbsent()若不存在就放入，在解決Map資料注入若key值相等後面的資料會覆蓋先前的資料問題，避免資料版本比對的問題
public class ConcurrentMapDemo {

    
    public static void main(String[] args) {
        ConcurrentMap <String, String> partListA = new ConcurrentHashMap<>();
        partListA.put("key", "Red Shirt");
        partListA.put("key", "Blue Shirt");
        System.out.println("partListA: " + partListA);//資料被後面的覆蓋
        
        ConcurrentMap <String, String> partListB = new ConcurrentHashMap<>();
        //putIfAbsent()判斷Map容器是否已有相同key值的資料，若有，先前的資料會被保留
        partListB.putIfAbsent("key", "Red Shirt");
        partListB.putIfAbsent("key", "Blue Shirt");
        System.out.println("partListB: " + partListB);//資料存在就不覆蓋
        
    }
    
}
