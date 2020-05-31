package Java.lang.String1;

public class split4 {
    //同StringTokenizer5
    public static void main(String[] args) {
        String vData = "Hello World";

        // 去掉"o"，用o字元分割
        String[] vElement = vData.split(" ");

        for (int i = 0; i < vElement.length; i++) {
            System.out.println(vElement[i]);
        }

        // "0" 結果
//        Hell 
        //W
//        rld
        // " " 結果
        //Hello
        //world
    }

}
