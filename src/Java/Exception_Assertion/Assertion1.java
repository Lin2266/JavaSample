package Java.Exception_Assertion;

//Assertion斷言/維護，使用的時機
//用來lab(實驗)環境中找程式的bug，邏輯上的錯誤 如:薪資或成績是負的，或獎金配發比率錯誤
//應放在程式執行不到的地方，必須在非public方法使用，如要放public方法也要放在執行不到的地方
//一、 assert的兩種語法：
//1.assert Expression1;
//Expression1 必須是個 boolean Expression，可以是會傳回boolean的方法，不可是一個void方法
//當 Expression1 為 false 時，會丟出個 AssertionError
//
//2.assert Expression1 : Expression2;
//Expression1 是 boolean Expression
//Expression2 則是一個值
//當 Expression1 為 false 時，會把 Expression2 的值傳給 AssertionError 的建構子

public class Assertion1 {
    private int score;
    //得分    
    private void printScore(){
        //強迫應用程式停止，(Expression1為false時)會把右邊的錯誤訊息丟出來
        assert (score >= 0) : "成績錯誤！score=" + score;
        //因為分數為負的是邏輯判斷不周，assert把程式停止，要依錯誤發生的位置與原因重新調校程式 如下:
        //判斷分數小於0跟大於100
//        if(score < 0 || score >100){
//            System.out.println("成績錯誤！score = " + score);
//            return;
//        }
          if(score >= 60){
              System.out.println(score + "是及格的分數！");
          }
          else{
              System.out.println(score + "不是不及格的分數！ ");
          }
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public static void main(String[] args) {
        Assertion1 score = new Assertion1();
        //分數在專案邏輯中不可以是負的
        score.setScore(-10);
        score.printScore();
        //判斷Assertion有沒有打開，有開時false會丟出錯誤訊息
        boolean enableAssertion = false;
        assert(enableAssertion=true): "？？";
        if(enableAssertion)
            System.out.println("Assertion 已經打開");
        else
            System.out.println("Assertion 尚未打開");
    }
}
