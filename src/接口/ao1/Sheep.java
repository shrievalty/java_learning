package 接口.ao1;

public class Sheep extends Animal{

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public Object eat() {
        System.out.println("山羊吃草");
        return "";
    }
}
