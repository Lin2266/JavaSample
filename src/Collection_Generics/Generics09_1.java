
package Collection_Generics;


//<? extends 類別名稱>用於方法參數簽章的注意事項

//自訂泛型類別
class Life<T>{
    private T val;

    public Life(T val) {
        this.val=val;
    }
    
//    void printVal(Life life){
//        System.out.println(life.val);
//    }
    //把上面方法改成以下方法 
    //例1:仍可調用
    void printVal(Life<? extends Number> life){
        System.out.println(life.val);
    }
    //例2:發生例外(實際參數Life無法轉換成方法參數Life<Integer>的型態(只能接收Integer型態)，編譯錯誤
    //Life的泛化應是Number的子類別，而Number的子類別有AtomicInteger、AtomicLong、BigDecimal、BigInteger、Byte
    //Double、Float、Integer、Long、Short，這些都是Life有可能的泛型，所以無法調用
//    void printVal(Life<Integer> life){
//        System.out.println(life.val);
//    }
    
}
public class Generics09_1 {

    public static void main(String[] args) {
        //建立life實體其泛型型別是<? extends Number>，Life的泛型化應為Number的子類別
        Life<? extends Number> life = new Life<>(42);
        life.printVal(life);
    }
    
}
