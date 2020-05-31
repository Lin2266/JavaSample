
package constructor;
//繼承關係下的建構子
public class DefaultConstructor_fs {
    static class Father{
        //編譯時會產生預設建構子，所以必須看成以下:
        public Father() {
            System.out.println("父");
            aBC();
        }
        public String aBC(){
                System.out.println("父方法");
                return "父方法";
        }
                
    }
    static class Son extends Father{
        //編譯時會產生預設建構子，所以必須看成以下:
        public Son() {
            //但繼承關係，預設時java會在第一行加入super();呼叫父類的無參數建構子
//            super();
            
            System.out.println("子");
        }
         public String aBC(){
                System.out.println("子方法");
                return "子方法";
        }
        
    }
    public static void main(String[] args) {
            Son son = new Son();
        
    }
    
}
