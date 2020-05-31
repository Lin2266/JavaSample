
package Java.lang.String1;


//跟PrintfArray1類似
public class StringArray1 {

    public static void main(String[] args) {
        String[] names = {"Simon", "Mary", "Sam", "John"};
        int[] weights = {72, 56, 102, 99};
        String[] lines = new String[4];

        System.out.printf("%9s%11s%n", "Name", "Weight");
        System.out.printf("%10s%10s%n", "======", "======");

        for (int i = 0; i < names.length; i++) {
            lines[i] = String.format("%5s%-7s%5d%n"," ", names[i], weights[i]);
            System.out.print(lines[i]);
        }
        
//        for (String line : lines) {
//            System.out.print( line );
//        }
    }
    
}
