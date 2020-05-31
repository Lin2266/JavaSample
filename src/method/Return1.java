
package method;

/*
1.return敘述有2個功用：
(1)回傳函式資料:
在函式主體內應該包含一個以上的return敘述，以便傳回資料。不具回傳值(void)的函式則可以沒有return敘述。
(2)函式返回:
 void方法若要用return也可以，必須加上"return;"表示無回傳值，作用是來中斷該方法後續程式碼的執行，可以配合流程控制語法來撰寫(if)，建構子就像是一種回傳值的方法，也可以加上"return;"。
2.return回傳資料的語法:
return 常數、變數、運算式或其他具有結果值的敘述;
(1)回傳函式資料的資料型態必須和函式定義的回傳值資料型態相容（需可進行自動轉型）。
(2)函式回傳值資料型態若被宣告為void，則不用
return回傳值。
(3)若回傳值為運算式或其他具有結果值的敘述，則會
先計算其運算結果，然後才傳回該值。
*/
public class Return1 {
    int func1(){
        int a = 0;
        return a;
    }
    //轉型
    double func2(){
        float c = 3.0f;
        return c;
    }

    public static void main(String[] args) {
        
    }
    
}
