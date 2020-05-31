package algorithm;

public class Ch5_20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,temp;
		int[] number = {9,7,3,1,5};
		for(int i = 0;i < number.length-1;i++){
			min = i;
			for(int j = i+1;j < number.length;j++)
				if(number[min] > number[j]){
					min = j;
				}
				temp = number[min];
				number[min] = number[i];
				number[i] = temp;
			
		}
		
		for(int i = 0;i < number.length;i++){
			System.out.print(number[i]);
		}
	}

}
