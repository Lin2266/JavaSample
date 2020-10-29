
package IO;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
�Q��System.setIn�BSystem.setOut�BSystem.setErr�i����X�P��J����
�Y�Q�N�ҿ�X�����G�g�J�ɮפ��ӫD��X��ù��W�A�i�Q��System.setOut���ܧ��X�˸m
*/
public class SystemSetOut1 {

    public static void main(String[] args) {
        try(InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            FileOutputStream fos = new FileOutputStream("src/IO/OutputFile.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            PrintStream out = new PrintStream(bos, true)) {
            System.setOut(out);
            String s;
            while((s = br.readLine()).length() !=0){
                System.out.println("�п�J���N���r��(quit���}");
                if(s.equals("quit")) break;
                System.out.println("�z�ҿ�J���r��O = " + s);
                
            }
            out.flush();//�N�w�İϤ��e�M�X
            
        } catch (IOException e) {
        }
        
    }
    
}
