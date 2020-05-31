
package Java.lang.String1;

/*
split字串切割

split(指定符號) ，可依指定符號把字串分開成陣列
 */
public class split5 {

    public static void main(String[] args) {
        String splitStr = "blog,yslifes,com";
        String[] array = splitStr.split(",");
        for(int i = 0 ; i < array.length ; i ++)
            System.out.println("第"+i+"個:"+array[i]);
        /*
        第0個:blog
        第1個:yslifes
        第2個:com
         */
    }
    
}
