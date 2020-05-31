package Java.Exception_Assertion;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
用來處理錯誤的類別是Throwable、Error、Exception類別，其中Error與Exception類別皆繼承自Throwable，
Error:指系統本身發出的錯誤訊息
Exception:一個不正常的程式在執行期間所觸發的例外

程式執行中可能發生Error錯誤或RuntimeException例外錯誤，但編譯器在編譯程式碼時並不強制要求在程式碼中必須實作
try-catch或定義throws丟出例外的處理，因為這種類型錯誤的發生通常是系統資料不足、環境安裝和設定上出了問題、
或程式邏輯錯誤所導致。
至於其他的Exception，如IOException例外類別，當檔案找不到時會丟出(throw)一個FileNotFoundException類別事件，
因此在程式撰寫中就必須先用try-catch區塊，將容易發生Exception的程式碼包住，並在攔截錯誤訊息之後再做例外處理。
 
例外處理中有區分成二種:
1.應檢驗例外 checked Exception:非檢驗例外以外，其它的發生例外時必須用try-catch加以處理或拋出宣告throws
2.非檢驗例外Unchecked Exception:
Error:代表有重大錯誤發生，如:記憶體不足、JVM錯誤、動態連結錯誤或其他硬體錯誤等..，建議不做例外處理
RuntimeException:如數學錯誤、陣列索引元素超過最大值、null指標錯誤等

 */

public class Exception1 {
	//繼承關係時，要覆寫父類別的方法有拋出例外處理時
	static class Father{
        void amethod() throws Exception{
        
        }
    }
    static class Son extends Father{
        //子方法也可不覆寫拋例外，例外型態範圍不能比父類別大
        @Override
        void amethod() throws IOException {
           
        }
        
    }
    //throws例外關係要比new throw大
    public static void main(String[] args) throws Exception{
    	// try-catch中，try區塊只能一個，但catch區塊可以很多個
        try {
            //安置可能會發生例外的程式碼
        	
        } 
        //catch類別有繼承關係，必須先寫子類別在父類，沒直係關係可以任意擺放
        catch (FileNotFoundException fn) { //子
           //Exception例外發生時的錯誤處理，當執行時會將所擷取到的錯誤狀態封裝在fn物件變數中
        	System.out.println(fn);
        } catch (IOException io) {//父、子
            
        } catch (Exception e) {//父
            
        }
        
        //繼承
        Son s = new Son();
        try {
            s.amethod();
        } catch (IOException e) {
        }
    }

}
