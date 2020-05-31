package sample;

public class Sam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int[] a = {3,1,9,6,5};
		for(int i = 3;i >= 0 ;i--){
			for(int j = 0;j <= i;j++){
				if(a[j] > a[j+1]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] =temp;
				}
			}
		}
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i]);
		}
	}

}
