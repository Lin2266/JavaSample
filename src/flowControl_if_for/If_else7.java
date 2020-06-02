package flowControl_if_for;

import java.util.Scanner;

public class If_else7 {

	public static void main(String[] args) {
		/*根據輸入的繳款記錄、持卡年份評斷預借現金額度。其公式如下:
		 繳款記錄:不正常====>無法預借現金
		 繳款記錄:正常
		 	持卡未滿半年============>無法預借現金
		 	持卡滿半年未滿一年======>預借現金額度為信用額度之1/20
		 	持卡滿1年===============>預借現金額度為信用額度之1/10
		
*/			double advanceCash = 0;
			System.out.println("請輸入信用額度:");
			Scanner scanner = new Scanner(System.in);
			int cash = Integer.parseInt(scanner.nextLine());
			System.out.println("繳款是否正常(1:正常,0:不正常)");
			int record = Integer.parseInt(scanner.nextLine());
			String string = "預借現金金額為:";
			
			if(record==1) {
				System.out.println("請輸入持卡年份:");
				double years = Double.parseDouble(scanner.nextLine());
				if (years >=0.6 && years< 1.2) {
					advanceCash = cash * 0.05;
				} else if(years >=1.2) {
					advanceCash = cash * 0.1;
				}
				System.out.println(string + advanceCash);

			}else {
				System.out.println(string + (int)advanceCash);
			}
			
}

}
