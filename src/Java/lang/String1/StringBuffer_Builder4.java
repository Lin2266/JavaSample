package Java.lang.String1;

//字串需一直變動使用String每變動一次都會產生新的物件，會浪費記憶體，這時就要用StringBuffer與StringBuiler，StringBuiler不能使用在多執行序。
public class StringBuffer_Builder4 {

    public static void main(String[] args) {
        StringBuffer b = new StringBuffer("12345"); // 創立文字
        b.append("6789"); // 加入文字
        System.out.println(b);
        b.delete(2, 4); // 刪除文字 (開始,結束)
        System.out.println(b);
        b.insert(2, "34"); // 增加文字 (開始,插入值)
        System.out.println(b);
        b.replace(1, 4, "二三四"); // 取代(開始,結束,值) 只會取代開始與結束中間的值
        System.out.println(b);
        b.reverse(); // 顛倒
        System.out.println(b);
        b.reverse(); // 顛倒

        String a = new String(b);
        String c = a.replaceAll("二三四", "234"); // 正規法取代
        System.out.println(c);
    }

}
