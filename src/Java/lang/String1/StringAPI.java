package Java.lang.String1;

public class StringAPI {

    public static void main(String[] args) {

        String url = "http://www.yahoo.www.com.tw";
        String ur2 = "HTTP://WWW.YAHOO.WWW.COM.TW";

        System.out.println(url.startsWith("http://"));//是否在字串最前面
        System.out.println(url.endsWith(".tw"));//是否在字串最後面
        System.out.println("-------------------------------------------------------------------");
        System.out.println("h的索引值:" + url.indexOf("h"));//h在第幾個位子,h字的索引值=0
        System.out.println("索引值4的內容:" + url.charAt(3));//把第4個字顯示出來,索引值3的值為p
        System.out.println("-------------------------------------------------------------------");
        System.out.println("http://www.yahoo.www.com.tw = substring(0 開始,到 7 以前):" + url.substring(0, 7));
        System.out.println("http://www.yahoo.www.com.tw = substring(7 開始到字串結束):" + url.substring(7));
        System.out.println("length傳回字串\"http://www.yahoo.www.com.tw\"的長度:" + url.length());
        System.out.println("-------------------------------------------------------------------");
       
        //其中replaceAll函數可以使用正規表示式來做整批有規則性的取代
        System.out.println("replaceAll:參數1有關的字串 www 全被參數2的 xxx 所取代:" + url.replaceAll("www", "xxx"));
        System.out.println("replaceFirst:參數1第一個 www 字串被參數2的 xxx 所取代:" + url.replaceFirst("www", "xxx"));
        System.out.println("http://www.yahoo.www.com.tw = replace('old-w','new-m'):" + url.replace('w', 'm'));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("toUpperCase轉大寫:" + url.toUpperCase());
        System.out.println("toLowerCase轉小寫:" + url.toLowerCase());
        System.out.println("-------------------------------------------------------------------");
        System.out.println(url.equals(ur2));//判斷兩個值相等不含大小寫
        System.out.println(url.equalsIgnoreCase(ur2));//判斷兩個值相等含大小寫
        System.out.println("-------------------------------------------------------------------");
        System.out.println("http有包成含在url嗎？"+url.contains("http"));
        String s3 = "this is book";
        String sa[] = s3.split(" ");//要切割的符號，空白
        for (String s : sa) {
            System.out.println("1.字串用split分裂成:" + s);
        }
        System.out.println("-------------------------------------------------------------------");
        String s4 = "this is book";
        String sb[] = s4.split(" ", 2);//參數二，切割成2份
        for (String s : sb) {
            System.out.println("2.字串用split分裂成:" + s);
        }
        System.out.println("-------------------------------------------------------------------");
        String s5 = "this_is.a-book";
        String sc[] = s5.split("-|\\.|_");//多種符號要用 | , 特殊字元要加\\,寫沒有順序問題，代表切割的符號而已
        for (String s : sc) {
            System.out.println("3.字串用split分裂成:" + s);
        }
        System.out.println("-------------------------------------------------------------------");
        String s6 = "004-034556";
        String sd[] = s6.split("(?<=-)");//?<= 代表符號連在左邊字串後面004-
        for (String s : sd) {
            System.out.println("4.字串用split分裂成:" + s);
        }
        System.out.println("-------------------------------------------------------------------");
        String s7 = "004-034556";
        String se[] = s7.split("(?=-)");//?= 代表符號連在右邊字串前面-034556
        for (String s : se) {
            System.out.println("5.字串用split分裂成:" + s);
        }

    }

}
