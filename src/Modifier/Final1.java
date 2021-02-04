package Modifier;

public class Final1 {
	
	public static void final1(final int[] arr1) {//陣列參考值不可變，內容可變
		int arr2[] = {5,10,15};
		for(int i = 0;i<arr1.length;i++) {
			arr1[i] = arr1[i] * arr1[i]; 
		}
	}
	public static void final1(final A arr1) {
		A b = new Final1().new A();
		//arr1 = b;
		arr1.aa=100;
	}
	
	
	public static void main(String[] args) {
		A a = new Final1().new A();
		final1(a);//Integer
		
		int orgArr[] = new int[3];
		for(int i = 0;i<orgArr.length;i++) {
			orgArr[i] = i;
		}
		
		final1(orgArr);//陣列
		
		for(int i = 0;i<orgArr.length;i++) {
			System.out.println("orgArr["+i+"]="+orgArr[i]);
		}

	}
	
	
	private class A{
		Integer aa = 10;
	}
}
