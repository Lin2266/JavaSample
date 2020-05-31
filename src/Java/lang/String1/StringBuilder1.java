package Java.lang.String1;


/*
 StringBuilder(字串建造者)跟StringBuffer(字串緩衝區)一樣是mutable(易變)，不同的是，StringBuffer是thread-safe
 而StringBuilder是non-thread-safe，若不考慮多執行緒的問題可以使用StringBuilder來提升執行效率，雖然程式寫法與使用上
 兩者都是一樣的。
 StringBuilder跟StringBuffer都有提供capacity()(容量)方法來取得目前的容積空間，預設的容積長度可存放16個字元空間，
 超過16個字元會自動伸展到34，而超過34字元後則依照實際字元數量來給定存放空間
 */
public class StringBuilder1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("SCJP").append("7.0");
        System.out.println("sb = " + sb);
        System.out.println("lenght = " + sb.length());//取得字串長度

        String s = "Java";
        String s1 = "Cool";
        String s2 = (new StringBuilder()).append(s).append(s1).toString();
        System.out.println(s2);

    }

}
