
package Java.util.concurrent1;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//並行集合
//解決新增/修改/刪除發生競速的問題以確保集合元素資料的正確與完整性，
//多執行緒中使用ArrayList會產生ConcurrentModificationException例外
public class CopyOnWriteArrayListDemo extends Thread {
    static List<Integer> myList = new CopyOnWriteArrayList<Integer>();
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("e2");
        }
        myList.add(77);
        System.out.println("size: " + myList.size() + ", elements:");
    }
    
    public static void main(String[] args) {
        myList.add(11);
        myList.add(22);
        myList.add(33);
        myList.add(44);
        new CopyOnWriteArrayListDemo().start();
//        for(Integer i: myList){//只顯示11 22 33 44
        for(int i =0; i<myList.size();i++){//11 22 33 44 77
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("e1");
            }
            System.out.println(" " + myList.get(i));
        }
    }
    
}
