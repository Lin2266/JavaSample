
package Java.lang.Thread1;
//資源鎖定同步與物件旗標
//synchronized(同步)可以讓其它執行緒不得維護balance這個物件變數的方法有四種:
class WithDraw implements Runnable{
    //被synchronized(同步)鎖定的屬性最好是設為private
    private Account account;
    private double withdrawMoney;//提款金額

    public WithDraw(Account account, double withdrawMoney) {
        this.account = account;
        this.withdrawMoney = withdrawMoney;
    }
//start()開始會自動呼叫run()
    @Override
    public void run() {
//例2.instance block synchronized(區段同步)
        //synchronized()小括號中鎖定的變數必須是參考型別，只能有一個物件
//        synchronized (account){//鎖定account物件也可以
         //4.class literals synchronized類別文字同步
        synchronized (Account.class){
        //提款動作從這邊開始
            account.withDraw(account, withdrawMoney);//執行提款
       }
    }
   
}

class Account{
//    private double balance;
    //例子3.類別方法同步
    static double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    
    //3.static method synchronized 類別方法同步,在方法加上synchronized static
    //1.instance method synchronized(同步)旗標，在方法加上synchronized修飾詞
    public void  withDraw(Account account,double withdrawMoney){//開始鎖定this物件的時間
        String tName = Thread.currentThread().getName();
        System.out.println(tName + "開始提款...");
        //2.instance block synchronized(區段同步)，鎖定物件和鎖定期間，有兩個好處:
        //1:可自行決定鎖定期間的分段處理，比較彈性，instance method synchronized是鎖定整個method
        //2:可以自行決定要鎖定的物件，instance method synchronized只能鎖定this
//        synchronized(this){
        double tmpBalance = balance;
        
        //提款時系統所花的時間
        for(double delay=0;delay<99999999;delay++);
        
        //當發生資源synchronized時，其它等著要執行該資源的執行緒將進入lock pool，等拿到旗標的執行緒使用完畢
        //該資源釋放時(旗標歸還)，在lock pool中的執行緒才能轉入到 Runnable pool等待被排程器呼叫執行
        tmpBalance = tmpBalance - withdrawMoney;
        if(tmpBalance < 0){
            System.out.println("..................");
            System.out.println("帳戶餘額不足！");
            System.out.println("..................");
        }
        else{
            balance = tmpBalance;
        }
//        }//例子2.instance block synchronized的旗標到這
        System.out.println("列印交易單: \n 欲提款金額:" +withdrawMoney + "元，"
                + "帳戶餘額:" + account.checkAccount());
        System.out.println(tName + "完成提款...");
        System.out.println(".......................");
    }//例子1.instance method synchronized結束鎖定並釋放this
    
    
    public double checkAccount(){
        return balance;
    }
}

//神奇的機器
public class RunnableSynchronized {
    public static void main(String[] args) {
        Account ac = new Account(10000);
        System.out.println("帳戶原始金額:" + ac.checkAccount() + "元");
       
//        WithDraw w1 = new WithDraw(ac, 5000);
//        WithDraw w2 = new WithDraw(ac, 2000);
//        WithDraw w3 = new WithDraw(ac, 4000);
//        Thread t1 = new Thread(w1, "T1");
//        Thread t2 = new Thread(w2, "T2");
//        Thread t3 = new Thread(w3, "T3");
//        t1.start();
//        t2.start();
//        t3.start();
        synchronized(ac){
            String tName = Thread.currentThread().getName();
            System.out.print("ac 進入 wait pool");
            System.out.println("(" + tName + ")");
        }    
    }
    
}
