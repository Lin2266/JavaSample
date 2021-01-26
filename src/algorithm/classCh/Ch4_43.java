package algorithm.classCh;


/*
  迴圈結構:
  讓某一段敘述反覆執行多次的程式，一再重複性的動作
  分類:「計數迴圈」與「條件迴圈」
  1.機器人繞一個正方形(可用for迴圈)
  2.機器人反覆某一個動作(可使用while與do/while迴圈)
  種類:
  1.單層for迴圈
  2.巢狀for迴圈
  3.foreach迴圈
 */
public class Ch4_43 {

	public static void main(String[] args) {
		//1~10
		for(int a = 1;a<=10;a++){
			System.out.print(a);
		}
		System.out.println();
		//1.3.5.7.9
		for(int b = 1;b<=10;b+=2){
			System.out.print(b);
		}
		//2.4.6.8.10
		System.out.println();
		for(int c = 2;c<=10;c+=2){
			System.out.print(c);
		}
		System.out.println();
		//從1累加到10
		int total=0;
		for(int i = 0;i<=10;i++){
			total+=i;
		}
		System.out.print(total);
	}

}
