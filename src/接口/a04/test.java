package 接口.a04;

public class test {
    public static void main(String[] args) {
        PingPangPlayer pps=new PingPangPlayer("liushiwen",18);

        System.out.println(pps.getName()+","+pps.getAge());
        pps.learn();
        pps.speak();
    }
}
