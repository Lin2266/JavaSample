
package Java.util.concurrent1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//ExecutorService介面有兩種模式來取得多重任務結果的返回值:InvokeAll()、InvokeAny()
//調用全部，當所有任務完成時，返回一個Future列表，各項任務的執行結果皆被封裝在Future物件內
public class InvokeAllDemo {
    
    public static void main(String[] args) throws Exception {//中間例外
        System.out.println("請給我五組0~99的Lotto數字！");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(new LottoCallable());
        list.add(new LottoCallable());
        list.add(new LottoCallable());
        list.add(new LottoCallable());
        list.add(new LottoCallable());
        System.out.println("計算中...");
        //invokeAll()有拋出例外，所以需要在main拋出例外
        //invokeAll(list)取得所有回傳的Future物件集合
        List<Future<Integer>> resultList = service.invokeAll(list);
        System.out.print("您的Lotto數字是:");
        for(Future future : resultList){
            System.out.print(future.get()+"  ");
        }
        service.shutdown();
    }
    
}
