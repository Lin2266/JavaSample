
package Java.util.Scanner1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//將檔案的內容分析，及分隔符號的設定，計算公式為『總成本=成交價格*委託張數*1000』
public class Scanner4 {

    public static void main(String[] args) throws IOException {
            FileWriter fw=new FileWriter("src/LIN/Stock.txt");
            fw.write("2330,台積電,50.5,10#2303,聯電,21,20,結束");
            fw.close();
            
            FileReader fr=new FileReader("src/LIN/Stock.txt");   
            //事先在程式中給定資料的方式，可以是hard code(硬編碼)一個字串、檔案或資料串流等。
            Scanner sc = new Scanner(fr);
            sc.useDelimiter(",|#");//自定分隔符號(斷行可用\n)
            System.out.println("下單資訊:");
            float cost = 0;//成本
            //是否還有下一筆int資料，由於每筆資料起頭是股票代號(int型態)，第三筆起頭是『結束』字串而不是int，會跳出while迴圈
            while(sc.hasNextInt()){
                int sNo = sc.nextInt();
                String sName = sc.next();
                float price = sc.nextFloat();//price價格
                int quantity = sc.nextInt();//數量(框t踢)
                System.out.println("------------------------------");
                System.out.println("股票代號:"+ sNo);
                System.out.println("股票名稱:"+ sName);
                System.out.println("成交價格:NT."+ price);
                System.out.println("委託張數:NT."+ quantity);
                cost += price*quantity*1000;
            }
                System.out.println("------------------------------");
                System.out.printf("總成本:NT.%,.2f%n",cost);//flag千分號, 精確度.2  十進制浮點數f  
                sc.close();  
    }
    
}
