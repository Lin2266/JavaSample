package array;


public class Array_loop08 {

    
    public static void main(String[] args) {
       
        int [] ages = new int [5];
       
        ages [0] = 5 ;
        ages [1] = 25 ;
        ages [2] = 15 ;
        ages [3] = 20 ;
        ages [4] = 25 ;
        
        /*
        double total = 0;
       
        for (int i = 0 ; i < ages.length ; i++) {
            total = total + ages [i];
            
        }
       
       // int total = ages [0] + ages [1] + ages [2] + ages [3] + ages [4] ;
        double average = total / ages.length ;
        System.out.println(average);        
       */
        for (int i = 0 ; i < ages.length ; i++){
           System.out.println(ages.length); 
        }
        
    }
    
}
