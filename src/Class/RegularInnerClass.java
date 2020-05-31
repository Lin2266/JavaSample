
package Class;

//內部類別分4種

public class RegularInnerClass{
    
    public static void main(String[] args) {
        //呼叫MyInner的foo()方法:例1
        MyOuter ou = new MyOuter();
        MyOuter.MyInner in = ou.new MyInner();
        in.foo();
        //例2
        MyOuter.MyInner in2 = new MyOuter().new MyInner();//一般類別
        //MyOuter.MyInner in3 = new MyOuter().MyInner();//static內部類別
        in2.foo();
        //例3
        new MyOuter().new MyInner().foo();
        
    }
    
}
//內部類別
class MyOuter {
  
  
    class MyInner{
      public void foo(){
          System.out.println("Hello MyInner class !");
      }
  }
}