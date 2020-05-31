package array;

public class Array_loop11 {
//12個月份

    public static void main(String[] args) {

        String[][] ca = new String[12][]; //宣告建立條件

        ca[0] = new String[31];
        ca[1] = new String[28];
        ca[2] = new String[31];
        ca[3] = new String[30];
        ca[4] = new String[31];
        ca[5] = new String[30];
        ca[6] = new String[31];
        ca[7] = new String[31];
        ca[8] = new String[30];
        ca[9] = new String[31];
        ca[10] = new String[30];
        ca[11] = new String[31];

        ca[6][27] = "uml#1"; //設定條件
        ca[6][28] = "uml#1";
        ca[6][29] = "uml#1";

        ca[7][7] = "遊玩！";

        int month = 8;

        for (int i = 0; i < ca[month - 1].length; i++) {
            if (ca[month - 1][i] != null) //有null值會拿掉
            {
                //System.out.println(month + "/" + (i + 1) + ":" + ca[month - 1][i]);
            }
            System.out.println(ca[month - 1][i]);
        }
        
        System.out.println("=============");

    }

}
