
package Java.lang.String1;

import java.util.StringTokenizer;
//字串標記生成器
public class StringTokenizer2 {

    public static void main(String[] args) {
        //    StringTokenizer 这个类其实真正项目里面恐怕很少会用吧？但是这个类真的很实用，
        //    因为它可以根据自己的方式按照一定的规则来拆分一个字符串

        String s = new String("The Java platform is the ideal platform for network computing"); 
        //默认的构造函数，会默认空格是分隔符
        StringTokenizer st = new StringTokenizer(s);
        //可以根据自己的规则来拆分字符串，目前的规则是以“e”当作分隔符(要用字串裡有的字當拆分字符)
        StringTokenizer st1 = new StringTokenizer(s,"e");
        //这里true的含义是将“a”也作为一个token(象徵)，而如果参数填入false的话则不将“a”作为token
        StringTokenizer st2 = new StringTokenizer(s,"a",true);
        
        while(st1.hasMoreElements()){
            System.out.println(st1.nextElement());
        }
        System.out.println("--------------------------------");
        System.out.println( "Token Total: " + st.countTokens() ); //計算幾個分割元素
        while(st.hasMoreElements()){
            System.out.println(st.nextElement());
        }
        System.out.println( "Token 切割完以的分割元素: " + st.countTokens() ); //計算幾個分割元素
        
    }
    
}
