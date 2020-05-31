
package primitiveType;

/*
Autoboxing/Unboxing(自動裝箱/拆箱)5.0開始可以針對一些primitive type Wrapper class(基本資料型態外包類別)做更直覺的編撰，
不過還是用物件所提供的方法來實作，目的是讓設計師寫起程式來更直覺，並提升程式的可讀性
*/
public class Autoboxing_Unboxing1 {

    public static void main(String[] args) {
        //5.0以前的外包類別寫法
        Integer numerous = new Integer(100);
        //或
        Integer numerous1 = Integer.valueOf(100);//利用valueOf()裝箱
        //隨後將numerous的內容值取出來，放到一個int變數x上
        int x1 = numerous1.intValue();//利用intValue()拆箱
        
        //5.0以後的外包類別寫法
        Integer numerous2 = 100;//boxing裝箱(將int轉成Integer)
        int x2 = numerous2;//unboxing拆箱(將Integer轉成int)
        //Autoboxing/Unboxing機制還允許Integer與int(外包類別與基本資料型別)直接做相加的動作
        System.out.println(numerous + x2);
        
        //透過JAD反組譯時，編譯器會自動還原成標準寫法，外包類別就是簡化程式碼的撰寫
        Integer numerous3 = Integer.valueOf(100);
        int x3 = numerous3.intValue();
        System.out.println(numerous3.intValue() + x3);
    }
    
}
