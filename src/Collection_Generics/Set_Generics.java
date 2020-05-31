
package Collection_Generics;

import java.util.HashSet;
import java.util.Set;

public class Set_Generics {

    public static void main(String[] args) {
        //泛型集合(水果)
        Set<String> fruits = new HashSet<>();
        //只有五個元素
        fruits.add("Lemon");
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("Charry");
        fruits.add("Strawberry");
        fruits.add("Pineapple");
        fruits.add("Charry");
        //直接打印跟迴圈打印的差別
        System.out.println(fruits);
        for(String s: fruits){
            System.out.println(s);
        }
    }
    
}
