package 内部类;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Car car = new Car("bingli", 1, "black");

        Car.Engine engine=car.new Engine("v8", 1);
        engine.show();

        Car.Glass glass=new Car.Glass();
        glass.eat();
        Car.Glass.showGlass();


//        ArrayList<Integer> list=new ArrayList();
//
//        list.add(1);
//        list.iterator();
        Scanner sc=new Scanner(System.in);
        sc.next();
    }
}
