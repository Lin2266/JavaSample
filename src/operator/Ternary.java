package operator;

//三元運算子 ?:
public class Ternary {
	/*
	  三元運算子概念和一般if-else條件敘述差不多，其表示如下
	  x = (布林運算式)? true-value : false-value
	  運算式是表示當括號(boolean)中的回傳值為true時，會進行冒號:左邊的敘述(true-value)，反之進行冒號
	  右邊的敘述(false-value)給x，問號?則表示if的判斷
	 */
    public static void main(String[] args) {
        String s = "";
        int i = 0;
        int j = 1;
        s = (i<j)?"正確":"錯誤";//運算式為true，執行:左邊"正確"(字串值)指派給s
        System.out.println(s);
    }
    
}
