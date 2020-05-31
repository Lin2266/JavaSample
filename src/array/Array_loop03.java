package array;


public class Array_loop03 {

    public static void main(String[] args) {
        //NO.37
        int[] array = {1, 2, 3, 4, 5};// 0.1.2.3.4
        //來源物件，來源索引，目的物件，目的索引，複製長度為幾
        System.arraycopy(array, 2, array, 1, 2);//2=3,4(長度2)複製到1=2,3 結果:13445
        System.out.print(array[1]);
        System.out.println(array[4]); 
        System.out.println("---------------");
        
       
//
//        //NO.77
//        int[] ages = new int[4];
//        //長度只到0.1.2.3，4超出索引範圍
//        ages[4] = 17;
//        for (int ag : ages) {
//            System.out.println(ag);
//        }

        //NO.79
//        int[] array = {1, 2, 3, 4, 5};
//        for (int i : array) {
//            if (i < 2) {
//                //System.out.println(i);i=1
//                continue;
//            }
//            System.out.println(i);
//            if (i == 3) {
//                continue;
//            }
//        }
        //不能回傳，索引超出範圍
//        System.out.println(args[1]);
//       return 0;
    }

}
