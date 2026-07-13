package 接口;


class test{
    public static void main(String[] args) {
        Person person=new Person() {
            @Override
            public void work() {

            }
        };


    }
}

public abstract class Person {
    private String name;
    public abstract void work();
}


class Student extends Person{


    @Override
    public void work(){

    }
}