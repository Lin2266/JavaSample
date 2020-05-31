
package Java.lang.Thread1;

//繼承Thread跟實作Runnable
class MyThread extends Thread{
    int i,j;
    @Override
    public void run() {
        while(true){
           System.out.printf("%s,Hello i=%d,j=%d%n",Thread.currentThread().getName(),i,j);
           i++;j++;
           if(i==50){
               break;
           }
       }
    }
    
}
class MyRunnable implements Runnable{
    int i,j;
    @Override
    public void run() {
       while(true){
          //為了讓i跟j的修改同步，加上 synchronized跟Thread.yield()，t1跟t2也都不會少一次
           synchronized(this){
           System.out.printf("%s,Hello i=%d,j=%d%n",Thread.currentThread().getName(),i,j);
           //當t執行i++;還沒做j++時，cpu就決定先不執行t而轉去執行t1，這樣j就會比i少加一次，
           //如要測試一樣的效果，可在I++跟j++之間加上Thread.yield()
           i++;Thread.yield();j++;
           if(i==50){
               break;
             }
           }
       }
    }
    
}
public class ThreadRunnable {

    public static void main(String[] args) {
       
        MyRunnable r1 = new MyRunnable();
        //這種寫法會造成無限迴圈，使用同一個物件,因為前一個執行緒處理過50，後面的就會無限迴圈
        Thread t1 = new Thread(r1,"T1");
        Thread t2 = new Thread(r1,"T2");
       //使用不同物件
//        Thread t1 = new Thread(r1,"R1");
//        Thread t2 = new MyThread();
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println("The End");
    }
    
}
