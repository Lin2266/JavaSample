package method;

/*
 引數Argument與參數Parameter:
 Java有四種變數，也就是實體變數(Instance Variables)、類別變數(Class Variables)、區域變數(Local Variables)、參數(Parameters)，其中參數與引
 數是相互對應的。
 Argument代表的是呼叫方傳遞的值，並且它必須是單向的，也就是不會受到被呼叫方的影響。而被呼叫方宣告的對應變數則稱為Parameter，它是可以改變的值（因為對被呼叫方來說，它是一個變數）。
 引數代表在Console Mode環境中，使用者輸入給主函式的資料項目。
 若呼叫者(Caller;Calling Program)有資料要傳遞給被呼叫者(Callee;Called Program)，則必須藉由傳入引數串列將資料傳遞給函式的參數，並且『傳入引數串列』的傳入變數會由『函式定義的參數串列』的相對參數來接收，其順序、個數、資料型態必須相同（不會做自動轉型）但引數名稱可以與參數名稱不同。
 */
public class Variables1 {
//引數與參數的對應
    public static float compute_area(float r, float pi){//r,pi接收引數radius, 3.14f
        return r*r*pi;//r,pi接收到引數做運算，把結果回傳給area
    }
    public static void main(String[] args) {
        //3.14必須指定為float型態的3.14f，否則會被視為double，而由於不會自動轉型，故會發生錯誤
        float radius = 10.0f,area;
        //呼叫方法運算完把結果指派給area
        area = compute_area(radius, 3.14f);//radius, 3.14f為引數給參數r,pi
    }

}
