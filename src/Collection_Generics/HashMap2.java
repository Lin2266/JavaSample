package Collection_Generics;

import java.util.HashMap;

//把map加進StringBuilder裡面
public class HashMap2 {

    public static void main(String[] args) {
        HashMap hashmap = new HashMap();
        hashmap.put("key", "value");
        System.out.println(hashmap.get("key"));
        System.out.println((new StringBuilder()).append("Map: ").append(hashmap).toString());
    }

}
