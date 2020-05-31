
package Java.util.concurrent1;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

//2.ScheduledThreadPoolExecutor(排程化執行緒池):
//建立ScheduledExecutorService實體物件
//Executors.newSingleThreadScheduledExecutor();表示用單一執行緒來執行排定工作
//Executors.newScheduledThreadPool(2);可以指定建立執行緒數量來執行排定工作
//單次性排程:schedule()
//創建並在設定延遲時間後執行一個一次性的行動，也會返回一個ScheduledFuture實例
//重複性的排程:
//scheduleWithFixedDelay()
//排程會延遲1秒後開始進行第一次的工作任務(LottoCallable1)，爾後每一次工作任務完成後會間格1秒之後再進行下一個排成任務，
//且LottoCallable1的任務執行1秒因此每一次排程任務時間顯示將的差2秒
//scheduleAtFixedRate()
//排程時間以週期時間為準，LottoCallable1沒超過排程週期時間，所以會差1秒
public class ScheduledThreadPoolExecutor1 {
    //注意call()有拋出例外，main方法也要拋出例外
    public static void main(String[] args) throws Exception{
        ScheduledExecutorService exec = null;
        //建立ScheduledExecutorService實體物件
        //newSingleThreadScheduledExecutor()表示用單一執行緒來執行排定工作
       exec = Executors.newSingleThreadScheduledExecutor();
        //newScheduledThreadPool(2)可以指定建立執行緒數量來執行排定工作
        exec = Executors.newScheduledThreadPool(2);
        System.out.println("停一秒後開始排程... " + new Date());
        //單次性的排程:未來排程，設定暫停排程時間單位1000毫秒
        ScheduledFuture<Integer> future = exec.schedule(new LottoCallable(), 1000, TimeUnit.MILLISECONDS);
        
        //重複性的排程:
        //1.每計算一次停一次(1000排程延遲 + 1000 LottoCallable1任務執行時間)，會差2秒
        exec.scheduleWithFixedDelay(new LottoCallable1(),1000,1000, TimeUnit.MILLISECONDS);
        //2.(1000排程週期時間 + 1000 LottoCallable1任務執行時間)，LottoCallable1沒超過排定週期的時間，會差1秒
        exec.scheduleAtFixedRate(new LottoCallable1(),1000,1000, TimeUnit.MILLISECONDS);
        System.out.println("計算中...");
        int result = future.get();
        System.out.println("您的幸運數字是：" + result);
        exec.shutdown();
    }
    
}
