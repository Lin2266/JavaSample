
package Java.lang.Thread1;
//notify()必須寫在synchronized區段中，須取得該物件的鎖(旗標)的狀況下才能呼叫
//不然會發生IllegalMonitorStateException(非法監控狀態例外)
//notify()的缺點是，當有多個執行緒等待被喚醒時，是由JVM決定哪個執行緒出線(JVM運算法為準)，不是由優先權值為準
//notifyAll()可以透過Specific Notification Pattern(具體通知模式)來達成指定喚醒順序的目的

//wait、notify的特性:
//1.同步化處理採用的監控模型
//2.讓所有的共享資料保持一致性
//3.確保程式不容易產生死結
//4.小心不要讓同一個物件等候區的執行緒有不同的notify方式
public class Wait_Notify1 {//等待、通知

    public static void main(String[] args) {
        One one = new One();
        one.start();//執行緒: Thread-0，只執行run()
        //主執行緒main取得one物件的鎖(旗標),main不會進入run()
        synchronized(one){
            String tName = Thread.currentThread().getName();
            System.out.print("one 進入 wait pool");
            System.out.println("(" + tName + ")");//(main)
            try {
                //因主執行緒進入 wait pool，而one物件的鎖(旗標)也將被釋被
                one.wait();
                //中斷例外
            } catch (InterruptedException e) {
            }
            //被喚醒時從這繼續執行，主執行緒main再次取得one物件的鎖(旗標)之後，繼續執行其未完成的工作
            System.out.print("one 離開 wait pool");
            System.out.println("(" + tName + ")");//(main)
        }
        
    }
    
}
class One extends Thread{
//main進入wait pool，換Thread-0先執行
    @Override
    public void run() {
        synchronized(this){
            String tName = Thread.currentThread().getName();
            System.out.print("呼叫 notify()");
            System.out.println("(" + tName + ")");//(Thread-0)
            //喚醒一個隸屬在one物件中wait pool裡的執行緒
            notify();
            System.out.print("notify() 呼叫完畢！");
            System.out.println("(" + tName + ")");//(Thread-0)

        }
    }
    
}