package equals_hasCode;
//覆寫equals
public class OverrideEquals1 {
	  public final String name;
	  public final int age;
	  
	   
	public OverrideEquals1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	 public String toString() {
	      return name + " " + age;
	    }

	 /*
     equals函式未覆寫時，預設的equals函式執行動作，將比較兩個變數所在的記憶體位置是否相同，
     並未比對其實際內容,equals函數標準的覆寫方法為public boolean equals(Object obj)，引數obj
     型態為Object，所以在equals內，需檢查obj的型態是否為OverrideEquals1，並比對兩物件之name和
     age，其中因name的型態為String，比對時需使用String物件已覆寫之equals函式進行檢查，確保
     this.name和obj.name的內容一致。
     */
	    public boolean equals(Object obj) {
	      if (obj != null && obj instanceof OverrideEquals1)
	        if (this.name != null && this.name.equals( ( (OverrideEquals1) obj).name))
	          if (this.age == ( (OverrideEquals1) obj).age)
	            return true;
	  
	      return false;
	    }

	public static void main(String[] args) {
		/*
		 equals用於比較兩個物件是否相同，在這裡所謂的"equals"意義為內容上的相同，equals函式
		 未覆寫時，預設的equals函式執行動作，將比較兩個變數所在的記憶體位置是否相同，並未比對
		 其實際內容，要比對實際內容必須要覆寫equals()
		 */
		OverrideEquals1 foo1 = new OverrideEquals1("A",10);
		OverrideEquals1 foo2  = new OverrideEquals1("A",10);
		OverrideEquals1 foo3  = foo1;
		//未覆寫前false,true ,覆寫後true,true
		System.out.println(foo1.equals(foo2) + " " + foo1.equals(foo3));
	}

}
