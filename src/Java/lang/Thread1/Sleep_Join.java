
package Java.lang.Thread1;
//主題:爸爸要洗熱水澡
//演員:爸爸(father執行緒)、瓦斯工人(worker)執行緒
//Thread.sleep()(睡覺)靜態，worker.join()(加入)
class FatherThread implements Runnable{
//狀況一:程式直接執行，與劇本不符，瓦斯還沒送來爸爸就洗完澡了
    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯了");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯");
        System.out.println("爸爸等待瓦斯工人...");

        //工人實作區塊
        Thread worker = new Thread(new WorkerThread());
        worker.start();
        //狀況2:用yield()暫停father，行不通，是讓在等待區中被執行的執行緒有機會可以執行，若等待區沒任何等待執行
        //yield不會做任何事也不會丟例外
//        Thread.yield();
        
        
        try {
            //狀況三:用Thread.sleep(暫停秒數)暫停father，只對執行中的有用
//             Thread.sleep(6000);
            //狀況四:用worker.join()(加入)，worker加進來，father會暫停，等到worker執行完畢，father才可以繼續執行                        //join也會拋出InterruptedException
                worker.join();
        } catch (InterruptedException e) {
            System.out.println("爸爸決定今天不洗熱水澡了！");
        }
        
      
        //工人還沒送瓦斯，爸爸就洗完澡了，因為father所剩的cup時間還夠讓程式繼續執行，所以要想辦法暫停他
        System.out.println("爸爸開始洗澡！");
        System.out.println("爸爸洗完澡了！");
    }
    
}

class WorkerThread implements Runnable{

    @Override
    public void run() {
          
        System.out.println();
        System.out.println("瓦斯工人送瓦斯中...");
        //瓦斯工人送的時間
        try {    
            for(int i=1; i<=5; i++){
                Thread.sleep(1000);//1000毫秒為1分鐘
                System.out.println(i+" 分鐘...");
            }
        //中斷例外
        } catch (InterruptedException ie) {
            System.out.println("瓦斯工人送瓦斯途中發生意外！");
        }
        
        System.out.println();
        System.out.println("瓦斯工人將瓦斯送到家了！");
        System.out.println("瓦斯工人將瓦斯安裝完畢！");
        System.out.println();
    }
    
}



public class Sleep_Join {
    public static void main(String[] args) {
        Thread father = new Thread(new FatherThread());
        father.start();
    }
    
}
