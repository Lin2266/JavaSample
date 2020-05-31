
package Java.lang.String1;


public class split6 {

    public static void main(String[] args) {
        String s = "林鳳營,1000,光泉,1200,味全,1000";
        String[] a = s.split(",");
        int total = Integer.parseInt(a[1])+Integer.parseInt(a[3])+Integer.parseInt(a[5]);
        String[] b={a[0],a[2],a[4]};
       
        for(String name: b){
           System.out.print(name + ",");
       }
        System.out.println("\n總共" + total);
       
    }
    
}
