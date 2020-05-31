package referenceType;

import flowControl_if_for.If_else1;

//陣列和字串的長度
public class ArrayAndStringLenght {

	public static void main(String[] args) {
		int[] i= new int[10];
		int len = i.length;//取得陣列索引內的元素長度
		System.out.println(len);
		
		String s= "1234567";
		int slen = s.length();//取得字串長度
		System.out.println(slen);
		
		//二維{一層0{二層0(1),1(1),2(1)},一層1{二層0(2),1(2),2(2)}}
		int[][] ii = new int [][]{{1,1,1},{2,2,2}};
		int len2= ii.length;//二維陣列時，這樣的宣告只會取得第一層的元素長度，想要取得的內容那層時必須用[第幾層]=[0]
		System.out.println(len2);		
		System.out.println(ii[0].length);

	}

}
