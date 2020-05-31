
package array;

public class Array_loop02 {

    public static void main(String[] args) {
       int arr[] = {1,2,3};
        
       for(int var : arr){
          int i = 1;
          //加;會無限迴圈,一直在;以內的區塊判斷，因為i永遠都1
           while(i<=var);
           System.out.println(i++);
           
       }
    }
    
}
