package Java.lang.String1;

import java.util.Arrays;

//字串轉陣列，陣列轉字串
public class StringArray2 {

    /**
     * Array 轉換成字串
     *
     * @param String[]{'1','2','3'}
     * @return 字串['1','2','3']
     */
    public static String ArrayToString(String[] arr) {
        //直接呼叫function
        return Arrays.toString(arr);
    }

    /**
     * 字串轉換成Array
     *
     * @param 字串
     * @return 陣列
     */

    public static String[] StringToArray(String str) {
        //去頭尾[]
        String arrstring = str.replaceFirst("\\[", "").replaceFirst("\\]", "");
		//這裡split時可能會有空白產生，如果不想要可以利用for loop trim掉
        //或使用時加trim
        return arrstring.split(",");
    }

    public static void main(String[] args) {
        //陣列轉換成字串
        String[] arr = {"2", "3", "10"};
        String data = StringArray2.ArrayToString(arr);
        System.out.println("陣列轉字串:" + data);
        System.out.println("-------------------------------------------");

        //字串轉換成陣列
        System.out.println("字串轉陣列");
        String[] retarr = StringArray2.StringToArray(data);
        for (int i = 0; i < retarr.length; i++) {
            System.out.println("index" + i + ":" + retarr[i].trim());
        }
    }

}
