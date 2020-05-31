package equals_hasCode;

import java.util.HashSet;

import Collection_Generics.HashSet1;
/* Java 的 equals() 和 hashCode() 這兩個東西，這兩個東西可能看起來很不顯眼，但如果你經常需要
把物件丟到各式各樣的 Java Collection 當中的時候，請一定要注意你的類別這兩個方法是不是都正確實
作了，不然程式很可能跑出來的結果和你預期的是不同的*/
public class OverridehashCode {
	public final int x;
	public final int y;
		
	public OverridehashCode(int x,int y){
		this.x=x;
		this.y=y;
	}
	//3.覆寫hashCode，int型態的寫法
	@Override
	public int hashCode() {
		// 可能不是很好的做法，但至少可以 work
        return this.x * 1013 + this.y;
	}
	
	public static void main(String[] args) {
		//1.一般class跟new String的內容用equals比對得到的結果不一樣
		//因為沒覆寫的equals效果跟==是一樣的，都是比對參考值，所以要覆寫equals()
		OverridehashCode point1 = new OverridehashCode(0, 0);
		OverridehashCode point2 = new OverridehashCode(0, 0);
		
		System.out.println("point1 == point2:" + (point1 == point2));//false
		System.out.println("point1.equals(point2):" + point1.equals(point2));//false，覆寫完變true
		
		
		/*2.如果把String跟Point放到HashSet裡比對呢
			如果放的是 String 物件，就可以判斷 HashSet 裡有內容相同的 String 物件，但變成放 Point 
			物件時，Java 就認為沒有相同內容的 Point 物件呢？
			HashTable 是沒有順序性的，你不能期待你放進去的順序和取出來的順序是一樣的！
			「把物件放到架子上」只是比喻，實際上HashSet 裡放的不是物件，而是指到物件的
			 Reference」，因為在 Java 裡要存取到物件一定得靠 Reference！，所以要覆寫hashCode()*/
		String str1 = new String("Hello World");
		String str2 = new String("Hello World");
		
		HashSet<OverridehashCode> myPoint = new HashSet<>();
		HashSet<String> myString = new HashSet<>();
		myPoint.add(point1);
		myString.add(str1);
		
		System.out.println("point1有myPoint裡指定的值嗎？" + myPoint.equals(point2));//false
		System.out.println("point1有myPoint裡指定的值嗎？" + (myPoint.contains(point2)));//false
		System.out.println("str2有myString裡指定的值嗎？" + (myString.contains(str2)));//true
		
		System.out.println("str1.hashCode:" + str1.hashCode());//-862545276
	    System.out.println("str2.hashCode:" + str2.hashCode());//-862545276
	    
	    //hashCode覆寫完後，point1跟point2的值是一樣的，0
	    System.out.println("point1.hashCode:" + point1.hashCode());//366712642
	    System.out.println("point2.hashCode:" + point2.hashCode());//1829164700
	}

}
