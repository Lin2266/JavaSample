package flowControl_if_for;
//label、break、continue
public class For_eachArray1 {

	public static void main(String[] args) {
		String[][] s = {{"a","b","c"},{"d","e","f"}};
		A:
			for(String[] ss:s){
				B:
					for(String sss:ss){
						System.out.println(sss + ",");
						continue A;
					}
		break;
			}

	}

}
