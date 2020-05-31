
package primitiveType;

/*
Autoboxing/Unboxing在方法覆載上的問題，有3種尋找適當的對應方法
1.允許使用向上轉型(int會找long、float或double)，而不先使用Autoboxing/Unboxing的方法找出適當的方法。
2.用第一個條件找不到時，將自動啟用Autoboxing/Unboxing的機制來找出適當的方法
3.當第一、二個條件都找不到時，會找varags自動變長參數的方法
外包類別只能找跟自已同型，不能向上找，只能從第2條開始
*/
public class AutoBoxOverload1 {
    
    static void foo(double x){
        System.out.println("double x = " + x);
    }
//    static void foo(Double x){
//        System.out.println("Double x = " + x);
//    }
    static void foo(Integer x){
        System.out.println("Integer x = " + x);
    }
    static void foo1(Double x){
        System.out.println("Double x = " + x);
    }
    
    //3
    static void foo3(int... x){
        System.out.println("int varags x = " + x);
    }
    static void foo3(Double x){
        System.out.println("Double x = " + x);
    }
    public static void main(String[] args) {
       //當有int跟Integer方法都存在時，各自會呼叫符合自已條件的方法
       //有double跟Double方法時，兩個都會是double
       Integer i = 100;//Double i = 100d;
       int j = 200;
       foo(i);//只有foo(int x)時，透過Unboxing可以呼叫foo(int x)，符合第二種
       foo(j);//符合第一種
       //編譯錯誤，就foo1(Double x)而言，x不能被置入Integer物件(can not be applied to Integer)，也不能被置入int變數
       //(can not be applied to int)，這與Autoboxing/Unboxing無關，完全是語法上的限制，條件1~3都不符合
//       foo1(i);
//       foo1(j);
       
       //第3種:加入foo(int...x)varags參數自動增長方法，1、2條件找不到時，就會找varags自動變長參數的方法
       Integer i3 = 100;
       int j3 = 200;
       foo3(i);
       foo3(j);
       
    }
    
}
