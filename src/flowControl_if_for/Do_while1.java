package flowControl_if_for;


public class Do_while1 {

    public static void main(String[] args) {
         int i = 1;
        do{
            if(i%2==0)
                //2餘數為0時就一直跳離區塊，不會執行i++，變成無限迴圈
                continue;//continue是強制執行下一個do-while布林判斷
            if (i==5)
                break;
            //i餘數為1，不會經過前面兩個，直接印一次1，在i++為2
            System.out.print(i+"\t");
            i++;
        }while(true);//continue會指向這從這開始
    }
    
}
