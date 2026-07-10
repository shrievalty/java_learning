package 多态综合练习;

public class Cat extends Animal {

    public Cat(){

    }
    public Cat(int age,String color) {
        super(age, color);
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }

    @Override
    public void eat(String some){
        System.out.println(getColor()+"的"+getAge()+"岁的猫眯着眼睛侧着头吃"+some);
    }

}
