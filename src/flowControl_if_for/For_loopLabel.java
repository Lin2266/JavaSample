package flowControl_if_for;

//為迴圈命名:label
public class For_loopLabel {
/*label代表迴圈的標示記號，可利用label指向相對應的迴圈，定義標示名稱分二種:
	1.label_name:迴圈敘述...
	2.label_name:
	    迴圈敘述...
  在定義label_name時，後面務必加上冒號(:)，之後才是接迴圈的敘述句
	
*/
    public static void main(String[] args) {
    	OuterLoop:
    		for( ; ; ){
    			InnerLoop:
    			for( ; ; ){
    				
    				break InnerLoop;
   //編譯錯誤，unreachable code(無法訪問的代碼)當前面是break時，後面這些都不會執行到時稱不可達代碼
//    				System.out.println("1");
//    				continue InnerLoop;
//    				System.out.println("2");
//    				
//    				break OuterLoop;
//    				System.out.println("1");
//    				continue OuterLoop;
//    				System.out.println("2");
    			}
    		}
       
    }
    
}
