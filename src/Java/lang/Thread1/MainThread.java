
package Java.lang.Thread1;
//每個應用程式至少要有一個執行緒(又稱為主執行緒)
public class MainThread {
    //main是Java Application的主執行緒
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        //取得目前執行中程式的執行緒名稱
        String tName = Thread.currentThread().getName();
        System.out.println("執行緒名稱: " + tName);

        //取得應用程式目前有幾個執行緒
        int a = Thread.activeCount();
        System.out.println("有幾個執行緒: " + a);
       
        
    }
    
}
