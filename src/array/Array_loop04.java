package array;
public class Array_loop04 {
//陣列不能是null，執行時期會錯誤
    public static void main(String[] args) {
        int[] i = null;
        for (int ii: i){
            System.out.println(ii);
        }
    }
    
}
