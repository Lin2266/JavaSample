package equals_hasCode;

/*
 equals 二字串是否相等

 equals可以比較二個字串或物件是否相同，以為Object原型就有的方法，字串要全數相同回傳值才會為true
 */
public class equals2 {

    public static void main(String[] args) {
        String aStr = "String A";

        String bStr = "String B";
        boolean Equal = aStr.equals(bStr);
        System.out.println("a與b是否相同:" + Equal);
        //a與b是否相同:false

        String cStr = "String A";
        Equal = aStr.equals(cStr);
        System.out.println("a與c是否相同:" + Equal);
        //a與c是否相同:true

        String dStr = "String A ";//多一個空白就會變false
        Equal = aStr.equals(dStr);
        System.out.println("a與d是否相同:" + Equal);
        //a與d是否相同:false
    }

}
