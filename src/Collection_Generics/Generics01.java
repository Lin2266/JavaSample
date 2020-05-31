
package Collection_Generics;

/*
泛型Generics:(不支援基本型態)7.0新增Diamond(鑽石)，宣告時只需寫一個<>，型別檢查在編譯時期
提供安全又有彈性的型別設計
提供編譯時期的型別安全檢查
省去不必要的轉型，不必承擔執行時期物件型別轉換的風險
在Collection API中大量使用了泛型的技巧

泛型的型別參數<>只支援參考型別(包裝型別)，不支援基本型別跟<Object>

Type Token(型態象徵):泛型資料型態的代號
宣告Type Token< >的名稱時，只要符合識別子的命名規則即可，習慣上以一個大寫英文字來表示:
T:表示Type
E:表示集合的元素型別
K:代表主鍵執行型別
V:表示Value
?:萬用，<?>、<A>、<? extends Number>、<A extends Number>、
其它常見的還有像是: S、U...什麼代號表示都可以
<>泛型符號，E型別參數(可變動的參數)
*/
/*
一般寫法
class Message{//訊息
    private Object message;

    public Message(Object message) {
        this.message = message;
    }

    public Object getMessage() {
        return message;
    }
       
}
*/
//泛型的Type Token
class Message1<T>{
    private T message;

    public Message1(T message) {
        this.message = message;
    }

    public T getMessage1() {
        return message;
    }
    
    
}

public class Generics01 {

    public static void main(String[] args) {
        //在類別中要記錄一個訊息資料，資料可能是「整數、字串、客戶資料」，該怎麼設計這個變數的型別
        //泛型宣告不但能有多型的彈性，編譯器還會提供更多的檢查，可減少instanceof檢查與轉型等程式
        
        /*
        //沒泛型時的寫法(多型)
        Message1 strMsg = new Message1("測試訊息");
        if(strMsg.getMessage1() instanceof String){
            String s = (String)strMsg.getMessage1();
            System.out.println(s);
        }
        
        Message1 intMsg = new Message1(100);
        if(intMsg.getMessage1() instanceof Integer){
            int s = (Integer)intMsg.getMessage1();
            System.out.println(s);
        }
        */
        
        //泛型的寫法，T代替原來的Object，而 T 的型別在建立物件時再確定即可
        Message1<Integer> intMsg = new Message1<>(100);
        System.out.println(intMsg.getMessage1());
        
        Message1<String> strMsg = new Message1<String>("測試訊息");
        System.out.println(strMsg.getMessage1());
    }
    
}
