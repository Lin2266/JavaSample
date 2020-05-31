package equals_hasCode;

import java.util.HashSet;

public class OverridehashCode1 {
	 public final String name;
	  public final int age;
	  
	   
	public OverridehashCode1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	 /*
    hashCode(雜湊碼)代表了一個物件的編碼，常用於物件的比較上，JAVA中的每個物件皆繼承了預設
    的hashCode函數，但若兩個相同內容的物件卻分別位於不同的記憶體位置，以預設的hashCode函數編
    碼結果不保證一致，若希望僅以物件的內容進行編碼，需覆寫hashCode函數。
     */
	 public int hashCode() {
	      return name.hashCode() << (age % 8) * age;
	    }
	 
	 
	 public boolean equals(Object obj) {
	      if (obj != null && obj instanceof OverridehashCode1 )
	        if (this.name != null && this.name.equals( ( (OverridehashCode1 ) obj).name))
	          if (this.age == ( (OverridehashCode1)  obj).age)
	            return true;

	      return false;
	    }
	    
	public static void main(String[] args) {

		OverrideEquals1 foo1 = new OverrideEquals1("A",10);
		OverrideEquals1 foo2  = new OverrideEquals1("A",10);
		OverrideEquals1 foo3  = foo1;
		
		/*在JDK的java.util套件中，包含了常用的集合(Set)或樹(Tree)資料結構，Set中常用到的有
		TreeSet及HashSet ，HashSet常用於儲存並且篩選重複物件
		若不覆寫hashCode及equals的情況下
		*/
		HashSet hs = new HashSet();
		hs.add(foo1);
		System.out.println(hs.size());
		hs.add(foo2);
		System.out.println(hs.size());
		hs.add(foo3);
		System.out.println(hs.size());
		/*結果為1,2,2
		 在物件HashSet中，將物件加入HashSet前需經過檢查，確保Set中不會有重複的物件出現，呼叫
		 函數add時，此函數首先呼叫傳入物件的hashCode，並與HashSet中每個已加入物件的hashCode
		 比對，若某個HashSet中的物件之hashCode與傳入物件一致，再以equals函式比對兩者是否一致
		 ，因此加入foo2時，HashSet將foo2及foo1視為不同的物件，使得foo2被加入HashSet。
		 欲修正此問題，僅需覆寫equals及hashCode
		 */
	}

}
