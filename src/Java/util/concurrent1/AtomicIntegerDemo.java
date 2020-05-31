
package Java.util.concurrent1;

import java.util.concurrent.atomic.AtomicInteger;

//Atomic(原子)指的就是最小單位，不可分割的意思，過程中不可被中斷，維持資源完整性與運行不可分割性
//volatile(揮發物)修飾詞除了long或double,其他任何基本資料型別變數的寫入動作都是不可分割的(atomic)
//為求簡化在基本資料型別屬性宣告上增加了volatile，某一條執行緒改變了變數值，另一條執行緒一定能夠讀取到變動後的結果
//volatile只保證執行緒將值寫回主記憶體是同步(不可分割的)，不保證同一時間只有一條執行緒去存取這個變數，
//在變數運作上仍可能產生風險，例:foo++，++不是原子操作，程式碼可能發生插斷問題
public class AtomicIntegerDemo extends Thread{
    AtomicInteger num = new AtomicInteger();

    @Override
    public void run() {
        //增加和取得,num物件資源在進行+1運作是原子操作
        num.incrementAndGet();
        //num數據資料會在主記憶體中取得
        System.out.println(num.get());
    }
    
    
    public static void main(String[] args) {
        AtomicIntegerDemo ai = new AtomicIntegerDemo();
        ai.start();
        
    }
    
}
