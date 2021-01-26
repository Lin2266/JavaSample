package algorithm.queue;

public class queue1 {

	public static void main(String[] args) {
		// 佇列缺點，使用過之佇列空間無法再使用，造成無謂之浪費
		int front= -1;	//控制取出(deQueue出端)
		int rear= -1;	//控制加入(enQueue進端)
		int Max=3;
		//進出都是加1
		int queue[] = new int[Max];
		//直覺性的方式做3次
		//加入
		queue[++rear]=1;
		System.out.println("rear  queue[" + rear + "]= " + queue[rear]);
		queue[++rear]=2;
		System.out.println("rear  queue[" + rear + "]= " + queue[rear]);
		queue[++rear]=3;
		System.out.println("rear  queue[" + rear + "]= " + queue[rear]);
		
		//取出
		front++;
		System.out.println("front  queue[" + front + "]= " + queue[front]);
		front++;
		System.out.println("front  queue[" + front + "]= " + queue[front]);
		front++;
		System.out.println("front  queue[" + front + "]= " + queue[front]);
		
	}

}
