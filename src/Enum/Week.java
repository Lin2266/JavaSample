
package Enum;
//列舉是一種類別(單獨存在時檔名要跟.java名稱相同)，也可以寫成內部類別(編譯時會自動加上static final)
//除了編譯器以外，都不可以繼承enum和繼承含有enum的子類別
public enum Week {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    //列舉的建構子是由編譯器自行產生與實作，存取權限是private
//    private Week(String s, int i){
//        super(s,i);
    
     public static void main(String[] args) {
//         System.out.println(Week.FRIDAY);
//         System.out.println(Week.valueOf("FRIDAY"));
//         System.out.println(Week.valueOf(Week.class,"FRIDAY"));
//         //result同上
//         Week week = Week.FRIDAY;
//         System.out.println(week.FRIDAY);
         //values方法取得內容
         Week[] week2 = Week.values();
         for(int i = 0; i<week2.length;i++){
             System.out.print(week2[i] + ",");
         }
         System.out.println("\n==========================================================");
         for(Week w : week2){
             System.out.print(w + ",");
         }
    }
}
