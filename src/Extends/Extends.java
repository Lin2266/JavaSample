package Extends;

//繼承，是一個 is-a 的關係，指類別物件的資源可以延伸和重複使用，只允許單一繼承
class Father{
	public int money = 10000;
	public void undertaking(){//事業
		System.out.println("父親的事業");
	}
}

class Son extends Father{
	 public int money;
     Son(int money){
         setMoney(money);
     }
     public void setMoney(int money) {
         this.money = money;//參數跟屬性名稱不一樣時，屬性就可以不用加this   
     }
     @Override
     public void undertaking() {
         System.out.println("兒子的事業:電腦網路" + this.money);
         System.out.println("父親的" + super.money);
     }
	
}
public class Extends {
	
	public static void main(String[] args) {
		//調用父類別的屬性跟方法
		Son s = new Son(5000);
		s.undertaking();
		System.out.println("金額" + s.money);

	}

}
