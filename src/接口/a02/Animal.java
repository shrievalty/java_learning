package 接口.a02;

public abstract class Animal {
    private String name;
    private int age;


    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drink(){
        System.out.println("动物在喝水");
    }
    public abstract void eat();
    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

}

class test{
    public static void main(String[] args) {
        Dog dog=new Dog("大黄",3);
        dog.eat();
        dog.swimming();
        Frog frog=new Frog("小绿",1);
        frog.eat();
        frog.swimming();
        Rabbit rabbit=new Rabbit("小白",3);
        rabbit.eat();


    }
}
