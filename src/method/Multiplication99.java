package method;

//無傳入引數及回傳值的函式
public class Multiplication99 {
//列印九九乘法表的函式（print99函式），該函式不接受任何傳入引數，也不回傳任何資料。
//沒有傳入引數，因此參數串列為空。由於函式不需要回傳值，所以必須將函式回傳值的資料型態設為void。
    public static void print99() // 函式定義
    {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }//函式執行的最後一行

    public static void main(String[] args) {
        //函式呼叫，雖然不必傳入引數，但( )仍不可省略。print99()函式中，並無return敘述，所以函式會執行到最後一行，然後才返回呼叫函式處。
        print99(); //呼叫函式處 
    }

}
