
package array;

public class Array_loop05 {

    public static void main(String[] args) {
//        String[][] exams = {{"SCJP","SCWCD","SCMAD"},{"MCSD","MCAD","MCDBA"}};
//        //二維要用巢狀迴圈, 長度為2
//        for(String[] ex : exams) {
//            for(String e : ex)
//            System.out.print(e + ",");
//        }
         String[][] exams = {{"SCJP","SCWCD","SCMAD"},{"MCSD","MCAD","MCDBA"}};
         A:
        for(String[] ex : exams) {
            B:
            for(String e : ex)  {
            System.out.print(e + ",");
            continue A;
            }
         break;
        }
    }
    
    
}
