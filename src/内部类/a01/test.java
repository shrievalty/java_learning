package 内部类.a01;

public class test {
    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("吃肉");
            }
        };
        method(animal);
            Swim swim= new Swim(){
            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        };

        swim.swim();

        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        }.swim();
    }

    public static void method(Animal animal){
        animal.eat();
    }
}
