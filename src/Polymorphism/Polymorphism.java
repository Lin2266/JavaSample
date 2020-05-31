package Polymorphism;
//instanceof運算子，判斷物件是否可轉型

public class Polymorphism {

    //動物

    class Animal {

        public void move() {
            System.out.println("移動...");
        }
    }

    //貓

    class Cat extends Animal {

        @Override
        public void move() {
            System.out.println("跑跑跳跳...");
        }

        //技能

        public void skill() {
            System.out.println("洗澡...");
        }
    }

    //老虎
    class Tiger extends Cat {

        @Override
        public void skill() {
            System.out.println("狩獵...");
        }

//        public void move() {
//            System.out.println("老虎跳");
//        }
    }

    //鳥

    class Bird extends Animal {

        @Override
        public void move() {
            System.out.println("飛飛飛...");
        }
    }

    //提供各動物的移動方法，只需留父類別的型態參數就好，透過多型方法參數來呼叫

    public static void getMove(Animal animal) {
        animal.move();
    }

    public static void main(String[] args) {
    	//取值會以父型態取值，父、子、孫類別都有的方法，會先用子類別覆寫的方法
        Animal animal = new Polymorphism().new Tiger();
        Animal animal2 = new Polymorphism().new Bird();
        animal.move();//Tiger沒有覆覆寫Animal的方法
//        animal.skill();//編譯錯誤，Aminal沒有這個方法，也沒辦法呼叫，所以必須做轉型，如下
        ((Tiger) animal).skill();//強制轉型，多型才可以

        //((Tiger) animal2).move();//可編譯，runtime發生錯誤，不是多型new出來用強制轉型會不同型態(老虎跟鳥)
        animal2.move();
        if (animal2 instanceof Bird) {
            ((Bird) animal2).move();
        } else {
            System.out.println("物件變數animal2不可轉型成Bird.");
        }
        System.out.println("=================================");
        getMove(animal2);
    }

}
