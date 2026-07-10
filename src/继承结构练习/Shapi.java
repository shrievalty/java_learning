package 继承结构练习;

public class Shapi extends Dog{
    public Shapi(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("吃骨头");
    }
}
