package Extends;
 //this & super 關係，不能同時出現，因為他們宣告時都必須要放在第一行敘述，只能用在方法及建構子
public class Extends3 {

    public class Father {

        private Father(int lenght) {
        }

        protected Father(String s) {
            System.out.println("子類別帶來的字串:" + s);
            System.out.println("super");
        }
    }

    public class Son extends Father {

        //this()呼叫自已的字串建構子把參數帶進去,如下
        public Son() {
            this("Son");
//            super("Son");
        }
        //接收到無參數建構子this的字串參數
        public Son(String s) {
            //把參數引給父類的參數
            super(s);//super()呼叫父類別的建構子
        }
    }

    public static void main(String[] args) {
        //呼叫內外類別的方法1
        Extends3 c = new Extends3();
        Son b = c.new Son();
        //呼叫內外類別的方法2
        Extends3.Son c1 = new Extends3().new Son();
        
    }

}
