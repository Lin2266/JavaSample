package flowControl_if_for;


public class Break1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++){
            System.out.println(i);
            if (i == 1) {//i等於1的時候break會中斷程式離開迴圈
                break;
            }
        }
    }
    
}
