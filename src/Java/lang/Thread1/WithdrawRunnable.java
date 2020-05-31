package Java.lang.Thread1;

public class WithdrawRunnable implements Runnable {

    private Account account;

    public WithdrawRunnable(Account account) {
        this.account = account;
    }
    
    @Override
    public void run() {
        while (true) {
            account.withdraw(500);
        }
    }
    
}
