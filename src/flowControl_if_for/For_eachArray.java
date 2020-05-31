package flowControl_if_for;
//for-each與多維陣列
public class For_eachArray {

	public static void main(String[] args) {
		String[][] s = {{"a","b","c"},{"d","e","f"}};
		for(String[] s1:s){//1維
			System.out.println(s1);
			for(String s2:s1){//2維
				System.out.print(s2 + ",");
			}
		}
		System.out.println();
		
		//for-loop
		for(int i =0;i<s.length;i++){
			for(int j =0;j<s[i].length;j++){
				System.out.print(s[i][j] + ",");
			}
		}
	}

}
