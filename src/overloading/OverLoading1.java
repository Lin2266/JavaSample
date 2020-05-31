package overloading;

//繼承關係的超載
public class OverLoading1 {
	 //動物
    static class Animal{
        public void move(){
            System.out.println("動...");
        }
    }
    //貓
    static class Cat extends Animal{
        @Override
        public void move() {
            System.out.println("跳..."); 
        }
    }    
        //鳥
    static class Bird extends Animal{

            @Override
            public void move() {
                System.out.println("飛...");
            }   
        }
        //老虎
    static class Tiger extends Cat{

            @Override
            public void move() {
                System.out.println("跑..."); 
            }   
        }
    public static void main(String[] args) {
    	//方法中不能在寫方法
       
}
    
    //子類別也可超載父類別的方法
    //Animal當作方法參數就可以傳入Animal或子類別實體作為參數引入，其它子類別超載就可以不必寫
    public static void getMove(Animal animal){
        animal.move();
    }
    
    public static void getMove(Cat cat){
        cat.move();
    }    
    public static void getMove(Bird bird){
        bird.move();
    }
    public static void getMove(Tiger tiger){
        tiger.move();
    }    
}

	
