
package Class;

//靜態類別與成員之間的關係
class MyOuter4{
    private int x = 7;
    static private int sx = 9;
    
    static class MyStatic4{
        private int x = 77;
        static private int sx = 99;
        public void fooA(){
                System.out.println(sx);//99
                System.out.println(MyOuter4.sx);//9
                System.out.println(x);//77
                System.out.println(this.x);//77
                //static inner class 中沒有MyOuter4的this指標
                //System.out.println(MyOuter4.this.x);不可用
        }
        public static void fooB(){
            System.out.println(sx);//99
            System.out.println(MyOuter4.sx);//9
        }
    }
}
public class StaticClass2 {

    public static void main(String[] args) {
        MyOuter4.MyStatic4 s = new MyOuter4.MyStatic4();
        s.fooA();
        
        MyOuter4.MyStatic4.fooB();
    }
    
}
