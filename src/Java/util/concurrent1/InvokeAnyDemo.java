
package Java.util.concurrent1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//ExecutorService介面有兩種模式來取得多重任務結果的返回值:InvokeAll()、InvokeAny()
//調用任何，所有任務中只要任何一個任務完成(未拋出例外)就反回結果
public class InvokeAnyDemo {

    public static void main(String[] args) throws Exception {
        System.out.println("請給我五組0~99的Lotto數字！");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(new LottoCallable());
        list.add(new LottoCallable());
        list.add(new LottoCallable());
        list.add(new LottoCallable());
        list.add(new LottoCallable());
        System.out.println("計算中...");
        //invokeAny()有拋出例外，所以需要在main拋出例外,取得第一個所回傳的Future物件(未拋出例外情況下)
        int result = service.invokeAny(list);
        service.shutdown();
        System.out.println("您的Lotto數字是:" + result);
        
    }
    
}
