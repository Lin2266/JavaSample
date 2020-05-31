
package DesignPatterns;
//SingleTon單身，設計模式，將設計概念轉化成物件導向的規則
public class SignleTon {
    //讓該物件在整個系統中只會存在一個
    private static final SignleTon instance = new SignleTon();
    //private建構子,讓其它類無法透過new建立該類別
    private SignleTon(){
        
    }
    //工廠方法
    //public類別方法可以讓其它類別僅透過這個唯一的方法取得該類別的物件實體
    public static SignleTon getInstance(){
        return instance;
    }
    public static void main(String[] args) {
        SignleTon st = SignleTon.getInstance();
    }
    
}
