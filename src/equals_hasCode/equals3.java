package equals_hasCode;

/*
 對於使用Integer.valueOf()或literal(文字)所產生的Integer內容值，只要介於-128 ~ +127
 (byte資料範圍)都會加以重複使用，
 不過對於直接使用new Integer()所產生的Integer內容值則無效。
 因為不論數值是多少，這種方式一定會單獨產生對應的實體
 Integer跟String的equals都有被改寫，所以他們都直接比較到物件實體內容，其它的類別型態就必須要另外做覆寫才有辦法比較實體
 */
public class equals3 {

    public static void main(String[] args) {
        //範例一new出來的都是獨立的，參考不一樣的參考值，跟Integer.valueOf()不一樣
        Integer a1 = new Integer(130);
        Integer b1 = new Integer(130);
        System.out.println("超出-128 ~ +127範圍:a1==b1: " + (a1 == b1));//false
        System.out.println("a1.equals(b1): " + a1.equals(b1));//true
       
        Integer c1 = new Integer(127);
        Integer d1 = new Integer(127);
        System.out.println("-128 ~ +127範圍內:c1==d1: " + (c1 == d1));//false
        System.out.println("c1.equals(d1): " + c1.equals(d1));//true
        System.out.println("------------------------------------");
        
        //範例二:用valueOf(127)包含以下，會在記憶體heap中使用相同的物件實體
        //(a2、b2、a3、b3在statck的內容都一樣，都是參照同一個記憶體位置)
        Integer a2 = Integer.valueOf(127);
        Integer b2 = Integer.valueOf(127);
        Integer a3 = 127;
        Integer b3 = 127;
        System.out.println("a2==b2: " + (a2 == b2));//true
        System.out.println("a2.equals(b2): " + a2.equals(b2));//true
        System.out.println("a3==b3: " + (a3 == b3));//true
        System.out.println("a3.equals(b3): " + a3.equals(b3));//true
        System.out.println("--------------------------");
        
        //範例三:a2、a3是指向相同的記憶體位置
        System.out.println("a2==a3: " + (a2 == a3));//true
        System.out.println("a2.equals(a3): " + a2.equals(a3));//true
        System.out.println("---------------------------");
        
        //範例四:a4、b4、a5、b5的內容值都大於127，所以在記憶體heap中會個別產生不同的物件實體，利用==比較時會回傳false
        Integer a4 = Integer.valueOf(200);
        Integer b4 = Integer.valueOf(200);
        Integer a5 = 200;
        Integer b5 = 200;
        System.out.println("a4==b4: " + (a4 == b4));//false
        System.out.println("a4.equals(b4): " + a4.equals(b4));//true
        System.out.println("a5==b5: " + (a5 == b5));//false
        System.out.println("a5.equals(b5): " + a5.equals(b5));//true
    }

}
