package flowControl_if_for;
//中斷流程
public class Break {

	public static void main(String[] args) {
		// 當有符合switch裡的條件時會執行符合switch條件的case內容，因為沒在裡面加break，所以會繼續往下執行，
		//直到有break中斷程式離開，如沒加beack程式跑完case就結束
		
		int i =1;
		switch(3){
		
		case 1:
			System.out.println("執行1");
		case 2:
			System.out.println("執行2");
			break;
		case 3:
			System.out.println("執行3");
		default:
			System.out.println("結尾");//default放哪都沒差
		
		}

	}

}
