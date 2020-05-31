package constructor;


public class InstanceInitalizer {
    //實作區塊
    String id;
    int birthday;
    String name;
    
    public InstanceInitalizer() {
        id = "B123456789";//會把實作區塊覆蓋
    }
    public InstanceInitalizer(int birthday) {
    this.birthday=birthday;//這邊有指派，this.birthday的值才會改變，這邊是空的，值就不會改變
    this.id = "C123456789";
    }
    //會比建構子先執行，實作區塊，初始化
    {
        id = "A123456789";
        birthday = 20050101;
        name = "PcSchool";
    }
    //Info信息
    void getInfo(){
        System.out.println("id = " + id);
        System.out.println("birthday = " + birthday);
        System.out.println("name = " + name);
    }
    public static void main(String[] args) {
        new InstanceInitalizer().getInfo();
        new InstanceInitalizer(100).getInfo();
    }
    
}
