package algorithm.sort;


public class Bubble2 extends Object{
	/* 氣泡排序法有個缺點，就是不管資料是否已排序完成都固定會執 行n(n-1)/2次，
	   請利用所謂崗哨flag的觀念，可以提前中斷程式，又可得到正確的資料，來增加程式
	   執行效能。
	*/
	int[] data = new int[] {69,81,30,38,9,2,47,61,32,79};
	
	public void showdata() {
		int i;
		for(i=0;i<data.length;i++) {
			System.out.print(data[i] + " ");
		}
		System.out.print("\n");
	}
	
	public void bubble() {
		int i,k,temp,flag,total=1;
		for(i=data.length-1;i>=0;i--) {
			flag=0;
			for(k=0;k<i;k++) {
				if(data[k+1] < data[k]) {
					temp = data[k];
					data[k] = data[k+1];
					data[k+1] = temp;
					flag++; //如果有執行過交換，則flag不為0
					System.out.println("交換次數:"+total++);
				}
			}
			
			if(flag == 0) break;
			
			//當執行完一次掃描就判斷是否做過交換動作，如果沒有交換過資料，
			//表示此時陣列已完成排序，故可直接跳出迴圈
			System.out.print("第" + (data.length-i) + "次排序:");
			for(k=0;k<data.length;k++) {
				System.out.print(data[k] + " ");
			}
			System.out.print("\n");
				
		}
		
		System.out.print("排序後結果是:");
		showdata();
	}

	public static void main(String[] args) {		
		System.out.print("改良氣泡排序法\n原始資料:");
		Bubble2 sentry = new Bubble2();
		sentry.showdata();
		sentry.bubble();
		
		
	}

}
