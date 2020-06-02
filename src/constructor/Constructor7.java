package constructor;

public class Constructor7 {

   static class Pet {

        Pet(int age) {
            System.out.println("Pet(" + age + ")");
        }
    }

    static class Person {

        Pet t1 = new Pet(1);//1

        Person() {//4
            System.out.println("---Person()---");
            t3 = new Pet(33);
        }
        Pet t2 = new Pet(2);//2

        void show() {//5
            System.out.println("show----running");
        }
        Pet t3 = new Pet(3);//3
    }

    public static void main(String[] args) {
        new Person().show();

    }
}
