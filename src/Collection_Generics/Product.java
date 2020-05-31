package Collection_Generics;


//課本3-13習題，4-12習題改3-13 15-8 Collection容器 (hashCode) 15-23Map
//產品 
//為了加到TreeSet可以依照單價排列，Comparable(java有的),比較Product大小
// implements裡的Comparable(抽象類別)，必需要強制寫compareTo方法<Product>型態
public class Product implements Comparable<Product>{

    private int id;//編號
    private String name;//名稱
    private double unitPrice;//單價
    //自行設定的值，如:10元商品單價全都10的情況下
    //private double unitPrice = 10;
    private boolean free;//判斷是否免費
    private int stock;//庫存
    //5-7習題

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //商品不是10元的時候
    public Product(int id, String name, double unitPrice,
              boolean free, int stock) {
        this(id, name);
        this.unitPrice = unitPrice;
        this.free = free;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    //回傳free是true(免費)還是false(不是免費)
    public boolean isFree() {
        return free;
    }

    //產品是否免費，設定free是true還是false
    public void setFree(boolean free) {
        this.free = free;
    }

    //進貨
    public void incStock(int amount) {
        stock = getStock() + amount;

    }

    //出貨 要判斷不能超額
    public void decStock(int amount) {
        if (amount <= stock) {
            stock = stock - amount;
        }

    }

    public int getStock() {
        return stock;
    }
    /*
     //getDetails(詳細資料)
     public String getDetails(){
     return "ID:        "+ getId()        + "\n" +
     "Name:      "+ getName()      + "\n" +
     "Unit Price:"+ getUnitPrice() + "\n" +
     //判斷isFree是不是免費，用三元運算子?:
     "Free:      "+ (isFree()? "YES" : "NO") + "\n" +
     "Strock:    "+ getStock();
     }
     */

    @Override
    public String toString() {
        return "ID:        " + getId() + "\n" + 
               "Name:      " + getName() + "\n" + 
               "Unit Price:" + getUnitPrice() + "\n" +
                //判斷isFree是不是免費，用三元運算子?:
               "Free:      " + (isFree() ? "YES" : "NO") + "\n" + 
               "Strock:    " + getStock();
    }
    //運算傳回代表這個物件的數字
    @Override
    public int hashCode(){
        return id;
    }

    //判斷產品全部資料
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null) {
            if (obj instanceof Product) {
                Product p = (Product) obj;

                if (id == p.id && name.equals(p.name) && unitPrice == p.unitPrice
                          && free == p.free && stock == p.stock) {
                    result = true;

                }

            }
        }
        return result;
    }
    //抽象方法，一種的排列方式
    // Comparable比大小,p物件來做誰大誰小，物件依照自已的需求來做比較
    @Override
    public int compareTo(Product p) {
        //自已跟參數比，1 自已比參數大
        //因為String的compareTo已經寫好了直接呼叫出來使用
        return name.compareTo(p.name);
        
        /*
        //產品單價排行
        if (getUnitPrice() > p.getUnitPrice()){
            return 1;
        }
        else if (getUnitPrice() < p.getUnitPrice()){
            return 2;
        }
        else {
            return 0;
        }
         */      
    
    }

}
