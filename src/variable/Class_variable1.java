
package variable;

//類別變數 (靜態變數) : Class variable :
public class Class_variable1 {
    static int count = 0; //類別變數
    String name;
    int price;
    
    public Class_variable1(String name, int price){
        count++;
        this.name=name;//用this存取實體變數
        this.price=price;
    }
    
    void show(){
        System.out.println(this.count);//用物件實體存取類別變數
        System.out.println(Class_variable1.count);//用類別名稱存取類別變數
    }
    public static void main(String[] args) {
        Class_variable1 variable = new Class_variable1("Java", 129);
        variable.show();
        
    }
    
}
