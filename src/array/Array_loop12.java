package array;


public class Array_loop12 {

    public static void main(String[] args) {
        //int [] number = new int [5];
        /*String[] name = new String [3];
        
        name [0] = "Simon!";
        name [1] = "Mary!";
        name [2] = "John!";
        
        
        for (int i = 0; i < name.length; i++){
            System.out.println(name[i].length());
        } 
        String [] name = {"Simon","Mary"};
        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }*/
        int [] ages = {1,2,3,4};
        int total = 0;
    
        for( int a: ages){
        total = total + a;
        }   
        System.out.println(total);
             
        
        
        
        
        
        
        
        
        /*
        number[0]= 35; 
        number[1]= 8;
        number[2]= 23;
        number[3]= 51;
        number[4]= 17;
        //迴圈加總
        double total = 0;
        for (int i = 0;i < number.length; i++){
            total = total + number[i];
        }
        System.out.println(total/5);
        
        //一般加總
        double total = number [0] + number [1] + number [2] + number [3] + number [4];
        double average = total / number.length;
        System.out.println(average);
        */
        
    }
    
}

    