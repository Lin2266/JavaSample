
package array;

public class Array_loop06 {

    public static void main(String[] args) {
        //字串length, 陣列lenght()
        String[] table = {"aa","bb","cc"};
        int ii = 0;
        for(String ss : table){
            while(ii < table.length){
                System.out.println(ii);
                ii++;
                break;
            }
        }
    }
    
}
