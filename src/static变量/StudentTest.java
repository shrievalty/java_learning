package static变量;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {

        ArrayList<Student> list=new ArrayList<>();


        Student student=new Student("张三",23,"男");
        Student student1=new Student("李四",21,"女");
        Student student2=new Student("王五",24,"男");
        Student student3=new Student("王六",31,"男");
        Student student4=new Student("王七",21,"男");
        Student student5=new Student("王八",29,"男");

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        System.out.println(StudentUtil.getMaxAge(list));

//        student1.teachername="阿伟老师";//应该是共享的属性,static
    //工具类，帮助我门做一些事情的，但是不免书任何事物的类，类名见名知意，构造方法私有化，不让其他类创建同名，方法都是静态的
    //测试类，用来检查其他类是否正确的
    //javabean类，用来描述一些事物

    }
}
