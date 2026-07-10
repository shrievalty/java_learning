package 多态综合练习;

public class Test {
    public static void main(String[] args) {
        Person person=new Person("老李",24);
        Cat cat=new Cat(2,"白色");
        Dog dog=new Dog(3,"黑色");

        person.keepPet(dog,"骨头");
        person.keepPet(cat,"鱼");
    }
}
