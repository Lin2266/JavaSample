package algorithm;


public class BubbleSentry extends Object{
	int date[] = new int[] {4,6,2,7,8,9};
	
	public void showdata() {
		int i;
		for(i=0;i<date.length;i++) {
			System.out.print(date[i] + " ");
		}
		System.out.print("\n");
	}
	
	public void bubble() {
		int i,j,tmp,flag;
		for(i=5;i>=0;i--) {
			flag=0;
			for(j=0;j<i;j++) {
				if(date[j+1] < date[j]) {
					tmp = date[j];
					date[j] = date[j+1];
					date[j+1] = tmp;
					flag++; //如果有執行過交換，則flag不為0
				}
			}
			
			if(flag == 0) break;
			
			//當執行完一次掃描就判斷是否做過交換動作，如果沒有交換過資料，
			//表示此時陣列已完成排序，故可直接跳出迴圈
			System.out.print("第" + (date.length-i) + "次排序:");
			for(j=0;j<date.length;j++) {
				System.out.print(date[j] + " ");
			}
			System.out.print("\n");
				
		}
		
		System.out.print("排序後結果是:");
		showdata();
	}

	public static void main(String[] args) {
		/* 氣泡排序法有個缺點，就是不管資料是否已排序完成都固定會執 行n(n-1)/2次，
		   請利用所謂崗哨的觀念，可以提前中斷程式，又可得到正確的資料，來增加程式
		   執行效能。
		*/
		
		System.out.print("改良氣泡排序法\n原始資料:");
		BubbleSentry sentry = new BubbleSentry();
		sentry.showdata();
		sentry.bubble();
		
		
	}

}
