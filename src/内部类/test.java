package 内部类;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Car car = new Car("bingli", 1, "black");

        Car.Engine e=car.getEngine();
        e.show();

        Car.Engine engine=car.new Engine("v8", 1);
        engine.show();


//        ArrayList<Integer> list=new ArrayList();
//
//        list.add(1);
//        list.iterator();
        Scanner sc=new Scanner(System.in);
        sc.next();
        System.out.println(engine.getEngineName());
    }
}
