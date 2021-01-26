package algorithm.queue;

public class queue1_1 {

	public static void main(String[] args) {
		//改善方式：視佇列採用循環方式，以取餘數形成一個環(circular)，即環狀佇列(circular queue)
		//陣列: Que[Max] 🡺 front紀錄器 rear紀錄器對陣列作移動存取，以取餘數(mod)形成一個環(circular)
		//最多只能使用n-1個空間
		int front=-1;
		int rear=-1;
		int Max=3;
		int queue[]= new int[Max];
			for(int i=0;i<Max;i++) {
				rear=(rear+1)%Max;//以取餘數(mod)形成一個環(circular)
				queue[rear]=(int)(Math.random()*10)+1; //產生1~10亂數
				System.out.printf("rear  queue[%d]= %d\n",rear,queue[rear]);
			}
			if((rear+1) % Max == front)System.out.println("佇列資料已滿");
			
			for(int i=0;i<Max;i++) {
				front=(front+1)%Max;
				System.out.printf("front  queue[%d]= %d\n",front,queue[front]);
			}
			if(front == rear)System.out.println("佇列資料已空");

	}

}
