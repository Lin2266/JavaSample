package flowControl_if_for;


public class Do_while2 {
    private int i;//屬性不用初始化
    void disp() {
        //沒new的變數(區域變數)就要設初始化
    	while(i<=5){
            
            for(int j = 1;j<=5;){
                System.out.print(j + " ");
                j++;
            }
            System.out.println(i++);
        }
    }
    public static void main(String[] args) {
       new Do_while2().disp();//new可以不必初始化
    }
    
}
