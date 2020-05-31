
package Java.lang.Thread1;
class Erupt implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class Runnable1 {
    static Erupt e = new Erupt();
    //建構子
    Runnable1(){
        //e物件，執行緒名稱
        new Thread(e,"const").start();
    }
    public static void main(String[] args) {
        new Runnable1 ();
        new Faithful().go();
    }
    static class Faithful{
        //方法
        void go(){
            //e物件，名稱
            new Thread(e,"inner").start();
        }
    }
}
