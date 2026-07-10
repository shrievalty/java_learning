package 继承结构练习;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃狗粮");
    }

    public void drink(){
        System.out.println("喝水");
    }

    public void lookHome(){
        System.out.println("看家");
    }
}
