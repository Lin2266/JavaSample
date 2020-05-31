
package Java.lang.String1;

/*
replace()
方法名稱                                    回傳值          說明
replace(int start, int end, String str)     StringBuffer    將start與(end-1)的位置範圍以指定str字串代換
                                            StringBuilder

*/
public class StringBuffer_Builder2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123456789");
        sb = sb.replace(0, 3, "Java");//0~2的index位置換成Java，也可以寫成sb.replace(0, 3, "Java");
        System.out.println(sb);
        //這句放在這會以上面替換後的Java456789在替換一次，會變成Javaa456789
        sb.replace(0, 3, "Java");
        System.out.println(sb);
    }
    
}
