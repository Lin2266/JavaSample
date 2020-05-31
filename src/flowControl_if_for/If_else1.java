package flowControl_if_for;


public class If_else1 {
    
    public static void main(String[] args) {
    	//坐公車時依照年齡幾歲有多少折扣
        int age = 16;
        char gender = 'F';
        double salary = 30000;
        //0~4歲小孩跟61歲以上的老人
        if (age >= 0 && age <= 4 || age > 60) {
            System.out.println("$0");
        }
        else if (age >= 5 && age <= 17){
            System.out.println("$10");
        }
        else if (age >= 18 && age <= 60){
            System.out.println("$15");
        }
        
        else {
            System.out.println("error");//負的就顯示錯誤
        }
           // or 跟 and 判斷
        System.out.println(age < 3 || age >60 || gender == 'F');
        System.out.println(age >= 25 && age <= 30 && gender == 'F' && salary > 30000 );
       
     }
    
}
