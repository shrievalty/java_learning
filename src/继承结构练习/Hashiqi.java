package 继承结构练习;

public class Hashiqi extends Dog {

    private String blood;

    public Hashiqi(String name, int age,String blood) {

        super(name, age);
        this.blood=blood;
    }

    public void chaiHome(){
        System.out.println("拆家");
    }

}
