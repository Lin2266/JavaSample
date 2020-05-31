package operator;

public class Arithmatic {

	public static void main(String[] args) {
		//遞增運算
		int a = 0, b = 0;
		b = a++ + ++a - a++; // 0 + 2 - 2 = 0 有加括號跟沒加括號是一樣的結果(a++ + ++a)or(++a - a++)
		System.out.println("a = " + a + ", b = " + b); // a = 3 , b = 0
		
		//遞減運算
		int c = 0, d = 0;
		b = c-- + --c - c--; // 0 + -2 - -2 = 0
		System.out.println("c = " + c + ", d = " + d); // c = -3 , d = 0
		
		int x = 0;
		System.out.println("打印完才做++的動作" + x++);//0
		System.out.println(x);//1

	}

}
