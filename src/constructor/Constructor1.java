
package constructor;

public class Constructor1 {
    //建構子不能有void，但建構子就像是一種回傳值的方法，也可以加上"return;"
    Constructor1 (){
        System.out.println("執行 Constructor() 建構子");
    }
    
    public Constructor1(String s) {
        System.out.println("Java" + s);
        
    }

    public static void main(String[] args) {
        Constructor1 c = new Constructor1(){//暱名類別，建構子後面加上{}
            public void ABC(){//直接在建構子寫方法或類別，但必須加上{}
                System.out.println("xxx");
            }     
        };
        new Constructor1(){//暱名類別
            int a = 1;
        };
        Constructor1 c1 = new Constructor1("7");
        
    }
    
}
