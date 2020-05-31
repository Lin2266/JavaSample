
package Java.util.concurrent1;

//ReentrantReadWriteLock高效鎖定資源:主要在解決共享資源同時間被多執行緒大量操作與修改的問題

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//在鎖分類上若一個階段都是readLock讀取鎖定的狀態那就表示大家都可以進來讀，
//若是writeLock寫入鎖定的情況才將有獨佔鎖定的問題，鎖的分類也讓多執行緒在維運單一共享資源上更有彈性
//ReentrantReadWriteLock在取得讀取與寫入鎖定時機:
//readLock.lock()讀取鎖定:沒有任何寫入鎖定時
//writeLock.lock()寫入鎖定:沒有任何讀取或寫入鎖定時

//Stock股票，提供股票價格的取得與設定
class Stock{
    //ReentrantLock類(嘗試再次鎖定資源)<一ReentrantReadWriteLock類(高效的資源鎖定)
    private ReadWriteLock lock = new ReentrantReadWriteLock();//建立子類別的物件實體
    private int price;//價格

    public Stock(int price) {
        setPrice(price);
    }
    //readLock().lock()讀取鎖定
    public int getPrice() {
        try {
            lock.readLock().lock();
            return price;
        } finally {
            lock.readLock().unlock();
        }
    }
    //writeLock().lock()寫入鎖定
    public void setPrice(int price) {
        try {
            lock.writeLock().lock();
            Thread.sleep(1000);
            this.price = price;
        } catch (InterruptedException e) {
            System.out.println(e);
        }finally{
            lock.writeLock().unlock();
        }
        
    }
       
}
public class ReentrantReadWriteLockDemo {

    public static void main(String[] args) {
       final Stock stock = new Stock(100);
       Thread t1 = new Thread(){

           @Override
           public void run() {
               stock.setPrice(200);
           }   
       };
       
       Thread t2 = new Thread(){
           @Override
           public void run() {
               System.out.println(stock.getPrice());
           }   
       };
       t1.start();
       t2.start();
    }
    
}
