
package Java.util.Scanner1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scanner5 {

    public static void main(String[] args) throws IOException{//這裡涉及到檔io操作
//        Scanner scanner=new Scanner(System.in);
//        double a=scanner.nextDouble();
//        System.out.println(a);
        
        
        double sum=0.0;
        int count=0;
        FileWriter fout=new FileWriter("src/LIN/text.txt");
        fout.write("2 2.2 3 3.3 4 4.5 done");//往檔裡寫入這一字串
        fout.close();
        FileReader fin=new FileReader("src/LIN/text.txt");
        Scanner scanner=new Scanner(fin);//注意這裡的參數是FileReader類型的fin
        while(scanner.hasNext()){//如果有內容
            if(scanner.hasNextDouble()){//如果是數字
                sum=sum+scanner.nextDouble();
                count++;
            }else{
                //注意不是nextString()
                String str=scanner.next();
                if(str.equals("done")){
                	System.out.println(str + "...");
                    break;  
                }else{
                    System.out.println("檔案格式錯誤!");
                    return;
                }
            }
        }
        fin.close();
        System.out.println("檔中資料的平均數是:"+sum/count);
        
        
//        結果輸出檔中資料的平均數是:3.1666666666666665
//        這段程式的功能是將"2 2.2 3 3.3 4 4.5 done"寫入文件scanner讀取文件中的數直到done結束。
//        並求出數位的平均值，比較有意思的是scanner會自動一空格作為分割符區分不同數位。
//        當然也可以通過scanner.useDelimiter(Pattern pattern)來設置不同的分割符，比如 scanner.useDelimiter(",*");
    }
    
}
