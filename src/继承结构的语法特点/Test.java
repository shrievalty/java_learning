package 继承结构的语法特点;

public class Test {
    public static void main(String[] args) {
        Zi zi=new Zi();


        zi.show();
    }

}


class Fu{
    String name="FU";
    String hobby="喝茶";

    public void eat(){
        System.out.println("chi");
    }
    public void drink(){
        System.out.println("he");
    }



}


class Zi extends Fu{
    String name="Zi";
    String hobby="吃鸡";
    @Override//重写注释，装饰器，本质覆盖虚方法表中的父类方法
    public void eat(){
        System.out.println();
    }
    public void sleep(){
        System.out.println();
    }
    public void show(){
        this.drink();
        super.eat();


    }

}
