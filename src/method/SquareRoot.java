package method;

public class SquareRoot {
    //平方根
    public void abc(int a) {
    	int b = a;
    	b = b*a;
    	System.out.println(a + "的平方為:" + b);
		
	}
	public static void main(String[] args) {

		SquareRoot squareRoot = new SquareRoot();
		squareRoot.abc(3);

	}

}
