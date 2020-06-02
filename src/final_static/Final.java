
package final_static;


/*
2.final：相當於常數，用來修飾類別、方法、變數(屬性/區域變數)。
方法不可覆寫，類別不可被繼承
屬性/區域變數，使用前就必須給初值,屬性只能初始一次
*/
public final class Final {//類別
	final int val=0;//屬性
    
    public Final() {
        final int val;
        val = 1;
        System.out.println(val);
    }
    void amethod(final int val) {
        System.out.println(val);       
    }
    int amethod1(){//區域變數
        final int val;
        val = 2;
        System.out.println(val);
        return val;
    }
    
    public static void main(String[] args) {
        
        new Final().amethod1();
    }
    
}
//class Fina2 extends Final{
//	
//}