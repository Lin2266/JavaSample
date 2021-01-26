package algorithm.classCh;


public class Ch5_21Selection {
	public static int Num = 10;
	public static int A[] = new int[Num];
	
	//產生10~100之間的亂數
	public static void RandomNum() {
		int i;
		System.out.println("產生10個亂數值:");
		for(i=0;i<Num;i++) {
			A[i] = (int)(Math.random()*90)+10;//10~100(0*90=0,+10=10)(1*90=90,+10=100)
			System.out.println(A[i] + " ");
		}
		System.out.println();
	}
	
	//選擇排序之副程式
	public static void SeleSort(int A[],int n) {
		int i,j,temp,np;
		for(i=0;i < n-1;i++) {
			np = i;
			for(j=i+1;j < n;j++) {
				if(A[j] < A[np]){
					np = j;
				}
				//相鄰兩個的資料交換位置
				temp = A[i];
				A[i] = A[np];
				A[np] = temp;
			}
		}
		
	}
	
	//列印排序後的結果之副程式
	public static void PrintSelSort(int A[], int n) {
		int i;
		System.out.println("排序10個亂數值:");
		for(i=0;i<Num;i++)
			System.out.println(A[i] + " ");
	}
	public static void main(String[] args) {
		// 先產生10個亂數值，範圍為10~100之間，再利用「選擇排序法」進行由小到大排序。
		RandomNum();
		SeleSort(A, Num);
		PrintSelSort(A, Num);

	}

}
