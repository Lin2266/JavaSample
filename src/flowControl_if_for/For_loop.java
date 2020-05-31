package flowControl_if_for;
//for-loop一般流程敘述
public class For_loop {
/*
 	for(initialization;boolean-expression;stepping){
 	}
 	1.initialization初始計數:初始化的動作
 	2.boolean-expression:運算布林條件式，掌握迴圈的進行
 	3.stepping步進敘述:當一個步驟(程式區塊)完成之後所要進行的動作，step運算通常指的是計數值的增加或減少
 	**這三個部分可以是空白，它們分別以分號(;)相隔且撰寫順序是固定的
 */
	public static void main(String[] args) {
		// 九九乘法表
		
		//步驟1:先初始化;步驟2:布林條件式;步驟3:布林條件式false就離開forloop，true時就執行forloop裡的程式區塊
		//步驟4:stepping步進敘述進行遞增或遞減，然後在從步驟1開始跑到不符合條件離開迴圈為止
		
		
		for(int i = 1; i<10;i++){
			for(int j = 1; j<10;j++){
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}

	}

}
