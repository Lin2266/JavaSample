package algorithm.queue;

import java.util.Scanner;

public class queueFunction1 {
	//包成一個enQueue副程式來呼叫
	static int front=-1;
	static int rear=-1;
	static int Max=3;
	static int data;
	static int queue[]= new int[Max];
	
	static void enQueue(int data) {		
		rear=(rear+1)%Max;	//先移動Rear紀錄器，以取餘數(mod)形成一個環(circular)
		queue[rear]=data;	//再將資料存入佇列中 
		
		System.out.printf("enQueue 後的佇列內資料 queue[%d]=%d\n",rear,queue[rear]);
	}
	public static void main(String[] args) {		
		
		System.out.printf("本佇列最大使用空間數=%d\n",Max);
		//從0~3後，又會從0~3形成一個環
		while(true) {			
			System.out.println("請輸入enQueue內容:");		
			Scanner in = new Scanner(System.in);
			data = in.nextInt();
			enQueue(data);
			//好像不會遇到會滿的狀況
			if((rear+1) % Max == front)System.out.println("佇列資料已滿");
		}

	}

}
