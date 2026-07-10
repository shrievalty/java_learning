package 多态综合练习;

public class Animal {
    private int age;
    private String color;

    public Animal(){

    }
    public Animal(int age,String color) {
        this.age = age;
        this.color = color;

    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String some){
        System.out.println("吃"+some);
    }

}
