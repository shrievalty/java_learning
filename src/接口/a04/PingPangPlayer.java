package 接口.a04;

public class PingPangPlayer extends Player implements Language{

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
    @Override
    public void learn() {
        System.out.println("乒乓球运动员在学乒乓球");
    }


}
