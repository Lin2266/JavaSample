package array;


public class Array_loop07 {

  
    public static void main(String[] args) {
        String [] names = new String [3] ;
       // String [] names = {1,2,3};
        
        for (int i= 0; i < names.length; i++){
            System.out.println(names[i]);
        }
       
        names [0] = "Simon";
        names [1] = "Lin";
        names [2] = "Sim";
        
        int total = 0;
        
        
        for (int i = 0;i < names.length ; i++){
            total = total + names[i].length();
            
            //System.out.println(names[i].length());
          
            
        }
        
        System.out.println(total);
    }

}