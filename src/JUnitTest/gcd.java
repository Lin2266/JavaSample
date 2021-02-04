package JUnitTest;
import org.junit.jupiter.api.Test;

import method.Common_factor;
import method.SquareRoot;

class gcd {

	@Test
	void test() {
		Common_factor cF = new Common_factor();
		cF.gcd(12,18);
		
		SquareRoot squareRoot = new SquareRoot();
		squareRoot.abc(3);
	}

}
