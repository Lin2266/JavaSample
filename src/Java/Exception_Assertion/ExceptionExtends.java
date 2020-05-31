
package Java.Exception_Assertion;
//例外繼承,自定例外的四個步驟:

//1. 產生自定例外類別
class MemberIDException extends Exception{
    public MemberIDException(String mid){
        super("會員證號" + mid +"驗證失敗！");
    }
    //接觸
    public void contactWith(){ //自定方法
        System.out.println("請連絡服務人員: " + "Tel(xx)-(xxxx-xxxx)!");
        
    }
 }


public class ExceptionExtends{
    //2.宣告方法時加入throws,throws例外關係要比throw大
    public static void checkMemberID(String mID) throws MemberIDException{
        //身份證檢查錯誤就拋出例外
        if(mID.length() !=5){//號碼長度必須=5
            //3.在方法中使用throw new 自定例外類別("錯誤訊息")以丟出例外
            throw new MemberIDException(mID);
        }
    }
    public static void main(String[] args) {
       boolean verify = true;//證實
        //4. 在try-catch區塊內呼叫該方法或再throws出去
       try {
            checkMemberID("1234567890");
        } catch (MemberIDException e) {
            System.out.println("錯誤訊息: " + e.getMessage());
            e.contactWith();//例外自定方法
            verify = false;
        }
       if(verify)
            System.out.println("會員證號驗證成功！");
       else
           System.out.println("會員證號驗證失敗！");
    }
    
}
