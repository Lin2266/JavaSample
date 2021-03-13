
public class Common_factor {
//此函數需要兩個參數x,y
//當y不能整除x時,將x設成為y,y設為x%y, 重複此步驟直到x%y為0
//此時y就是這兩個數的最大公因數
 
    public static void main(String[] argv) {
        System.out.println(gcd(12,18));
    }
    public static int gcd(int x, int y) {
        int tmp;
        // 如果x < y 則下面的迴圈執行第一次時就會交換x,y了
       
        while (x % y != 0) {
            tmp = y;    //18=18
             System.out.println(tmp);
            y = x % y;  //0.6 = 12 % 18
            System.out.println(y);
            x = tmp;    //18=18
        }
        return y;
    }
    
    public void abc(int a) {
    	int b = a;
    	b = b*a;
    	System.out.println(a + "的平方為:" + b);
		
	}
}
