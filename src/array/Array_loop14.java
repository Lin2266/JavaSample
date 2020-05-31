package array;


public class Array_loop14 {

    
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
        
        a [6][15] = "烤肉";
        a [6][20] = "游泳";
        a [6][23] = "上課";
        
        int month = 7;
        for (int i = 0; i < a[month-1].length; i++){
            if(a [month-1][i] != null)
            System.out.println(month + "/" + (i+1) + ":" + a[month-1][i] );
            
        }
    }
    
}
