
package Java.lang.Thread1;
//主人有10塊餅乾，主人放餅乾時小白狗才可以吃，不然只有等待，小白狗把餅乾吃完提醒主人放，主人才可以放，不然只有等待
//角色:主人(Put(放)類別)、小白狗(Eat(吃)類別)

import java.util.logging.Level;
import java.util.logging.Logger;

//物品:餅乾(cookiesNo 餅乾編號1~10)、盤子
//動作:吃餅乾(public void eat())、放餅乾(public void put())
//執行緒:master(主)執行緒維護put物件，dog執行緒維護eat物件
class Cookies{
    private int cookiesNo;//餅乾編號
    //因為執行結果部分不合邏輯，所以要將程式做修正
    private boolean empty = true;//空(盤子為空)
    //主人放餅乾的方法,用while修改
    public synchronized void put(int cNo){
        //盤子不是空的時候
        while(!empty){
            try {
        //呼叫wait()時，由於方法定義為:public final void wait() throws InterruptedException,要記得加try-catch或throws
                wait();//若盤子不是空的，主人進入等待狀態
                System.out.println("主人休息");
            } catch (InterruptedException e) {//中斷例外
                System.out.println("盤子還有餅乾");
            }
        }
        //盤子是空的時從這邊執行
        System.out.println("主人放了第" + cNo + "塊餅乾");
        cookiesNo = cNo;
        //盤子是空的(true)時，主人放完餅乾，盤子要改成不是空的(false)
        empty = false;//盤子不是空的，意味著盤子內有餅乾
        notify();//呼叫小白狗來吃餅乾
    }
    
    //小白狗吃餅乾的方法
    public synchronized void eat(int cNo){
        //盤子是空的時候
        while(empty){
            try {
                wait();//若盤子是空的，小白狗進入等待狀態
                System.out.println("小白狗休息");
            } catch (InterruptedException e) {//中斷例外
                System.out.println("盤子是空的");
            }
        }
        //主人放完餅乾，改false時，小白狗會從這邊執行
        System.out.println("小白狗吃了第" + cNo + "塊餅乾");
        cookiesNo = cNo;
        //小白狗吃完餅乾要改成盤子空的(true)，換主人時是空的才會放餅乾
        empty = true;//盤子是空的，意味著盤子內沒有餅乾
        notify();//呼叫主人來放餅乾
        
        
    }
}

class Eat implements Runnable{
    Cookies cookies;
    Eat(Cookies cookies){
        this.cookies = cookies;
    }
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            cookies.eat(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {//中斷例外
                Logger.getLogger(Eat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

class Put implements Runnable{
    Cookies cookies;
    Put(Cookies cookies){
        this.cookies = cookies;
    }

    @Override
    public void run() {
        for(int i =1; i<=10; i++){
            cookies.put(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {//中斷例外
                Logger.getLogger(Eat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
}

public class Wait_Notify2 {
    public static void main(String[] args) {
        //類別+兩個方法
        Cookies cookies = new Cookies();
        //實作Runnable的run()
        Put put = new Put(cookies);//主人放餅乾
        Eat eat = new Eat(cookies);//小白狗吃餅乾
        //把實作Runnable的類別物件放在執行緒建構子裡執行
        Thread dog = new Thread(eat);//小白狗執行緒
        Thread master = new Thread(put);//主人執行緒
        dog.start();
        master.start();
        
    }
    
}
