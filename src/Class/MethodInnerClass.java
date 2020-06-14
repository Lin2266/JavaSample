
package Class;


//方法類別
public class MethodInnerClass {

    public static void main(String[] args) {
        new MethodInnerClass().see();
    }
    //方法中的類別方法
    void see(){
        final int fx = 7;
        int x =77;
        //方法內部類別不可直接存取方法內非final的區域變數
        class MyInner{
        	
            void foo(){
//                System.out.println("Hello" + "MethodInner class !");
                System.out.println("local x = " + x); 
                System.out.println("final fx = " + fx);
            }
        }
//        MyInner mi = new MyInner();//有使用變數時的寫法
//        mi.foo();
        new MyInner().foo();//不需要用到變數時的寫法
    }
}
