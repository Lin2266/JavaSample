package Enum;

//等級
public enum Enumerated1 {
	A(5000, "Great"), B(3000, "Good"), C(1000, "OHOH");//A列舉(5000參數)

	private int bonus;// 獎金
	private String name;

	private Enumerated1(int bonus, String name) {
		this.bonus = bonus;
		this.name = name; // (名字拿掉就會是null)
	}
	private Enumerated1(double bonus, String name) {//覆載
		
	}

	public int getBonus() {
		return bonus;
	}

	public String getName() {
		return name;
	}
	

	public static void main(String[] args) {
	
		Enumerated1[] en = Enumerated1.values();
		for(Enumerated1 en1:en){
			System.out.println(en1 +"\t"+ (en1.getBonus() +"\t"+ en1.getName()));//字串跟數字相加要注意

		}
		
		
	}
}
