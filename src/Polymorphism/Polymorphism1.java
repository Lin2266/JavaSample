 
package Polymorphism;
//多型與屬性
public class Polymorphism1 {
    static class Father{
        String name = "Father";

        public String getName() {
            return name;
        }
       //歡迎
        String greeting(){
            return "class Father";
        }
    }
    static class Son extends Father{
        String name = "Son";

        @Override
        String greeting() {
            return "Class Son"; 
        }
        
        void xx(){
        	System.out.println("兒子" + this);//這個類別的建構子
        	System.out.println("爸爸" + ((Father)this));
        }
        
    }
    public static void main(String[] args) {
//       Father father = new Father();
         Father father = new Son();
        System.out.println(father.greeting() + ",");
        System.out.println(((Son)father).name + ",");
        System.out.println(father.getName() + ",");
        System.out.println(father.getClass());//建構子的型態Son
        ((Son)father).xx();
        
        
    }
    
}
