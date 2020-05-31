package memory_pass_by_value;
//Non-Static Method
public class InstanceMethod {
	int x =0;
	
	void setX(int value){
		x = value;
	}
	public static void main(String[] args) {
		InstanceMethod im1 = new InstanceMethod();
		InstanceMethod im2 = new InstanceMethod();
		 im1.setX(10);//java已經在setX(im1,10)加進參考值
		 im2.setX(20);
		 
		 System.out.println(im1.x);
		 System.out.println(im2.x);
	}

}
