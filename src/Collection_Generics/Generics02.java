
package Collection_Generics;

import java.util.Vector;



public class Generics02 {

    public static void main(String[] args) {
        //向量，Vector泛化成String的資料型別，v所指向的是一個被String泛化的Vector集合
        Vector<String> v = new Vector<String>();//泛化
//        Vector v = new Vector();元素不限定，但要做轉型
        //String資料才能成為Vector的元素
        v.add("Java");
        v.add("Tiger");
        v.add("SCJP");
//        v.add(new Integer(100));編譯錯誤
        //因為泛型的限制型別(String)，不需使用Object(多型)，可避免轉型的困擾跟風險
        for(String obj:v){
            String data = obj;//不用轉型
            System.out.print(data + " ,");
        }
        System.out.println();
    }
    
}
