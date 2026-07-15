package 内部类;

import java.util.SplittableRandom;

public class Car {
    private String brand;
    private int age;
    private String carColor;
    private int a=10;

    public class Engine{
        private String engineName;
        private int engineAge;

        private int a=20;

        public void show(){
            int a=30;
            System.out.println(Car.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }

        public Engine() {
        }

        public Engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        public String getEngineName() {
            return engineName;
        }

        public void setEngineName(String engineName) {
            this.engineName = engineName;
        }

        public int getEngineAge() {
            return engineAge;
        }

        public void setEngineAge(int engineAge) {
            this.engineAge = engineAge;
        }
    }
    static class Glass{
        public void eat(){
            System.out.println("1");
        }
        public static void showGlass(){
            System.out.println("静态内部类");
        }
    }


    public Car() {

    }

    public Car(String brand, int age, String carColor) {
        this.brand = brand;
        this.age = age;
        this.carColor = carColor;
    }
    public Engine getEngine(){
        return new Engine();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }



}
