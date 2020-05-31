
package Java.util.regex1;

import java.util.regex.Pattern;


/*
split()字串切割器:
Pattern類別提供的split()方法(is a overirding)，可以指定分割字元來取得切割過後的String[]字串陣列。
方法名稱                                傳回值      說明
split(CharSequence input)               String[]    切割所給定的input資料,(CharSequence字串排序)
split(CharSequence input,int limit))    String[]    切割所給定的input資料，並限定切割後所回傳的String[]長度(lenght)
                                                    最大不得超過limit(限制)所限定的數值

String中的split()方法根本就是直接呼叫Pattern所實作的split()方法:
public String[] split(String regex){
    return split (regex, 0);
}
public String[] split(String regex, int limit){
    return Pattern.compile(regex).split (this, limit);
}

*/
public class Matcher_split1 {
    
    public static void main(String[] args) {
        Pattern ptn = Pattern.compile("[:/.]+");//[]中任一字元，.任意一個字元，+任意多個字元
        String[] tokens1, tokens2, tokens3, tokens4, tokens5;//tokens令牌
        tokens1 = ptn.split("http://vincentjava.idv.tw");//全部切割
        for(String token: tokens1){
            System.out.println(token);
        }
        //切割長度不得大於limit(限制)所限制的值，<=0會被忽略掉，超過和tokens1一樣全切割
        System.out.println("------------------------------");
        tokens2 = ptn.split("http://vincentjava.idv.tw", 2);//限定切割2個
        for(String token: tokens2){
            System.out.println(token);
        }
        System.out.println("-------------------------------");
        tokens3 = ptn.split("http://vincentjava.idv.tw",3);//限定切割3個
        for(String token:tokens3){
            System.out.println(token);
        }
        System.out.println("--------------------------------");
        tokens4 = ptn.split("http://vincentjava.idv.tw", 1);//切割1個，等於沒變
        for(String token: tokens4){
            System.out.println(token);
        }
        //第二個參數設定為0或負數時，執行出來的結果也會和tokens1相同，String[]的長度等於4，而每個維度的內容分別為:   http、vincent、java、idv、tw，因為在split()的原始碼中忽略limiT(split()第二個參數)<=0的設定。  
        System.out.println("----------------------------------");
        tokens5 = ptn.split("http://vincentjava.idv.tw", -1);
        for(String token: tokens5){
            System.out.println(token);
        }
    }
    
}
