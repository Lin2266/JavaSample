package flowControl_if_for;

//continue繼續
public class Continue1 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i ++){
            if (i % 2 == 0) {
                continue;//流程跑到迴圈最後，繼續迴圈的執行
                 
                }  
                System.out.println(i);
            
            }
      //continue直接跳到這從下一次的迴圈繼續跑
    }
    
}
