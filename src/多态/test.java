package 多态;

public class test {
    public static void main(String[] args) {
        //封装：对象代表什么，就得封装对应的数据，并且提供数据对应的行为；
        //继承：有共同属性或方法
        //多态：对象的多种形态，可以把子类的对象赋值给父类形态
        //应用场景，注册时多种对象，方法的形参不能统一，同类的对象，表现不同的形态
        //有继承关系，有父类引用只想子类对象，有方法重写

        Student student=new Student();
        student.setName("zhangsan");
        student.setAge(18);


        Teacher teacher=new Teacher();
        teacher.setName("lisi");
        teacher.setAge(40);
        Administrator administrator=new Administrator();
        administrator.setName("wangwu");
        administrator.setAge(35);


        register(teacher);
        register(administrator);
        register(student);


    }

    public  static void register(Person person){
        person.show();
    }
}
