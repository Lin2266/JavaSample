package Enum;

public enum EnumSample {
//()裡的型態可多個
    A(200, "非常好",'a'), B(150, "很好",'b'), C(100, "好",'c'), D(50, "普通",'d');

    int num;
    String good;
    char c;

    private EnumSample(int num, String good,char c) {
        this.num = num;
        this.good = good;
        this.c=c;
    }

    public int getNum() {
        return num;
    }

    public String getGood() {
        return good;
    }

    public char getC() {
        return c;
    }

    @Override
    public String toString() {
        return this.name();
    }

    public static void main(String[] args) {
        EnumSample[] es = EnumSample.values();

//        System.out.println(EnumSample.A);
//        System.out.println(EnumSample.valueOf("A"));
//        System.out.println(EnumSample.valueOf(EnumSample.class, "A"));
        for (EnumSample ee : es) {
//            System.out.println(ee.name()+"\t"+ee.getNum()+"\t"+ee.getGood());

            switch (ee) {
                case A:
                    System.out.println(ee.A + "\t" + ee.getNum() + "\t" + ee.getGood()+ "\t"+ee.getC());
                    break;
                case B:
                    System.out.println(ee.B + "\t" + ee.getNum() + "\t" + ee.getGood()+ "\t"+ee.getC());
                    break;
                case C:
                    System.out.println(ee.C + "\t" + ee.getNum() + "\t" + ee.getGood()+ "\t"+ee.getC());
                    break;
                case D:
                    System.out.println(ee.D + "\t" + ee.getNum() + "\t" + ee.getGood()+ "\t"+ee.getC());
                    break;
            }
        }
    }
}
