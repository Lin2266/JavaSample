package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Collection2 {
	/*
	 過濾和基本運算

	 在新的Java 8中，Collection提供了stream()方法，可以對集合做一些過濾和基本運算，而且這個當然也是有經過
	 效能優化過的。除了stream()方法外還有parallelStream()方法，可以讓Collection各別針對它的entry另開
	 出一個Thread，進行stream提供的運算，讓多核心的CPU資源更能有效的被利用。以下將舉幾個過濾和基本運算的例子：
	 
	 */

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("5");
		list.add("3");
		list.add("4");
		list.add("2");

		////會輸出「12」。Integer.valueOf(s)字串轉數字，數字小於設定值時，就列印
		list.stream().filter(s->Integer.valueOf(s)<3).forEach(s->System.out.println("s印出來的是字串:"+s+1+",1是數字"));
		System.out.println("---------------------------------------------");
		
		//會輸出「153426」，因為沒重新指派到變數，內容會不變
		list.stream().filter(s->Integer.valueOf(s)<3).collect(Collectors.toList());
		list.add("6");
		list.forEach(s->System.out.println(s));
		System.out.println("---------------------------------------------");
		
		//會輸出「127」，有重新指派到變數，內容會改變
		List<String>list2 = list.stream().filter(s->Integer.valueOf(s)<3).collect(Collectors.toList());
		list2.add("7");
		list2.forEach(s->System.out.println(s));
		System.out.println("---------------------------------------------");
		//sum()會把數字加總(1+...6)
		System.out.println(list.stream().mapToInt(s->Integer.valueOf(s)).sum());
		//Integer.valueOf(s)).average().getAsDouble(), 小於3的數字加起來然後除出來是小數字
		System.out.println(list.stream().filter(s -> Integer.valueOf(s) < 3).mapToInt(s->Integer.valueOf(s)).average().getAsDouble());

	}

}
