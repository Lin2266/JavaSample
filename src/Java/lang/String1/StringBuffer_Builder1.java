
package Java.lang.String1;


/*
StringBuffer與StringBuilder中還提供了substring()、replace()、delete()三種方法。

substring()(子字串)是一種(超載)方法:
方法名稱                        回傳值          說明
substring(int start, int end)   String          根據start與(end-1)的位置範圍傳回一個子字串
substring(int start)            String          從start的位置開始傳回一個子字串

end參數的設定限制:
在end的設定上不可超過字串本身的最大維度值，否則會產生執行時期的例外錯誤
*/
public class StringBuffer_Builder1 {

    public static void main(String[] args) {
        //substring()會產生一個字串，若要取得該字串的內容值，必須宣告一個字串型別的變數來接收回傳值
        StringBuilder sb = new StringBuilder("123456789");//Index = 0=1.1=2.2=3.3=4.4=5.5=6.6=7.7=8.8=9
        String str = sb.substring(0,2);//傳回索引0~2(12)的字串，不包含index2
        System.out.println(str);
        
        //若改成以下的寫法，結果就會變的不一樣，sb指向的仍是原本的StringBuilder物件位置，
        //並不是substring()回傳所建立的新字串物件位置
        sb.substring(0,2);
        System.out.println(sb);
        
        
        
    }
    
}
