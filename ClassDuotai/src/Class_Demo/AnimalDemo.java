package Class_Demo;

public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Cat();

//        System.out.println(a.age);
        System.out.println(((Cat) a).weight);

        a.eat();
        ((Cat) a).playGame();
    }
}