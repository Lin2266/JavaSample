
package Class;
//匿名類別

interface Pet{
    String attr = "cute";
    void skill();
    void move();
}
public class AnonymousClass {
    
    public static void main(String[] args) {
        Pet p = new Pet()
        //用匿名類別實作interface，簡化程式撰寫方式，反組譯時會自動加上implements
        {   //技能
            public void skill(){
                System.out.println("我會握手!");
            }
            
            public void move() {
                System.out.println("我會跑步!");
            }
            //sound聲音
            public void sound(){
                System.out.println("汪汪叫!");
            }
            
        };//記得加分號
        p.skill();
        p.move();
        //匿名類別自已的實作方法，不能強制轉型，要用多型最好再定義一個類別
        //((AnonymousClass)p).sound();匿名類別中不要採取這種做法，已不可使用
    }
    
}
