
package Java.lang.String1;

/*
String中的split()方法根本就是直接呼叫Pattern所實作的split()方法:
public String[] split(String regex){
    return split (regex, 0);
}
public String[] split(String regex, int limit){
    return Pattern.compile(regex).split (this, limit);
}

方法名稱                        回傳值      說明
split(String regex)             String[]    根據比對樣式regex來切割字串
split(String regex, int limit)  String[]    根據比對樣式regex來切割字串，並限定切割後所回傳的String[]長度(lenght)最大
                                            不得超過limit(限定)所限定的數值

String中的split()的特性與使用技巧，只要把它想成是Pattern中的split()就可以了

*/
public class split1 {

    public static void main(String[] args) {
        String str ="http://vincentjava.idv.tw";
        String[] tokens = str.split("[:/.]+");//從:/.切割，成為字串切割的分隔符號
        for(String token: tokens){
            System.out.println(token);
        }
    }
    
}
