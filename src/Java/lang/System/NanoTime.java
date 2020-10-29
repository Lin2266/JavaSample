package Java.lang.System;

public class NanoTime {
	static void doSomeTing() {
		for(int i =1;i<10;i++) {
		System.out.println("做些什麼:"+i);
		}
	}

	public static void main(String[] args) {
		long startTime = System.nanoTime();//納秒
		doSomeTing();
		long endTime = System.nanoTime();
		System.out.println("執行時使用的時間" + (endTime - startTime));

	}

}
