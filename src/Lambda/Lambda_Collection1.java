package Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Lambda_Collection1 {

	public static void main(String[] args) {
		//Lambda除了用來取代以往使用Functional Interface的方式外，還可以用在Collection的走訪、過濾和一些簡單的運算上。
		//過去我們使用For each走訪一個List可能要寫成這樣：
		ArrayList<String> list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println("ArrayList:");
		for(String s:list) {
			System.out.println(s);
		}
		
		//如果要走訪一個Map更麻煩，可能要寫成這樣：
		HashMap<Integer,String> map = new HashMap();
		map.put(1, "HELLO");
        map.put(2, "HI");
        Set<Integer> set = map.keySet(); 
        System.out.println("HashMap:");
        for(Integer i:set) {
			System.out.println(i);
		}
        
        //若改以Lambda來走訪這些Collection，可以簡化成這樣：
        System.out.println("若改以Lambda來走訪這些Collection，可以簡化成這樣：");
        System.out.println("ArrayList:");
        list.forEach(s->System.out.println(s));
        System.out.println("HashMap:");
        map.forEach((k,v)->System.out.println(k+":"+v));
	}

}
