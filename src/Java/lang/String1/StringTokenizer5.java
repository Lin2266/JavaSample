package Java.lang.String1;

public class StringTokenizer5 {

    //同splitl1
    public static void main(String[] args) {
        String vData = "Hello World";

        // 用o當字元分割
        java.util.StringTokenizer vElement = new java.util.StringTokenizer(vData, "o");

        while (vElement.hasMoreTokens()) {
            System.out.println(vElement.nextToken() + "");

        }
        // 結果
        //Hell W
        //rld

    }

}
