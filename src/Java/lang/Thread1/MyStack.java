
package Java.lang.Thread1;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    //接收char物件
    private List<Character> buffer = new ArrayList<Character>(400);
    
    public synchronized char pop(){
        char c;
        while (buffer.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }   
        }
         c = buffer.remove(buffer.size()-1);
            return c;
    }
    
    public synchronized void push(char c){
        this.notify();
        buffer.add(c);
    }
    public static void main(String[] args) {
       MyStack stack = new MyStack();
       //不停的將資料放進去
       ProducerService p1 = new ProducerService(stack);
       Thread tP1 = new Thread(p1);
       tP1.start();
       ProducerService p2 = new ProducerService(stack);
       Thread tP2 = new Thread(p2);
       tP2.start();
       //不停的將資料拿出來
       ConsumerService c1 = new ConsumerService(stack);
       Thread tC1 = new Thread(c1);
       tC1.start();
       ConsumerService c2 = new ConsumerService(stack);
       Thread tC2 = new Thread(c2);
       tC2.start();
       
       
    }
    
}
//製作者服務
class ProducerService implements Runnable{
    private MyStack theStack;
    private int num; //代表number(數字)
    private static int counter = 1;//計數器

    public ProducerService(MyStack theStack) {
        this.theStack = theStack;
        num = counter++;
    }
    
    @Override
    public void run() {
       char c;
       for(int i =0; i<200; i++){
           c = (char)(Math.random() * 26 + 'A');
           theStack.push(c);
           System.out.println("push " + num + ": " + c);
           try {
               Thread.sleep((int)(Math.random() * 300));
           } catch (InterruptedException e) {
               System.out.println(e);
           }
       }
    }
}
    
    //消費者服務
class ConsumerService implements Runnable{
    private MyStack theStack;
    private int num; //代表number(數字)
    private static int counter = 1;//計數器

    public ConsumerService(MyStack theStack) {
        this.theStack = theStack;
        num = counter++;
    }
    
    @Override
    public void run() {
       char c;
       for(int i =0; i<200; i++){
           c = (char)(Math.random() * 26 + 'A');
           theStack.push(c);
           System.out.println("push " + num + ": " + c);
           try {
               Thread.sleep((int)(Math.random() * 300));
           } catch (InterruptedException e) {
               System.out.println(e);
           }
       }
    }
    
}