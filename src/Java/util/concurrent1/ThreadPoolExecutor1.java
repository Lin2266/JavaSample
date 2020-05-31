
package Java.util.concurrent1;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

//ExectorService介面下的3個實作子類別ThreadPool:
//1.ThreadPoolExecutor(標準執行緒池):兩個實體Executors.newCachedThreadPool()，Executors.newFixedThreadPool(2)
//需要用Executors.newCachedThreadPool()(緩存)建立實體物件，表示Runnable可能將執行新建執行緒或重複利用的執行緒中
//若由Executors.newFixedThreadPool()(固定)建立實體物件，表示會在執行緒池中建立固定數量的執行緒

public class ThreadPoolExecutor1 {
    
//注意call()有拋出例外，main方法也要拋出例外
    public static void main(String[] args) throws Exception{
        
        ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        //也可建立固定數量(2)的執行緒讓Runnable或Callable物件來運行
        ThreadPoolExecutor exec1 = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        //future未來submit提交，把LottoCallable()的call()提交給future
        Future<Integer> future = exec1.submit(new LottoCallable());
        Future<Integer> future1 = exec1.submit(new LottoCallable());
        System.out.println("計算中...");
        //用Future的get()取得call()的回傳結果指派給result
        int result = future.get();
        System.out.println("您的幸運數字是：" + result);
        exec1.shutdown();//關閉/卸載ThreadPoolExecutor
    }
    
}
