package overriding;

public class Overriding1 {
	static class Zoo1 {
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
