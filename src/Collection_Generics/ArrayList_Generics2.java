package Collection_Generics;



import java.util.ArrayList;
import java.util.List;


public class ArrayList_Generics2 {
    class Alpha{
        public String doStuff(String msg){
            return msg;
        }
    }
    class Beta extends Alpha{
        public String doStuff(String msg){
            return msg.replace('e', 'o');//把a改成e
        }
    }
    class Gamma extends Alpha{
        public String doStuff(String msg){
            //substring從字串指定索引值開始到字串結束
            return msg.substring(2);//he    llo
        }
    }
    public static void main(String[] args) {
        List<Alpha> strs = new ArrayList<Alpha>();
        //巢狀類別new物件的方法
        ArrayList_Generics2 a = new ArrayList_Generics2();
        strs.add(a.new Alpha());
        strs.add(a.new Beta());
        strs.add(a.new Gamma());
        for(Alpha t: strs) {
            System.out.println(t.doStuff("hello"));
        }
    }
    
}
