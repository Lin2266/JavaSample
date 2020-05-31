package Java.lang.Thread1;

public class Account {

    private int id;
    private String name;
    private int balance;

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //多人領錢或提錢的時候怕餘額會有錯誤要加synchronized
    public synchronized int getBalance() {
        return balance;
    }
    //存款
    public synchronized void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            //取得現在執行緒的名字
            String name = Thread.currentThread().getName();
            System.out.printf("%s\t%d\t\t%d%n", name, amount, balance);
            notify(); //等候區挑一個
            //notifyAll();//等候區全部叫回來
        }
    }
    //提款
    public synchronized void withdraw(int amount) {
        //if會等一次就被叫回來，餘額不足要一直待在等候區，所以用while
        while (balance < amount) {
            try {
            //等候
            wait();
            //被notify以後從這執行繼續
            }
            catch (InterruptedException e) {
                System.out.println(e);
        }
            
        balance -= amount;
        String name = Thread.currentThread().getName();
        System.out.printf("%s\t\t%d\t%d%n", name, amount, balance);
    
        }
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + getId() + ", name=" + getName() + ", balance=" + getBalance() + "}";
    }
    
}
