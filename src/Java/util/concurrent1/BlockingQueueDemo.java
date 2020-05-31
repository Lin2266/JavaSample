
package Java.util.concurrent1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//BlockingQueue有五個實作類別，該介面定義put和take的阻塞版本，好處是可以免除wait()與notify()實作上的細節
//ConcurrentLinkedQueue類別指高效執行緒安全的非阻塞FIFO佇例

class Put implements Runnable{
    private BlockingQueue<Integer> queue;

    public Put(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i =1; i<=10; i++){
            try {
                queue.put(i);
                System.out.println("主人放了第 " + i + " 塊餅乾!");
            } catch (Exception e) {
            }
        }
    }    
}

class Eat implements Runnable{
    private BlockingQueue<Integer> queue;

    public Eat(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i =1; i<=10; i++){
            try {
                queue.take();
                System.out.println("小白狗吃了第 " + i + "塊餅乾!");
            } catch (Exception e) {
            }
        }
    }
    
    
}
public class BlockingQueueDemo {

    public static void main(String[] args) {
        //BlockingQueue實作上沒有強制要求主人放一片小白狗吃一片的順序
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);//建立實體並給定預設容積數(放10個餅乾)
        Thread master = new Thread(new Put(queue));
        Thread dog = new Thread(new Eat(queue));
        dog.start();
        master.start();
    }
    
}
