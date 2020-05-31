package flowControl_if_for;
//for-loop敘述與break與continue
public class For_loop1 {

	public static void main(String[] args) {
		// break會強制跳離迴圈，continue會強制直接執行下一個步進敘述
		for(int i=1;i<=10;i++){
			if(i==8){
				break;//直接離開迴圈
			}
			if(i%3==0){
				continue;//會從這直接到步進敘述，所以下面的程式區塊不會跑到
			}
			System.out.println(i+ "\t");
		}

	}

}
