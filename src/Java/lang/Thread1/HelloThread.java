
package Java.lang.Thread1;
//撰寫執行緒時必須要提供二種方法:
//1.繼承Thread類別  2.實作Runnable介面
class HelloThread1 extends Thread{
//覆寫Thread類別的run()方法
    @Override
    public void run() {
        for(int i=1; i<=1000; i++){
            //取得執行緒的名稱
            String tName = Thread.currentThread().getName();
            System.out.println(tName + " : " + i);
        }
    }
 
}
//實作Runnable介面，必須搭配Thread類別，才能建立執行緒物件
public class HelloThread {
    //繼承Thread類別與Runnable介面，二種方法都可作出多執行緒的程式
    //Thread撰寫比較容易，也是繼承Runnable
    //Runnable可避免java單一繼承的限制
    public static void main(String[] args) {
        //繼承Thread
        HelloThread1 r1 = new HelloThread1();
        HelloThread1 r2 = new HelloThread1();
        //Runnable介面實作，建立Thread物件並將Runnable物件以及執行緒名稱傳入
        Thread t1 = new Thread(r1, "T1");
        Thread t2 = new Thread(r1, "T2");
        //setPriority()可改變優先值(1~10)，取得執行緒優先權值，預設值為5，
        //範圍為1,5,10，排程器會讓優先權高的有較多的執行機會
        t1.setPriority(7);
        int a = t1.getPriority();
        System.out.println(a);
        //設定執行緒的名稱(預設Thread)
//        t1.setName("T1");
//        t2.setName("T2");
        //直接呼叫run()時，由執行中的main執行緒負責呼叫，只會有一條執行緒，run()不是由設計師在程式碼中呼叫
        //t1.run();
        t1.start();//必須下start()命令藉由多執行緒的排程器自動呼叫與執行run()方法中的實作
        t2.start();
        //要被放到Runnable pool的執行緒(被下達start()指令)才會被計算到
//        System.out.println("可用執行緒: " + Thread.activeCount() + " 條");
        //t1.start(); 放這，取得執行緒只會計算到main一條而已
        //判斷執行緒的狀態
        System.out.println(t1.isAlive());
        
    }
    
}
