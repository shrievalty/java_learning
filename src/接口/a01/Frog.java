package 接口.a01;

public class Frog extends Animal{


    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public Object eat() {
        System.out.println("青蛙吃蚊子");
        return 1;
    }

}
