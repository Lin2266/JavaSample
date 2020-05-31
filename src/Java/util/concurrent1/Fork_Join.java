
package Java.util.concurrent1;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
//Fork/Join框架結構，繼承RecursiveTask(遞迴任務)，表示需要有返回結果
//Future(未來)介面<--ForkJoinTask(拆/加入任務)抽象<一RecursiveTask(遞迴任務)抽象，RecursiveAction(遞迴行動)抽象
//fork()分解，join()組合多個子任務的回報結果

//費波那西數列，單執行緒遞迴
class Fibonacci{
    public int fibonacci(int num){
        //0+1+1+2+3+5值，num=0.1.2.3.4.5項
        if(num == 0 || num == 1){//Fo=0、F1=1
            return num;
        }
        else{
            System.out.println(num);
            //num(2)= (3-1)+(2-2); 
            return (fibonacci(num-1) + fibonacci(num-2)); //Fn=Fn-1 + Fn-2
           
        }
    }
}
//Fork/Join框架
class FibonacciTask extends RecursiveTask<Integer>{
    private int num = 0;
    private int result =0;

    public FibonacciTask(int num) {
        this.num = num;
    }

    public int getResult() {
        return result;
    }
    
    //遞迴:計算
    @Override
    protected Integer compute() {
       //門檻值與使用者電腦硬體有關，一般以測試結果後的平均值為準,
        //28時間還小於fork/join，29就開始大於透過fork/join框架所需的時間
        if(num < 24){//為Threshold門檻值
           //小於29就直接利用單執行緒遞迴求解
           result = new Fibonacci().fibonacci(num);
       }
       else{
           //建立分解num-1子任務實例
           FibonacciTask task1 = new FibonacciTask(num-1);
           task1.fork();//分解(ForkJoinPool會分配一條執行緒來執行此任務)
           //建立分解num-2子任務實例
           FibonacciTask task2 = new FibonacciTask(num-2);
           //task2.compute()試著取得num-2的值，若有必要再往下拆分子任務，task1.join()取得之前拆分的子任務回報結果
           result = task2.compute() + task1.join();//join組合多個子任務的回報結果
       }
       return result;
    }
  
}
public class Fork_Join {

    public static void main(String[] args) {
        
       //費式的第6項為8時間1秒 , 40為102334155，花費時間為720，45卻要花上7554
        int num = 4;
        //遞迴求解
        long start = new Date().getTime();
        System.out.print(new Fibonacci().fibonacci(num) + ",");
        long end = new Date().getTime();
        System.out.println("花費時間:" + (end-start));
        
        //Fork/Join:改善以上單一執行緒寫法花費太多時間的問題，40花費時間為278
        long start2 = new Date().getTime();
        //processors處理器，取得本機cpu處理器的核心數
        int processors = Runtime.getRuntime().availableProcessors();
        //注入num=40來取出Fibonacci第40項數的值
        FibonacciTask task = new FibonacciTask(num);
        //建立執行緒池實例，並設定執行的cpu核心數量(4)
        ForkJoinPool pool = new ForkJoinPool(processors);
        //invoke(調用)開始透過Fork/Join分派任務
        pool.invoke(task);
        //取出最後結果
        System.out.print(task.getResult() + ",");
        long end2 = new Date().getTime();
        System.out.print("花費時間:" + (end2-start2) + ",");
        System.out.println("processors:" + processors);
    }
    
}
