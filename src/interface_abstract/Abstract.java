package interface_abstract;
//抽象類別
/*
抽象類別是為了讓方法的實作由子類別來覆寫實作，如子類別沒有全部實作則必須宣告成抽象類別

抽象類別可以有建構子，抽象類別內還是可以撰寫實体的屬性以及實体的方法，
那這些實体的類別還有實体的方法，到底什麼時後才可以被new出一個抽象類別的實体呢??
任何一個子類別 extends 了這個抽象類別，當你把子類別new起來的時後，
子類別的建構子會先去 call 父類別的建構子把父類別的實体建立起來，當然這個實体是包含在子類別的實体內，
因此對於抽象類別 雖然你不可以直接 new他 ，但是你可以透過子類別的建構子new出父抽象類別的實体
*/
public abstract class Abstract {
	//抽象可以有一般屬性，不會有抽象屬性
	private int id;
	private String name;
	
	//抽象可以有建構子，不會有抽象建構子
	public Abstract(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//抽象方法不可以是private
	public abstract void a();
	
	//抽象類別也可以宣告一般方法
	public void ab(){
		
	}
	
	public static void main(String[] args) {
		

	}

}
