package Java.util.regex1;

public class String_matches2 {

    public static void main(String[] args) {
        String s = "123456789";
        System.out.println(s.matches("[0-9]")); // false (只比對一位數 s="1"才會是true)
        System.out.println(s.matches("[0-9]+")); // ture (+至少出現1次以上的數字)
        System.out.println(s.matches("[0-9]*")); // ture (*0或多次)
        System.out.println(s.matches("[0-9]{9}")); // ture (剛好出現9個)
        System.out.println(s.matches("[0-9]{3,}")); // ture (3個以上)
        System.out.println(s.matches("[0-9]{3,8}")); // false (3-8個)

        String b = "123";
        System.out.println(b.matches("1[^123]3")); // false (^是不包含)
        System.out.println(b.matches("1[123]3")); // true
        System.out.println(b.matches("1([123])+3")); // true ()為群組
        
    }

}
