
package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
���{���i�H�����^����ϥΪ̿�J(System.in)����ơA�çQ��PrintWriter()����N���o����ƿ�X(System.out)�ܿù��W
*/
public class SystemInOut1 {

    public static void main(String[] args) {
        try (InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(in);
             PrintWriter pw = new PrintWriter(System.out, true)){
            String s;
            while(true){
                pw.println("�п�J���N���r��(quit���})");
                s = br.readLine();
                if(s.equals("quit")) break;
                pw.println("\n�z�ҿ�J���r��O = " + s);
            }
        } catch (IOException e) {
        }
    }
    
}
