package constructor;
 //如何用到Word的建構子

public class Constructor3 {

    public class Word {

        private Word(int lenght) {
        }

        protected Word(String w) {
            System.out.println("子類別帶來的字串:" + w);
            System.out.println("super");
        }
    }

    public class Buzzword extends Word {

        //this()呼叫自已的字串建構子把參數帶進去
        public Buzzword() {
            this("Buzzword");
//            super("Buzzword");
        }
        //接收到無參數建構子this的參數
        public Buzzword(String s) {
            //把參數引給父類的參數
            super(s);
        }
    }

    public static void main(String[] args) {
        //呼叫內外類別的方法1
        Constructor3 c = new Constructor3();
        Buzzword b = c.new Buzzword();
        //呼叫內外類別的方法2
        Constructor3.Buzzword c1 = new Constructor3().new Buzzword();
        System.out.println(b);
    }

}
