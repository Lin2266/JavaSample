
package constructor;
//this & super 在屬性/方法上的應用
public class Constructor6 {
    static class Father{
        public int money = 8000000;
        //事業
        public void undertaking(){
            System.out.println("父親的事業:房地產");
        }
    }
    static class Son extends Father{
        public int money;
        Son(int money){
            setMoney(money);
        }
        public void setMoney(int money) {
            this.money = money;
            //參數跟屬性名稱不一樣時，屬性就可以不用加this
        }
        

        @Override
        public void undertaking() {
            System.out.println("兒子的事業:電腦網路");
        }
        public void go(){
            undertaking();
            System.out.println("市值: USD. " + money);
            System.out.println("--------------------------");
            super.undertaking();
           System.out.println("市值: USD. " + super.money);
        }
    }
    public static void main(String[] args){
        new Son(500000).go();
      

         
        
    }
    
}
