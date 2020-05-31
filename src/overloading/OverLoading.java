package overloading;
//超載/覆載
public class OverLoading {
/*
 超載/覆載是指同一種方法可以產生不同的實作，例如:啊叫同一個方法名稱method()可以依據傳入不同的參數來實作出相
 異的程式碼，超載又可分為方法的超載與建構子的超載。
 */
	
	void aMethod(){}//覆寫
	//int aMethod(){}//編譯錯誤，會造成方法重複定義
	int aMethod(int i){return i;}//正確，在參數列不同的情形下，回傳值也可以不同
	//參數列的順序也會影響所宣告的超載方法是否成立
	String bMethod(String s, int i){return s+i;}
	void bMethod(int i, String s){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
