
package Java.util.concurrent1;
//同步並行(Concurrency)
//分離執行緒辜寫程序:java.util.concurrent.Executor(資源.執行者)介面分離了執行緒定義與呼叫程序，
//實作Executor簡化Thread寫法
import java.util.Date;
import java.util.concurrent.Executor;

//讓程式碼看起來更容易閱讀降低修改程式的風險
//Executor介面API定義execute(Runnable r)方法會得到Runnable物件而自行實施必要程序與行為，
//以下為「取得現在時間」的例子說明如何透過實作Executor介面的實施
public class GetTimeRunnable implements Runnable{

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + ":" + new Date());
    }
    
    public static void main(String[] args) {
        //用多型的方式來撰寫
        Executor exec = new MyExecutor();
        //execute()傳入Runnable物件讓呼叫程序變成單純(簡化寫法)，讓繁雜的執行緒建立與啟動程序封裝在execute()方法實作中
        exec.execute(new GetTimeRunnable());
        exec.execute(new GetTimeRunnable());
        exec.execute(new GetTimeRunnable());
        //這樣也可取得時間，感覺差不多，不用多實作一個介面跟方法
        Thread t1 = new Thread(new GetTimeRunnable(),"T1");
        t1.start();
        Thread t2 = new Thread(new GetTimeRunnable(),"T2");
        t1.start();
        Thread t3 = new Thread(new GetTimeRunnable(),"T3");
        t1.start();
        
        System.out.println(Thread.activeCount());//4個執行緒
    }
    
}

class MyExecutor implements Executor{
    //實作Executor的execute方法，把執行緒的建立與啟動程序寫在方法裡
    @Override
    public void execute(Runnable r) {
        new Thread(r).start();
    }
    
}