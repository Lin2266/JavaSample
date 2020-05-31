package Collection_Generics;

/*
 * 集合的走訪器:
 * 除了Map以外，所有的Collection都會產生Iterator，Enumeration與Iterator只能向下讀取走訪，
 * 若要往上讀取走後方就必須使用ListIterator介面，是繼承Iterator介面。
 * 若元素不存在系統將傳回UnsupportedOperationException例外
 * 
 * Iterator介面:
 * 方法名稱		傳回值		說明
 * hasNext()	boolean		判斷是否還有下一個Iterator元素，若有則傳回true，反之則傳回false
 * next()		Object		指向並回傳下一個Iterator元素
 * remove()		void		移除目前在Iterator中所指向的元素
 * 
 * ListIterator介面:
 * add(Object o)	void		加入一個指定的元素o到list集合中
 * hasNext()		boolean		判斷是否還有下一個list元素，若有傳回true，反之傳回false
 * hasPrevious()	boolean		判斷是否還有上一個list元素，若有傳回true，反之傳回false
 * next()			Object		指向並回傳下一個list元素
 * nextIndex		int			傳回下一個list元素的鍵值並指向該list元素
 * previous()		Object		指向並回傳上一個list元素
 * previousIndex()	int			傳回上一個list元素的鍵值並指向該list元素
 * remove()			void		移除目前在list中所指向的元素
 * set(Object o)	void		以所指定的元素o替換目前所指向的list元素(list元素內容替換)
 */
public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
