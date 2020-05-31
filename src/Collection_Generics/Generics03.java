
package Collection_Generics;

import java.util.Vector;

//7.0新增Diamond(鑽石)，宣告時只需寫一個<>，型別檢查在編譯時期
//泛型、泛化、參數化型別中的型別參數與基底型別之關係
//<>泛型符號，E型別參數(可變動的參數)
public class Generics03 {

    public static void main(String[] args) {
        //Vector基底型別，<String>參數化型別中的型別參數
        Vector<String> v = new Vector<>();//泛化，Vector是一個支援泛型的類別
        //以Vector來說，支援多種的資料型別以完成目前的實體，就叫做泛型，過程為泛化
        /*
        合法宣告
        Vector v1 = new Vector<>();
        Vector<String> v2 = new Vector<>();
        Vector<Integer> v3 = new Vector<>();
        Vector<自定的型別> v4 = new Vector<>();
        */
    }
    
}
