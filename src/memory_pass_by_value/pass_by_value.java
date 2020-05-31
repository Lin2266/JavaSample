package memory_pass_by_value;

//變數指派
public class pass_by_value {

    public static void main(String[] args) {
        //b更改，a都不影響，new出來的就會有影響
        int a = 1;
        int b = a;
        System.out.println(a + "-" + b);//1-1
        
        char c1 = 'a';
        char c2 = c1;
        System.out.println(c1 + "-" + c2);//a-a
        c2='e';
        ++b;
        System.out.println(c1 + "-" + c2 + "  c2指派完後");//a-e
        
        String s1 = "一";
        String s2 = s1;
        System.out.println(s1 + "-" + s2);
        s2 = "三";
        System.out.println(s1 + "-" + s2 + "  s2指派完後");
      
        
    }
    
}
