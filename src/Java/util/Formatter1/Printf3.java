
package Java.util.Formatter1;


public class Printf3 {

    public static void main(String[] args) {
        String name = "Mary Johnson";
        String department = "去別佳";
        String item = "帽子";
        int price = 1000;
        double rate = 0.05;//5%
        //Math.round():是可將數字四捨五入的函數,將亂數產生的小數四捨五入成為整數
        int total = (int) Math.round(price * (1 + rate));//price * rate + price = 1050

         String template1 = "大家好! 我的名字是%s,%n" +
                "我今天到%s百貨公司採購, 買了一頂%s,%n" +
                "定價是%d元, 因為消費稅率是%f,也就是5%%,%n" +
                "所以我總共付了%d元";
        //這邊可以指定索引值1 → 1$ [name],索引值2 → 2$ [department] → ...
        String template2 = "大家好! 我的名字是%1$s,%n" +
                "我今天到%2$s百貨公司採購, 買了一頂%3$s,%n" +
                "定價是%4$d元, 因為消費稅率是%5$f,也就是5%%,%n" +
                "所以我總共付了%6$d元";

        System.out.printf(template2, name, department, item, price, rate, total);
    }
    
}
