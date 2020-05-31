package method;


/*
呼叫pow函式，幫我們計算i的j次方，回傳值由powNum接收。
呼叫log10函式，幫我們計算powNum的對數（以10為底），回傳值由logNum接收。
*/
public class MathMethod1 {

    public static void main(String[] args) {
        double i = 7.0, j = 4.0;
        double powNum, logNum;
        powNum = Math.pow(i, j);//poo回傳a的b次方
        System.out.println(i + "的" + j + "次方=" + powNum);
        logNum = Math.log10(powNum);//log10回傳a的對數(以10為底)
        System.out.println(powNum + "取10的對數=" + logNum);
    }

}
