package flowControl_if_for;

import java.util.Scanner;

public class If_else4 {

	public static void main(String[] args) {
		// 根據購買入場卷的數量(int)是否大於10張(int)，決定是否打折優待(double)。
		Scanner scanner = new Scanner(System.in);
		int OnePrice = 200,quantity;
		double TotalPrice;
		String string = "張總價";
		
		System.out.println("每張入場卷價格為:" + OnePrice + "元");
		System.out.println("請輸入您要購買的張數:");
		quantity = Integer.parseInt(scanner.nextLine());
		System.out.println("=============================");
		TotalPrice = OnePrice * quantity;
		if (quantity >= 10) {
			double discount = 0.9;
			TotalPrice = TotalPrice * discount;
			string = "張打9折總價";
		} 
		
		System.out.println(quantity + string + TotalPrice + "元" );
		

	}

}
