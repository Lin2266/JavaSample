
package constructor;
//this & super 關係
public class Constructor5 {
    static class Father{

        public Father(char c) {
            //這邊接到子類的參數('父')會打印出來
            System.out.println(c);
        }
        
    }
    static class Son extends Father{
        
        public Son() {
            //呼叫自已的建構子，有char的
            this('父');
//            super();//this跟super不能同時出現，因為他們宣告時都必須要放在第一行敘述
        }
        //無數參建構子this('父')呼叫這個有char的建構子，把參數('父')放到c中
        public Son(char c) {
           //利用呼叫super()把c參數的值('父')帶到父類的char c參數中
            super(c);
        }
        
    }
    public static void main(String[] args) {
        Son son = new Son();
    }
    
}
