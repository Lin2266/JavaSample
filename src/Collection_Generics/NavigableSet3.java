
package Collection_Generics;

import java.util.NavigableSet;
import java.util.TreeSet;

//加入自定元素
//若MyMoney物件要成為NavigableSet的元素內容，需在MyMoney類別中implements Comparable的宣告，並實作compareTo()方法

class MyMoney implements Comparable<MyMoney>{//可比
    private int money;

    public MyMoney(int money) {
        this.money = money;
    }
    
    @Override
    public int compareTo(MyMoney o) {
        return (money-o.money);
    }

    @Override
    public int hashCode() {    
        return money;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyMoney){
            MyMoney vo = (MyMoney)obj;
            return (this.money == vo.money);
        }
        return false;
    }

    @Override
    public String toString() {
//        return "MyMoney{" + "money=" + money + '}';
        return String.valueOf(money);
    }
    
    
    
}
public class NavigableSet3 {

    public static void main(String[] args) {
        //MyMoney物件要成為NavigableSet的元素內容
        NavigableSet<MyMoney> set = new TreeSet<>();
        set.add(new MyMoney(100));
        set.add(new MyMoney(200));
        set.add(new MyMoney(300));
        System.out.println(set);
    }
    
}
