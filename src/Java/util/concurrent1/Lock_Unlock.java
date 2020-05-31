
package Java.util.concurrent1;
//ReentrantLock重入鎖
//synchronized之外的另一個選擇

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


//synchronized範別
class SynchronizedCounter{
    private long count = 0;//計時器
    
    public long getValue(){
        return count;
    }
    
    public synchronized void increment(){//增量
        count++;
    }
}
//重入鎖定計數器
class ReentrantLockCounter{
    //volatile揮發物:讓執行緒可以共用成員變數，避免繼續使用舊的變數值讓資料不一致，讓成員變數跟main成員同步，
    //執行緒只能在synchronized區塊時才能與共用成員變數的原始值對比
    private volatile long count = 0;
    private Lock lock;
    
    public ReentrantLockCounter(){
        lock = new ReentrantLock(false);
    }
    public long getValue(){
        return count;
    }
    
    public void increment(){//增量
        lock.lock();
        try {
            count++;
        } finally {
            //解鎖最好放在finally中
            lock.unlock();
        }
    }
}
public class Lock_Unlock {

    public static void main(String[] args) {
       
    }
    
}
