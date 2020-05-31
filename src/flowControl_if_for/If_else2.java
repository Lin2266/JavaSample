package flowControl_if_for;

//判斷品質等級
public class If_else2 {

    public static void main(String[] args) {
    	 //品質愈高愈好 10:A 9:B 8~6:C 5~1:D
        int score = 7;
        
        if(score == 10){
            System.out.println("A");
        }
        else if (score == 9){
            System.out.println("B");
        }
        else if (score >= 6 && score <= 8){
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
        
    }
    
}
    

