package Enum;

/*
列舉Enumerated簡稱為Enum:
存取修飾字 static enum 列舉名稱{內容1,內容2..}
只要是內部類別中所定義的enum，編譯器都會自動加上static和final,
編譯時期會自動繼承Enum這個抽象類別,Enum抽象類別的宣告:
public abstract class Enum<E extends Enum<E>> extneds Object implements Comparable<E>, serializable

所產生的列舉類別具有final特性，並自行繼承java.lang.Enum
public final class Week extends Enum{...}

除了編譯器以外，都不可以繼承enum和繼承含有enum的子類別，但可以實作介面
 */
public enum Enumerated {
	// 列舉的內容都是經過public static final Week Sunday;的修飾
	SUNDAY{//匿名類別
		public String toString(){
			return "星期日";
		}
	}, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

	String s; //宣告屬性時，Enum會自動加上private，不用寫也可以

	// 列舉的建構子是由編譯器自行產生與實作，存取權限是private
//	private Enumerated(String s) {
//		this.s = s;
//	}

	public static void main(String[] args) {
		System.out.println("Enum.FRIDAY:" + Enumerated.FRIDAY);
		System.out.println("Enum.valueOf("+"FRIDAY"+"):" + Enumerated.valueOf("FRIDAY"));
		System.out.println("Enum.valueOf(Enum.class, "+"FRIDAY"+"):" + Enumerated.valueOf(Enumerated.class, "FRIDAY"));
		System.out.println("以上三種取值方法的結果是一樣的");
		// Enum不可以new，要先轉成陣列，在把值抓出來
		Enumerated[] e = Enumerated.values(); // values方法取得Enum內容
		for (Enumerated s : e) {// for-each要用同型態去接收
			System.out.println(s);
		}

		System.out.println("---------------------------------");
		// for-loop
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		
		System.out.println("SUNDAY有加toString:" + Enumerated.SUNDAY);
		
		System.out.println("switch-----------");
		switch(Enumerated.MONDAY){//用數字比對時，是用Enumerated.MONDAY.ordinal()取出比對子的數值
		case MONDAY:
			System.out.println("星期一猴子穿新衣！");
			break;
		case TUESDAY:
			System.out.println("星期二猴子去烤肉！");
			break;
		case WEDNESDAY:
			System.out.println("星期三猴子去爬山！");
			break;
		}
	


	}
}
