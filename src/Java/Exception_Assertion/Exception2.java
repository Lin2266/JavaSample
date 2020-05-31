
package Java.Exception_Assertion;

public class Exception2 {
     public static int dispResult(){
        int[] arr = {100,2};
        try{
            return arr[1]/arr[2];
           
        }catch(ArrayIndexOutOfBoundsException ex){
            return 1;
        }catch(Exception ex){
            return 2;
        }
        //finally為總是執行的區段，在程式跳離try-catch之前必須執行的區段，不論程式是否有例外發生
        //或之前有下達return，即使try-catch遇到return，finally區段也會先執行，然後才去執行return
        finally{ 
            //不執行finally區段方法:在finally區段前執行System.exit(1)強迫正在執行中的程式結束
            //(!=0代表關閉)(0代表正常結束);
//            System.exit(1);
            //finally區塊先執行，然後又是return 3;結束，所以catch1沒有機會執行到
            return 3;
        }
    }
    public static void main(String[] args) {
        System.out.println("Result: " + dispResult());
    }
    
}
