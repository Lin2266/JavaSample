
import java.util.Date;


public class DateSample {
public Date d = new Date();
public Date dd = new Date();
 public  void a(){
        System.out.println(d);
    }
 public void b(){
        System.out.println(dd);
    }
    public static void main(String[] args) throws InterruptedException {
        DateSample ds = new DateSample();
        ds.a();
        
        Thread.sleep(5000);
        ds.b();
        
        
       
    }
    
}
