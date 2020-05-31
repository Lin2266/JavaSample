
package Class;
//靜態類別
public class StaticClass {

    public static void main(String[] args) {
       MyOuter3.MyStatic s = new MyOuter3.MyStatic();
       s.fooA();
       //s.fooB()沒辦法呼叫
       MyOuter3.MyStatic.fooB();//static用類別直接呼叫就可以了，要用這種方法叫
        
    }
    
}

class MyOuter3{
   static class MyStatic{
      //non-static member
      public void fooA(){
          System.out.println("Hello" + "static inner class A.");
      }
      //static member
      public static void fooB(){
          System.out.println("Hello" + "static inner class B.");
      }
      
  }
}