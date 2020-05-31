package Java.util.regex1;

import java.util.Scanner;

/**
 * 在String類別中，matches()方法可以讓您驗證字串是否符合指定的正規表示式，這通常用於驗證使用者輸入的字串資料是否正確，例如
 * 電話號碼格式；replaceAll()方法可以將符合正規表示式的子字串置換為指定的字串；split()方法可以讓您依指定的正規表示式，將符合的子
 * 字串分離出來，並以字串陣列傳回。
 */
public class String_matches1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "abcdefgabcabc";
        System.out.println(str.replaceAll(".bc", "###"));

        System.out.print("輸入手機號碼: ");
        str = scanner.next();

        // 手機簡單格式驗證:0988-100432
        if (str.matches("[0-9]{4}-[0-9]{6}")) {
            System.out.println("格式正確");
        } else {
            System.out.println("格式錯誤");
        }

        System.out.print("輸入href標籤: ");
        // Scanner的next()方法是以空白為區隔
        // 我們的輸入有空白，所以要執行兩次
        str = scanner.next() + " " + scanner.next();

        // 驗證href標籤:<a href="http://openhome.cc"> 
        if (str.matches("<a.+href*=*['\"]?.*?['\"]?.*?>")) {
            System.out.println("格式正確");
        } else {
            System.out.println("格式錯誤");
        }

        System.out.print("輸入電子郵件: ");
        str = scanner.next();

        // 驗證電子郵件格式 :justin@openhome.cc
        if (str.matches(
                "^[_a-z0-9-]+([.][_a-z0-9-]+)*@[a-z0-9-]+([.][a-z0-9-]+)*$")) {
            System.out.println("格式正確");
        } else {
            System.out.println("格式錯誤");
        }
    }

}
