package array;


public class Array_loop13 {

    
    public static void main(String[] args) {
        //3支電話4個月的錢，第2支手機只有2個月
        int [][] bs = new int [3][];
        
        bs [0] = new int [4];
        bs [1] = new int [2];
        bs [2] = new int [4];
        
        bs [0][0] = 100;
        bs [0][1] = 110;
        bs [0][2] = 120;
        bs [0][3] = 130;
        
        bs [1][0] = 200;
        bs [1][1] = 210;
        
        bs [2][0] = 300;
        bs [2][1] = 310;
        bs [2][2] = 320;
        bs [2][3] = 330;
        /*
        for (int [] p : bs){
            for ( int a : p ){
                System.out.print(a);
                System.out.print("\t");
            }
            System.out.println();
        }*/
        for (int x = 0; x < bs.length; x++){
            for (int y = 0; y < bs[x].length; y++){
                System.out.print(bs[x][y]);
                System.out.print("\t");
            }
            System.out.println();
        }
    
    
    
    }
}
