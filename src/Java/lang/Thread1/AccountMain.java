package Java.lang.Thread1;

public class AccountMain {

    public static void main(String[] args) {
        System.out.println("Thread\tDep\tWit\tBalance");
        //20-23有例題
        Account a = new Account(101, "Simon", 0);
        
        Runnable deposit = new DepositRunnable(a);
        //建立一個包裝存款的執行緒
        //Thread(Runnable, String),(deposit, "D1")
        //Thread.setName(String)
        Thread dt = new Thread(deposit, "D1");
        
        Runnable withdraw = new WithdrawRunnable(a);
        Thread wt = new Thread(withdraw, "W1");
        Thread wt2 = new Thread(withdraw, "W2");
        
        dt.start();
        wt.start();
        wt2.start();
    }
    
}
