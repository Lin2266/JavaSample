package operator;

//算數運算子
public class Arithmatic1 {

    public static void main(String[] args) {
        int result = 30 - 12/(2*5) + 1; //30- 1(int沒小數點) + 1
        System.out.println("Result: " + result++);//30，打印完才會+1
    }
    
}
