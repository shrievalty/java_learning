package 工作;

public class worktest {
    public static void main(String[] args) {
        Chef chef=new Chef("001","张三",9999);

        Manger manger=new Manger("001","李四",9999,9999);

        chef.work();
        chef.eat();
        System.out.println(chef.getName());
        System.out.println(chef.getNumber());


        manger.work();
        manger.eat();
        System.out.println(manger.getName());
        System.out.println(manger.getNumber());
    }
}
