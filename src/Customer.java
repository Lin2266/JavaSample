

// 15-8 Collection容器 hashCode
import java.util.Date;
//客戶 
public class Customer {

    private String id;//身份證
    private String name;
    private String address;//地址
    private Date birthDate;
    private char gender;//性別
    private boolean married;//是否已婚
    private String email;
    
    public Customer(){
        //java幫沒有參數的建構子自動加super();的時候，父類別是Object
    }
    public Customer(String id, String name, String address, Date birthDate,
                    char gender, boolean married, String email) {
        this(id, name, address);
        this.birthDate = birthDate;
        this.gender = gender;
        this.married = married;
        this.email = email;

    }

    public Customer(String id, String name) {
        
        this.id = id;
        this.name = name;
    }

    public Customer(String id, String name, String address) {
        this(id, name);
        this.address = address;
    }
    /*
     //重載(多個)建構子，以需求去建立
     public Customer(String id, String name, 
     String address, boolean married  ){
     //其它建構子有寫過的就沒必要在寫了，用this();呼叫有的資料
     this.id = id;
     this.name = name;
     this.address = address;
     /*
     //this();建構子專用，必須在第一行，呼叫類別中其它建構子
     //this();呼叫這個class其它建構子裡有的參數，沒有參數時會出錯
     this(id,name,address);
     this.married = married;
     }
     */
    /*
     //不想填已婚
     public Customer(String id, String name, 
     String address){
     //設定參數指定給物件
     this(id,name);
     this.address = address;
     }
     public Customer(String id, String name){
     this.id = id;
     this.name = name;
     }
     */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (checkId(id)) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
    //取得客戶的詳細資料
    /*   改成toString  
    public String getDetails() {
        //不用show的情況下回傳 資料
        return "Id:     " + getId() + "\n" + 
               "Name:   " + getName() + "\n" + 
               "Address:" + getAddress() + "\n" +
               "Married:" + isMarried();
    }
    */
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //檢查身份證字數,並回傳true或false
    public static boolean checkId(String id) {
        return (id != null && id.length() == 10);
         
    }
    
    @Override
    public int hashCode(){
        //因為id是String, 所以要用hashCode先運算
        return id.hashCode();
    }
    
    @Override
    public String toString(){
        return "Id:     " + getId() + "\n" + 
               "Name:   " + getName() + "\n" + 
               "Address:" + getAddress() + "\n" +
               "Gender: " + getGender() + "\n" +
               "Married:" + isMarried() + "\n" +
               "Email:  " + getEmail();
       
    }
    //09-20 例-09-24
    @Override
    public boolean equals(Object obj){
       //判斷結果
        boolean result = false;
       //1.先排除null值(參數)
       if(obj != null){
           //2.判斷參數物件種類
          if (obj instanceof Customer){
              //判斷完在轉型
              Customer c = (Customer) obj;
              //判斷兩個物件是否一樣，沒有固定的寫法
              //3.判斷資料，兩個物件是否一樣 
              //if (getId().equals(c.getId() ) ){
              //在自已類別裡面可以直接id就好
              if(id.equals(c.id) && email.equals(c.email)){
                  result = true;
              }
              
          } 
       }
       return result; 
    }
    

}
