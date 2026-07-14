package 接口.a04;

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();

}
