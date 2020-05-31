
package Java.lang.Thread1;
//死結:死結在程式執行時期不會出現例外，因為是屬於非程式執行時期的錯誤。
//造成死結的原因:
//1.執行緒彼此等待對方釋放資源且永達沒有結果
//2.無論什麼原因造成死結都與資源鎖定有很大的關係
//3.synchronized使用上的問題
//DeadLock解決方法有3種:
//1.移除synchronized
//優點:簡單
//缺點:風險大，因改變了方法簽章
//2.設置Timer(計時器)
//缺點:要進行Code Review(代碼審查)來配置Timer並找出問題點，耗時耗力
//3.資源編序(resource ordering)
//優點:為每一個Objects的lock指定取得次序，能保證不可能有二條執行緒同時持有相同物件的lock，程式規劃上需事先考量
public class Deadlock {

    public static void main(String[] args) {
        final Object resource1 = "resource1";
        final Object resource2 = "resource2";
        //tread t1已拿了a的locks,再拿b的locks， 
        //可是tread t2已拿了b的locks，又想再拿a的locks，死結就會發生。 
//        那麼即使在不同一個 .java 檔中，只要會須要同時要拿到 a 跟 b 的 locks，都須按此順序(先拿 a 再拿 b)。
//        (也就是說整個 project項目 都要依此順序) 
        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized(resource1){
                    System.out.println("T1 : locked resource 1");
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                        synchronized(resource2){
                            
                            System.out.println("T1 : locked resource 2");
                        }
                    }
                }
            }
            
        };
        
        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized(resource2){
                    System.out.println("T2 : locked resource 2");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        synchronized(resource1){
                            System.out.println("T2 : locked resource 1");
                        }
                    }
                }
            }
            
        };
        t1.start();
        t2.start();
    }
    
}
