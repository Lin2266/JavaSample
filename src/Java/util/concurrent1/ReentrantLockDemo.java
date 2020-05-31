
package Java.util.concurrent1;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/*
Lock介面<--ReentrantLock類(嘗試再次鎖定資源)    
           ReadLock類(讀取鎖定)       <一ReentrantReadWriteLock類(高效的資源鎖定)  
           WriteLock類(寫入鎖定)      <一ReentrantReadWriteLock類
ReadWriteLock介面(讀寫鎖定)           <--ReentrantReadWriteLock類

Condition(條件)介面<--ConfitionObject類
*/
//Lock介面還提供tryLock()方法，若回傳的是true表示可以鎖定該資源，false則不可鎖定，使用很像synchronized()
//資源同步鎖定的觀念,優點在於寫法比synchronized直覺且其他相關輔助方法也較多(unlock()'tryLock())

class Lotto3 implements Runnable{
    private String username;//使用者名稱
    private static final ReentrantLock lock = new ReentrantLock();

    public Lotto3(String username) {
        this.username = username;
    }
    
    
    @Override
    public void run() {
        try {
            lock.lock();//嘗試鎖定
            for(int i =1; i<=5; i++){
                Thread.sleep(1000);//模擬要花費的時間
                int number = (int)(Math.random()*100);
                System.out.println(username + "得到第" + i + "組號碼:" + number + "，時間:" + new Date());
            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            lock.unlock();//為避免死結發生，解鎖一律放在finally區段
        }
    }
    
}

public class ReentrantLockDemo {
    
    public static void main(String[] args) {
        ExecutorService exec = Executors.newScheduledThreadPool(2);
        //會各自連續取到5組號碼
        exec.execute(new Lotto3("Vincent"));//文森特
        exec.execute(new Lotto3("Anita"));//安妮塔
        exec.shutdown();
    }
    
}
