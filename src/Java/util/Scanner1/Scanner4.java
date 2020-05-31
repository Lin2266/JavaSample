
package Java.util.Scanner1;

import java.util.Scanner;

//Scanner掃描儀
public class Scanner4 {

    public static void main(String[] args) {
        //猜猜我的年齡
        int answerOfAge = 18;
        //建立輸入物件的固定寫法, System.in代表輸入裝置是鍵盤
        Scanner scanner = new Scanner(System.in);
        System.out.println("請猜猜我的年齡？");
        
        do {
            System.out.println("請輸入一個數字");
            //輸入猜測年齡
            int guessOfAge = scanner.nextInt();
            if(guessOfAge == answerOfAge){
                System.out.println("恭禧你答對了！");
                break;
            }else if(guessOfAge > answerOfAge){
                System.out.println("你猜得太大囉！");
            }else{
                System.out.println("你猜得太小囉！");
            }    
        } while (true);
    }
    
}
