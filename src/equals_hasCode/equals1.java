
package equals_hasCode;

import java.util.Objects;
//物件 equals 跟 == 比較
public class equals1 {

	//陣列也可以用equals跟==比較 ，但內容做比較就要看存的是什麼型態在做比較     
    public static void main(String[] args) {
        
        char[] j = {'a', 'b'};
        char[] i = {'a', 'b'};//內容為基本型態不能用equals
        System.out.println("陣列j.equals(i)比對為:" + j.equals(i));//false equals只能比對物件 	
        System.out.println("陣列j[0] == i[0]比對為:" + (j[0] == i[0]));//陣列內容是基本型態要用==比
        System.out.println("陣列Objects.deepEquals(j, i)比對為" + Objects.deepEquals(j, i));//陣列比較內容可以用deepEquals()
        System.out.println("陣列j == i比對為:" + (j == i));//false 比對stack的參考值
        i = j;//j指派給i時，i的參考值就跟j一樣
        System.out.println("i = j為:"+(j == i));//true
        System.out.println("i equals j為:"+(j.equals(i)));//true
        
        String [] aa = {"a","b"};//內容為物件型態才可以用equals比對
        String [] bb = {"a","b"};
        System.out.println("陣列aa.equals(bb)比對為:" + aa.equals(bb));//false 
        System.out.println("陣列aa[0].equals(bb[0])比對為:" + aa[0].equals(bb[0]));//true
        System.out.println("陣列aa==bb比對為:" +( aa==bb));//false 
        
        char c1 = 'a';
        char c2 = 'a';
        System.out.println("c1==c2:" + (c1==c2));//false
        
        
        String a ="大";
        String b ="大";
        String a1 = new String("大");
        String b1 = new String("大");
        
        //a = a1; 指派時，參考值就會一樣
        //比型態和內容物相不相同
        System.out.println("String跟new String的equals比對:"+ a.equals(a1));//true
        System.out.println("Stringa跟new Stringal的 == 比對:"+ (a == a1));//false
        System.out.println("new Stringa1跟new Stringbl的 == 比對:"+ (a1 == b1));//false
        System.out.println("Stringa跟Stringb == 比對:"+ (a == b));//true 
        
        
        int ii = 3;
        long ll =3;
        System.out.println("int跟long:" +(ii==ll));//true 比對內容不比型態
    }
    
}
