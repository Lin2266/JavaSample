
package Java.util.concurrent1;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

//取代Runnable，實作Callable介面，實作call()方法能回傳並拋例外，搭配Future的get()取得結果
//例子:隨機取得樂透號碼
//Future(未來):目的在協助取得未來的結果，工作交給Future會另起一條執行緒等待結果，可利用此空檔讓應用程式執行其他事情
//執行結果用get()取得，isDone()判斷結果是否已取得
class LottoCallable1 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        int number = (int)(Math.random() * 100);
        System.out.println("\t得到" + number + "的時間:" + new Date());
    }
    
}
public class LottoCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
       for(int i=0;i<=999999999;i++);//模擬要花費的時間
       int number = (int)(Math.random()* 100);
        System.out.println("\t得到 " + number + " 的時間:" + new Date());
       return number;
    }
    
    //注意call()有拋出例外，main方法也要拋出例外
    public static void main(String[] args) throws Exception{
        System.out.println("請給我一組0~99的幸運數字！");
        //搭配Future介面來取得(get())回傳值,FutureTask(未來任務)建構子中傳入new LottoCallable()也就是Callable物件
        FutureTask<Integer> task = new FutureTask<>(new LottoCallable());
        //Thread建構子中傳入task也就是 FutureTask物件
        new Thread(task).start();
        System.out.println("計算中...");
        //透過task.get()來取得結果回傳
        System.out.println("您的幸運數字是：" + task.get());
        //也可改成以下(5000微秒)，限定等待執行結果回傳的時間，超過限定時間仍沒有得到結果會拋出TimeoutException的例外
        System.out.println("您的幸運數字是：" + task.get(5000,TimeUnit.MILLISECONDS));
        System.out.println(task.isDone());//(做完)判斷結果是否已取得
 
        
        
    }
    
}
