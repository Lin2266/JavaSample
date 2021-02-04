package method;

public class Math_pow1 {

    public static void main(String[] args) {
    	//呼叫pow函式，幫我們計算i的j次方，回傳值由powNum接收。

        double i = 7.0, j = 4.0;
        double powNum, logNum;
        powNum = Math.pow(i, j);//poo回傳a的b次方
        System.out.println(i + "的" + j + "次方=" + powNum);
        
    }

}
