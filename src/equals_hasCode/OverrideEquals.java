
package equals_hasCode;

import java.util.HashMap;
import java.util.Objects;
//物件、陣列比較跟覆寫
public class OverrideEquals {
    String tradeMark;//商標
    String kind;//種類
    String color;//顏色

    public OverrideEquals(String t, String k, String c) {
        this.tradeMark = t;
        this.kind = k;
        this.color = c;
    }
    //自動覆寫
    @Override
    public int hashCode() {//字串型態的寫法
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.tradeMark);
        hash = 71 * hash + Objects.hashCode(this.kind);
        hash = 71 * hash + Objects.hashCode(this.color);
        return hash;
    }
    //自行定義
//      public int hashCode() {
    //HashCodeBuilder要另外下載
//          return new HashCodeBuilder(17,37).
//                  append(tradeMark).
//                  append(kind).
//                  apend(color).
//                  toHashCode();
//      }
//    //自動覆寫
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final OverrideEquals other = (OverrideEquals) obj;
//        if (!Objects.equals(this.tradeMark, other.tradeMark)) {
//            return false;
//        }
//        if (!Objects.equals(this.kind, other.kind)) {
//            return false;
//        }
//        if (!Objects.equals(this.color, other.color)) {
//            return false;
//        }
//        return true;
//    }
    //自行定義
   
       public boolean equals(Object obj){
           //判斷參考值一樣為true
           if(this == obj) return true;
           if(obj != null && getClass() == obj.getClass()) {
               
               if(obj instanceof OverrideEquals) {
                   OverrideEquals ball= (OverrideEquals)obj;
//                   System.out.println(obj.getClass() == ball.getClass());
                   //實體物件跟參數轉型後的物件相比
                   if(tradeMark.equals(ball.tradeMark) && 
                      kind.equals(ball.kind) && color.equals(ball.color)){
                       return true;
                    }
                }
            }
           return false;
       }
    public static void main(String[] args) {
        OverrideEquals b1 = new OverrideEquals("斯伯丁", "籃球", "紅");
        OverrideEquals b2 = new OverrideEquals("斯伯丁", "籃球", "紅");
        
        System.out.println(b1==b2);//==比對參考值為false
        //Object提供的equals是比較stack內容值(參考值)，要比較物件內容就要覆寫
        System.out.println(b1.equals(b2));//覆寫equals為true
      //覆寫hashCode()會把物件內容轉成uncode做比較，沒覆寫的是轉參考值
        System.out.println(b1.hashCode());//597247099
        System.out.println(b2.hashCode());//597247099
        
        System.out.println(b1.getClass()==b2.getClass());//比對兩個物件是不是同型別true
        
        //hashCode()沒覆寫abc會是null,abc為集合內容利用put()放到集合中,new...為鍵值
        HashMap h = new HashMap();
        h.put(new OverrideEquals("斯伯丁", "籃球", "紅"), "abc");
        HashMap h1 = new HashMap();
        h1.put(new OverrideEquals("斯伯丁", "籃球", "紅"), "abc");
        
        System.out.println("HashMap h.equals(h1)比較內容" + h.equals(h1));//true
        System.out.println("HashMap h==h1比較內容" + (h==h1));//false
        System.out.println("HashMap比較內容" + Objects.deepEquals(h, h1));//true
        //用相同鍵值取得集合內容
        System.out.println("HashMap 元素內容 = " + h.get(new OverrideEquals("斯伯丁", "籃球", "紅")));
        
        //Objects.deepEquals()陣列物件內容的比較
        OverrideEquals[] array1 = {
                            new OverrideEquals("A牌","籃球","紅"),
                            new OverrideEquals("B牌","棒球","白")};
        OverrideEquals[] array2 = {
                            new OverrideEquals("A牌","籃球","紅"),
                            new OverrideEquals("B牌","棒球","白")};
        
        System.out.println(Objects.equals(array1, array2) + "\t");//陣列equals為false
        System.out.println(Objects.deepEquals(array1, array2));//陣列deepEquals為true
       
    }
    
}
