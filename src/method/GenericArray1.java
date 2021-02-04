package method;


import java.util.ArrayList;

public class GenericArray1 {
	
	static ArrayList<Integer> arraytest(int array[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0;i<array.length;i++) {
			list.add(array[i]);
		}
		return list;
	}
	public static void main(String[] args) {
		int array[] = {1,3,5};
		
//		ArrayMethod aMethod = new ArrayMethod();
//			System.out.println(aMethod.arraytest(array));
		System.out.println(arraytest(array));

	}

}
