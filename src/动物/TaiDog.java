package 动物;

public class TaiDog extends Dog{
    public TaiDog() {

    }
    public TaiDog(String name,int age){
        setName(name);
        setAge(age);
    }
    public void touch(){
        System.out.println(getName()+"在拆家");
    }

}
