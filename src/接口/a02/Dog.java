package 接口.a02;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
    @Override
    public void swimming(){
        System.out.println("狗刨");
    }
}
