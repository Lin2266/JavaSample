
package operator;
//運算子+的前後差別
public class StringPlus {
//同種符號(+)擁有二種不 同運算方式，就是覆載
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "SCJP";
        int i = 1;
        int j = 2;
        System.out.println("數字相加" + i+j);
        System.out.println("字串相加" + s1+s2);
        //先數學運算還字串連結，依由左至右運算
        System.out.println("數字在前字串在後" + i+j+s1);//3Java，數學運算完在加字串
        System.out.println("字串在前數字在後" + s2+i+j);//SCJP12，字串在前，後面的數字就會轉成字串加在後面
        
       
    }
    
}
