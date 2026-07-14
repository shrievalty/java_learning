package 接口.a04;

import javax.sound.midi.Soundbank;

public class PingPangCoach extends Coach implements Language{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教运动员打乒乓球");
    }
}
