
package Java.util.concurrent1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//執行緒池，需要做關閉的動作
//執行緒池關係圖:
//Exector介面<一 ExecutorService介面<一 ScheduledExecutorService介面<-- ⅴ一 ScheduledThreadPoolExecutor類(實作跟繼承)
//                                  <-- AbstractExecutorService抽象 <一ThreadPoolExecutor類
//                                                                  <一ForkJoinPool類

//1.ThreadPoolExecutor(標準執行緒池):兩個實體Executors.newCachedThreadPool()緩存，Executors.newFixedThreadPool(2)固定
//2.ScheduledThreadPoolExecutor(排程化執行緒池執行器):
//單次性排程:schedule()，重複性的排程:scheduleWithFixedDelay()延遲的時間，scheduleAtFixedRate()週期的時間
//3.ForkJoinPool(分而治之的平行處理執行緒池):
//用了十個執行緒完成十個執行項目，建立的儲存池沒有限制執行緒數量
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i =0; i<10; i++){
            final int count = i;
            //submit提交
            service.submit(new Runnable() {

                @Override
                public void run() {
                    Thread.yield();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //pool-1-thread-1執行緒名稱
                    System.out.printf("%s,i: %d%n",Thread.currentThread().getName(),count);
//                    System.out.println(Thread.currentThread().getName());
                }
            });
            
        }
        service.shutdown();//關閉
    }
    
}
