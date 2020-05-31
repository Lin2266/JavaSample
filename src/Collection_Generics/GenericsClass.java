
package Collection_Generics;

import java.util.Vector;


//自定泛型類別
//若要更明確的將A的範圍詮釋出來可以利用<A extends Number>在類別，來規範A的資料型別範圍
class Computer<A>{//電腦
    private Vector<A> v;

    public Computer() {
        v = new Vector<A>();
    }
    
    public void add(A o){
        v.add(o);
    }
    
    public int size(){
        return v.size();
    }
    
}
public class GenericsClass {
    
    public static void main(String[] args) {
        Computer<Integer> c = new Computer<>();
        c.add(100);
        c.add(200);
        c.add(300);
        System.out.println("元素個數 = " + c.size());
    }
    
}
