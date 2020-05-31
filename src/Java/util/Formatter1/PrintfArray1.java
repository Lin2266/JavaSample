
package Java.util.Formatter1;


//跟StringArray1類似
public class PrintfArray1 {

    public static void main(String[] args) {
       String[] names = {"Simon", "Mary", "Sam", "John"};
        int[] weights = {72, 56, 102, 99};

        System.out.printf("%10s%10s%n", "Name", "Weight");//字預設靠右，10為字的間距，左邊空的補空格
        System.out.printf("%10s%10s%n", "======", "======");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%10s%10d%n", names[i], weights[i]);
            //System.out.println(names[i] + weights[i]);這樣也可以，但不能調整間距
        }
        System.out.println("--------------------------------------------");
        System.out.printf("%-10s%-10s%n", "Name", "Weight");//-號字靠左，10為字的間距，右邊空的補空格
        System.out.printf("%-10s%-10s%n", "======", "======");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s%-10d%n", names[i], weights[i]);
            //System.out.println(names[i] + weights[i]);這樣也可以，但不能調整間距
        }
    }
    
}
