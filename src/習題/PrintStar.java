
package 習題;

/*
輸入width(寬度)多少，在方法寫個印出符合寬度的三角星星迴圈:
輸入3為以下三角形，輸入4就以此類推
*
**
***
**
*

*/

public class PrintStar {

    public static void printStar(int width){
        int b = 1;
        int a = 1;
        for(int i=1;i<(width*2);i++){       
            for(int j=0;j<a;j++){
                System.out.print("*");  
            } 
            b++;
            System.out.println();
            if(b>width){
                a--;
            }else
                a++;
        }
    }
    
    public static void main(String[] args) {
        int width=5;
        printStar(width);
    }
    
}
