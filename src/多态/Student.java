package 多态;

public class Student  extends Person{


    @Override
    public void show(){
        System.out.println("学生"+getName()+getAge());
    }
}
