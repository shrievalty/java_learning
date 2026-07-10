package 继承;

public class test1 {
    public static void main(String[] args) {
        Student s=new Student();

        Zi zi=new Zi();

        System.out.println();
    }
}
class Fu{
    private int a=0x11;
    int b=0x222;

    public void showfu1(){
        System.out.println("public--show");
    }

    private void showfu2(){
        System.out.println("private--show");
    }
}

class Zi extends Fu{
    int c=0x333;
    public void zishou(){
        System.out.println("Zi--show");
    }
}