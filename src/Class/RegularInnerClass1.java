
package Class;
//靜態屬性  

public class RegularInnerClass1 {
    public static void main(String[] args) {
        new MyOuter1().new MyInner1().foo();
    }
    
}

class MyOuter1{
    private static int sx = 9;
    private int x = 7;
    class MyInner1{
        private int x = 77;
        public void foo(){
            int x = 777;
            System.out.println("Local x = " + x);
            System.out.println("MyInner's x = " + this.x);
            System.out.println("MyOuter's x = " + MyOuter1.this.x);
            System.out.println("MyOuter's sx = " + MyOuter1.sx);
        }
    }
}