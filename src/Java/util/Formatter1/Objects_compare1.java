package Java.util.Formatter1;

import java.util.Comparator;
import java.util.Objects;

//Objects.compare()計算二個成績的分數差
public class Objects_compare1 {

    public class Score {

        private String subject;//科目
        private int score;//分數

        public Score(String subject, int score) {
            this.subject = subject;
            this.score = score;
        }

        public int getScore() {
            return score;
        }
    }

    public static void main(String[] args) {
        Objects_compare1.Score s1 = new Objects_compare1().new Score("國文", 100);
        Objects_compare1.Score s2 = new Objects_compare1().new Score("數學", 90);
        //diff差異
        //比較s1,s2物件
        int diff = Objects.compare(s1, s2, new Comparator<Score>() {
            //第三個參數實作Comparator的compare()方法
            public int compare(Score o1, Score o2) {
                return o1.getScore() - o2.getScore();//回傳給diff，s1跟s2的分數差
            }
        });
        System.out.println(diff);
    }

}
