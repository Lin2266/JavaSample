
package IO;

import java.io.Console;

/*
Java SE 6�s�W�����A�D�n�i�H�b�{�����������o�зǿ�J��X�˸m��Console����A�H�r���ɦV����ê���D���x�˸m�A
�Q�]�p�ΨӳB�z�r���Ҧ��U���D���x�зǤ�r��J��X�A�]����format()�Pprintf()�ΨӮ榡�ƿ�X����T�A
�]����reader()�Pwriter()��k�ǥH���oReader�BWriter����H�i��䥦IO�B�z
*/
public class Console1 {

    public static void main(String[] args) {
        //²����J��X
        Console console = System.console();
        String name = console.readLine("�п�J�W��:");
        char[] password = console.readPassword("�п�J�K�X:");
        System.out.println();
        System.out.println("�z��J���W�� ==> " + name);
        System.out.println("�z��J���K�X ==> " + new String(password));
    }
    
}
