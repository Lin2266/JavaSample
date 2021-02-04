package Java.lang.System;

import Java.lang.String1.Tntern;

public class CurrentTimeMillis {
	static void doSomeTing() {
		for(int i =1;i<10;i++) {
		System.out.println("做些什麼:"+i);
		}
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();//毫秒
		doSomeTing();
		long endTime = System.currentTimeMillis();
		System.out.println("執行時使用的時間" + (endTime - startTime));
		
	}

}
