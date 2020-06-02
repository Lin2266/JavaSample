
package constructor;

public class Constructor4 {
    static class Father{
        //有帶參數
        public Father(char c) {
            System.out.println(c);
        }
    }    
    static class Son extends Father{
        //編譯時期錯誤，父類沒提供無參數建構子，解決方式:
        //1.在父類加一個無參數建構子，2.自行呼叫父類中有帶參數的建構子
        public Son(){
            //呼叫父類有帶參數建構子,就不會有編譯錯誤
            super('父');
            System.out.println("子");
        }
    }    
    
    public static void main(String[] args) {
        Son son = new Son();
    }
    
}
