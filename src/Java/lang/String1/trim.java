package Java.lang.String1;

/**
 * trim去空白
 *
 * trim()可以去除左邊及右邊二則空白，不過在字串間空白並不會處理
 */
public class trim {

    public static void main(String[] args) {
        String HasEmptyStr = " ABC";
        System.out.println("1空白去除:" + HasEmptyStr.trim());
        //1空白去除:ABC

        HasEmptyStr = "ABC ";
        System.out.println("2空白去除:" + HasEmptyStr.trim());
        //2空白去除:ABC
        HasEmptyStr = " ABC ";
        System.out.println("3空白去除:" + HasEmptyStr.trim());
        //3空白去除:ABC

        HasEmptyStr = "ABC DEF";
        System.out.println("4空白去除:" + HasEmptyStr.trim());
        //4空白去除:ABC DEF
    }

}
