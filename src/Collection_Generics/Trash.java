package Collection_Generics;

//Trash垃圾桶(保存不要的東西) <型態>(跳動)T接收到什麼型態就是什麼型態 15-6有介紹
//可以放多種類別的東西，型態(T)會跟著類別的型態跳動
public class Trash<T> {
    
    public T[] ts;
    
    public Trash(T[] ts){
        this.ts = ts;
    }
    
    public T get(int i){
        return ts[i];
    }
     public static void main(String[] args) {
        //存放宣告的型態，跟讀取作用
        String[] sa = new String[10];
        Trash<String> t = new Trash<>(sa);
        t.ts[0] = "HELLO";
        //toLowerCase(轉小寫)
        System.out.println(t.get(0).toLowerCase());
        
        //宣告Product時就是Product型態
        Product[] ps = new Product[5];
        //類別<型態>
        Trash<Product> t2 = new Trash<>(ps);
        t2.ts[0] = new Product(1, "p", 10, false, 100);
        System.out.println(t2.get(0).getName());
        
        
    }
    
}
