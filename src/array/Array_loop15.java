package array;


public class Array_loop15 {

    
    public static void main(String[] args) {
        String [][] a = new String [12][];
        
        a [0] = new String [31];
        a [1] = new String [28];
        a [2] = new String [31];
        a [3] = new String [30];
        a [4] = new String [31];
        a [5] = new String [30];
        a [6] = new String [31];
        a [7] = new String [31];
        a [8] = new String [30];
        a [9] = new String [31];
        a [10] = new String [30];
        a [11] = new String [31];
        
        a [1][15] = "Happy";
        a [1][16] = "Happy";
        a [1][17] = "Happy";
        int month = 2;
        for (int i = 0; i < a[month-1].length; i++ ){
            
                System.out.println(month + "/" + (i+1) + ":" + a [month-1][i]);
        }
        
    }
    
}
