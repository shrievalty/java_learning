package 包;

import javax.xml.namespace.QName;

public class test {
    public static void main(String[] args) {
        {
            int a=10;
            System.out.println(a);
        }

        student s=new student();
       //局部代码块，结束释放内存
    }

}

class student{
    private String name;
    private int age;
    static {
        //添加一些用户信息
    }

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}