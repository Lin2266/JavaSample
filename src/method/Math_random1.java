
package method;


/*
public static double random()
功能：回傳一個介於0.0~1.0（不含1.0）的亂數
*/
public class Math_random1 {

    public static void main(String[] args) {
    //由於產生的亂數是一個小數，而應用卻常常需要整數的亂數值，因此可以對所取得的亂數值，進行乘法或加法，然後透過型態轉換取得應用所需要的整數亂數值。    
        for(int i=1;i<=6;i++){
            System.out.println("第" + i + "個隨機亂數為:" + Math.random());
        }
        
//使用亂數函式產生6個1~49的整數，並存放於整數陣列中（不要求數字不重覆）。
//於Math.random()*49可產生的亂數將介於0.0~49.0（不含49.0），故將之加1後為1.0~50.0（不含50.0），強制型態轉換為int整數類型，則小數部分會被去除，就可以得到『1~49』的亂數。        
        int lotto[] = new int[6];
        for(int i=1;i<=6;i++){
            lotto[i-1]=(int)(Math.random()*49)+1;
            System.out.println("第" + i + "個隨機亂數為:" + lotto[i-1] );
        }
    }
    
}
