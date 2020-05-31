package 習題;



public class String_split_operator {

    public static void main(String[] args) {
        String a = "h1 2 300;h2 5 600;h3 4 800";
        String[] b = a.split(";| ", 0);
        String[] b1 = {b[0], b[3], b[6]};
        int num[] = new int[3];
        num[0] = Integer.parseInt(b[1]);
        num[1] = Integer.parseInt(b[4]);
        num[2] = Integer.parseInt(b[7]);

        int num1[] = new int[3];
        num1[0] = Integer.parseInt(b[2]);
        num1[1] = Integer.parseInt(b[5]);
        num1[2] = Integer.parseInt(b[8]);
//        for(int n:num1){
//            System.out.println(n);
//        }
        
                for (int j = 0; j < num1.length; j++) {
                    System.out.println("產品:" + b1[j] + "數量:" + num[j] + "總價格:" + num[j] * num1[j]);
                }
            
        
    }

}
