package Java.lang.String1;


import java.util.StringTokenizer;

//StringTokenizer(字串標記生成器)元素拆分
public class StringTokenizer1 {
   
    public static void main(String[] args) {
        String name = "John, George, paul, Ringo";
        StringTokenizer st = new StringTokenizer(name,",");
//        for( String str : st){
//            System.out.println(str);
//        }
//        例1:
        while(st.hasMoreElements()){
            System.out.println(st.nextElement());
        }
        
//        例2:
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
        
    }

 
}
