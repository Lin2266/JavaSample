package flowControl_if_for;

//印不同形狀的星星
public class For_loop4 {

    public static void main(String[] args) {
       int a = 10;
     int b = 1;
     for(int i=1;i<=10;i++){
     for(int j=1;j<=a;j++){
     if(a!=5)
         System.out.print(" ");
     b++; 
     System.out.print("*");
     }
        
     System.out.println();
     //if(b>=6)
     //a--;
     //else
     a++;
     }
     
     

    /*
     //半凌形
     int a = 1;
     int b = 1;
     for(int i=1;i<=10;i++){
     for(int j=1;j<=a;j++){
     System.out.print("*");
     }
     b++;
     System.out.println();
     if(b>=6)
     a--;
     else
     a++;
     }
     }
     */

    /*
     //直角三角形
     int a = 1;//倒三角改10
     for(int i=1;i<=10;i++){
     for(int j=1;j<=a;j++){
     System.out.print("*");
     } 
     System.out.println();
     a++;//倒三角改a--
     }
     */
}

}
