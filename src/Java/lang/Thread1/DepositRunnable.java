package Java.lang.Thread1;

public class DepositRunnable implements Runnable {

    private Account account;

    public DepositRunnable(Account account) {
        this.account = account;
    }
    
    @Override
    public void run() {
        while (true) {
            //random()隨機存錢100~500的金額
            int amount = (int)(Math.random() * 500) + 100;
            account.deposit(amount);
            
            try {
                int time = (int)(Math.random() * 1000) + 1000;
                //每存一次錢就休息一下
                Thread.sleep(time);
            }
            catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
    
}
