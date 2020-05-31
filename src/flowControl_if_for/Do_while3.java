package flowControl_if_for;

//for,while,do-whle 迴圈敘述
public class Do_while3 {

    public static void main(String[] args) {
        int j = 0, k = 0;
        for (int i = 0; i < 2; i++) {
            do {
                k = 0;
                while (k < 4) {
                    k++;
                    System.out.print(k + " ");
                }
                System.out.println(" ");
                j++;//for迴圈第一圈時，j就+3了，執行第二圈j=4為false離開do-while迴圈
                System.out.println("J++" + j);
            } while (j < 3);
            System.out.println("----");
        }
    }
//        1234
//        1234
//        1234
//        ----
//        1234
//        ----        
}
