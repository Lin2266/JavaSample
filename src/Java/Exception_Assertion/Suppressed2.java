
package Java.Exception_Assertion;
//透過getSuppressed()來取得try-with-resources語法中被壓制的例外
//實作AutoCloseable介面的close() 方法時，所拋出的例外將會被壓制
class MyResoure implements AutoCloseable{
    public void doSomething(){
        System.out.println("執行運算");
    }
    //7.0 try()，編譯器會在編譯時期自動加上finally區段與close()資源關閉語法
    //執行時期執行資源關閉仍要有程式碼才能執行
    @Override
    public void close() throws Exception {
        throw new Exception("關閉資源");
    }   
}
public class Suppressed2 {
    public static void findResource() throws Exception{
        try (MyResoure r = new MyResoure()){
            r.doSomething();
            //因為這邊new的例外把close()拋出的例外壓制住了
            throw new Exception("拋出其他例外");
        } 
    }
    public static void main(String[] args) {
        try {
            findResource();
        } catch (Exception e) {
            System.out.println(e);
            //getSuppressed()取得被壓制的例外
            Throwable[] tws = e.getSuppressed();
        for(Throwable t : tws){
            System.out.println(t.getClass() + ":" + t.getMessage());
        }
        }
    }
    
}
