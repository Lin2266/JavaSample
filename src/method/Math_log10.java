package method;

public class Math_log10 {

	public static void main(String[] args) {
		/*返回 以10為底的對數的 double 值。特殊情況：
    	如果參數為NaN或小於零，那麼結果為NaN。
    	如果參數為正無窮大，那麼結果為正無窮大。
    	如果參數為正零或負零，那麼結果是負無窮大。
    	如果參數等於10n整數n，那麼結果是n。*/
    	// get two double numbers
        double x = 60984.1;
        double y = 1000;//10的幂，10的3次方

        // get the base 10 logarithm for x
        System.out.println("Math.log10(" + x + ")=" + Math.log10(x));

        // get the base 10 logarithm for y
        System.out.println("Math.log10(" + y + ")=" + Math.log10(y));

	}

}
