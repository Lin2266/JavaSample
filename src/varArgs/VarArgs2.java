package varArgs;

public class VarArgs2 {
	void doSomething(String...strings) {
		for(String s: strings) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		VarArgs2 obj = new VarArgs2();
		obj.doSomething("1號","2號","3號");

	}

}
