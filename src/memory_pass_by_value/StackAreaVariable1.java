package memory_pass_by_value;

public class StackAreaVariable1 {
	private int x = 10;
    private Integer y = null;
	public static void main(String[] args) {
		StackAreaVariable1 object = new StackAreaVariable1();
		//當x指派給y時，y變數會存在x存的heap的物件裡，然後在劃一個記憶體存放y的物件
        object.y = object.x;
        System.out.println("object.x:" + object.x);//10
        System.out.println("object.y:" + object.y);//10
        System.out.println("hashCode:x的" + System.identityHashCode(object.x));//366712642
        System.out.println("hashCode:y的" + System.identityHashCode(object.y));//366712642
        System.out.println(object.x == object.y);//true

        object.x = 20;

        System.out.println("object.x:" + object.x);//20
        System.out.println("object.y:" + object.y);//10
        System.out.println("hashCode:x的" + System.identityHashCode(object.x));//1829164700
        System.out.println("hashCode:y的" + System.identityHashCode(object.y));//366712642
        System.out.println(object.x == object.y);//false,x更改過後，記憶體位置就不一樣了
        
        
        object.y = 30;

        System.out.println("object.x:" + object.x);//20
        System.out.println("object.y:" + object.y);//30
        System.out.println("hashCode:x的" + System.identityHashCode(object.x));//1829164700
        System.out.println("hashCode:y的" + System.identityHashCode(object.y));//2018699554
        
        object.x = object.y;
        System.out.println("object.x:" + object.x);//30
        System.out.println("object.y:" + object.y);//30
        System.out.println("hashCode:x的" + System.identityHashCode(object.x));//2018699554
        System.out.println("hashCode:y的" + System.identityHashCode(object.y));//2018699554
        
        object.x = 10;//當x的值又重新給10時，會依之前10存的記憶體位置
        System.out.println("object.x:" + object.x);//10
        System.out.println("object.y:" + object.y);//30
        System.out.println("hashCode:x的" + System.identityHashCode(object.x));//366712642
        System.out.println("hashCode:y的" + System.identityHashCode(object.y));//2018699554
	}

}
