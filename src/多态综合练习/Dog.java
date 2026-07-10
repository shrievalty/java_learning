package 多态综合练习;

import java.util.Date;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age,String color) {
        super(age, color);
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }

    @Override
    public void eat(String some){
        System.out.println(getColor()+"的"+getAge()+"岁的狗两只前腿死死抱住"+some+"猛吃");
    }

}
