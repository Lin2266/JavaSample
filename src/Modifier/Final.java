
package Modifier;


/*
2.final：相當於常數，用來修飾類別、方法、變數(屬性/區域變數)。
方法不可覆寫，類別不可被繼承
屬性/區域變數，使用前就必須給初值,屬性只能初始一次
*/
public final class Final {//類別
	final int val=0;//屬性
    
    public Final() {
        final int val;//建構子
        val = 1;
        System.out.print("呼叫建構子:" + val +",");
    }
    
    final void amethod1(int val) {//方法
        System.out.println("呼叫方法" + val);       
    }
    
    void amethod2(final int val) {//方法參數
        System.out.println("呼叫方法" + val);       
    }
    
    int amethod(){//區域變數
        final int val;
        val = 2;
        System.out.println("呼叫方法" + val);
        return val;
    }
    
    public static void main(String[] args) {
        
    	new Final().amethod1(5);
        new Final().amethod2(10);
        new Final().amethod();
    }
    
}
