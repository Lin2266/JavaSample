package array;

public class Array_loop10 {

    public static void main(String[] args) {

        String[][] s = {{"a", "B"}};
        for(int i =0;i<s.length;i++) {
        	for(int j=0;j<s[i].length;j++) {
            System.out.println(s[i][j]);
        	}
        }
            
        System.out.println("----------------------------");
        int[][] bs = new int[3][];//多維陣列，表示3支手機的4個月金額

        bs[0] = new int[4];
        bs[1] = new int[4];
        bs[2] = new int[2];

        bs[0][0] = 120;
        bs[0][1] = 220;
        bs[0][2] = 180;
        bs[0][3] = 390;

        bs[1][0] = 260;
        bs[1][1] = 280;
        bs[1][2] = 310;
        bs[1][3] = 420;

        bs[2][0] = 90;
        bs[2][1] = 80;

        for (int[] p : bs) {
            for (int a : p) {
                System.out.print(a);
                System.out.print("\t");
            }
             System.out.println();
        }

        System.out.println("===========================");
        int[][] bs1 = {{1, 2, 3}, {4, 5, 6}, {7, 8}};

        for (int[] p1 : bs1) {
            for (int a1 : p1) {
                System.out.print(a1);
                System.out.print("\t");
            }
            System.out.println();
        }
        

        /*
         for (int x= 0; x < bs.length ; x++){
         for (int y = 0; y < bs[x].length ; y++){
         System.out.print(bs[x][y]); 
         System.out.print("\t");
         }
         System.out.println();
         }
         */
    }
}

    // x-1

