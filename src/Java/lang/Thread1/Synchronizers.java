
package Java.lang.Thread1;

import java.util.Date;
import java.util.concurrent.CyclicBarrier;

/*
Synchronizers同步器
為了讓執行緒間的互動更多樣化，兼顧不同情境的同步運作，Java提供五種常用的專用同步器，用來簡化多執行緒程式撰寫的控制
1.Semaphore:一種經典的共時工具
2.CountDownLatch:是一個極其簡單但又極其常用的實用工具，用於保持給定數目的信號、事件或條件前阻塞執行
3.CyclicBarrier:是一個可重置的多方同步點
4.Phaser:在多執行緒之間針對barrier(障礙)提供更靈活且可分階段控制的形式
5.Exchanger:允許兩個執行緒在collection(集合)點交換物件


若有一對小情侶要約會吃晚餐並約定好時間地點，到了要約會的時間男生先到了但女生還沒到，所以男生會等女生到了之後再
一起去吃飯，若女生先到了但男生還沒到，女生也會等男生到了之後再一起去吃飯
*/

class CyclicBarrierDemo{
    
    public void appointment(){//約會
        //new CyclicBarrier(2)表示在這二條執行緒未解鎖之前都必須要等待
        final CyclicBarrier barrier = new CyclicBarrier(2);//共2條執行緒參與
        new Thread(){

            @Override
            public void run() {
                try {
                    System.out.println("男生到了: " + new Date());
                    barrier.await();//男生等女生
                    System.out.println("男生說:我們一起去吃飯吧！:" + new Date() );
                } catch (Exception e) {
                }
            }
        
        }.start();
        
        new Thread(){

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);//模執女生化妝的時間
                    System.out.println("女生到了:" + new Date());
                    barrier.await();//女生等男生
                } catch (Exception e) {
                }
            }
            
        }.start();
    }
}
public class Synchronizers {
  
    public static void main(String[] args) {
        new CyclicBarrierDemo().appointment();
    }
    
}
