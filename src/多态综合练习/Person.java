package 多态综合练习;

public class Person {
    private String name;
    private int  age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal,String some) {
        String animaName = null;
        if (animal instanceof Cat cat) {
            animaName = "猫";
        } else if (animal instanceof Dog dog) {
            animaName = "狗";
        } else {
            System.out.println("不属于猫和狗！");
        }
        System.out.println("年龄为" + this.age + "的" + this.name + "养了一只" + animal.getColor() + "的" + animal.getAge() + "岁的" + animaName);
        animal.eat(some);
    }
}
