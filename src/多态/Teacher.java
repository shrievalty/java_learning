package 多态;

public class Teacher extends Person{
    @Override
    public void show(){
        System.out.println("老师"+getName()+getAge());
    }
}
