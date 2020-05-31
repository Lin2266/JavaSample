
package Collection_Generics;

import java.util.Vector;


public class Generics04 {

    public static void main(String[] args) {
       Vector<Integer> v = new Vector<>();
       v.add(new Integer(100));
       v.add(new Integer(200));
       v.add(new Integer(300));
       for(Integer obj: v){
           Integer data = obj;//不用轉型
           System.out.print(data.intValue() + " ,");
           //System.out.print(obj + " ,");這樣就可以把元素取出來了
       }
        System.out.println();
        
        
        //5.0 Autoboxing/Unboxing
        v.add(100);
        v.add(200);//Boxing
        v.add(300);
        for(int obj: v){
            int data = obj;//Unboxing
            System.out.print(data + ", ");
        }
    }
    
}
