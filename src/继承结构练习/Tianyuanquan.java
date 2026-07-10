package 继承结构练习;

public class Tianyuanquan extends Dog {

    public Tianyuanquan(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("吃剩饭");
    }

}
