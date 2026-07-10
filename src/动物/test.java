package 动物;

public class test {
    public static void main(String[] args) {
        Cat boou=new Cat();
        boou.setName("布偶猫");
        Cat lihua=new Cat();
        lihua.setName("狸花猫");
        HashiDog hd=new HashiDog();
        hd.setName("哈士奇");
        TaiDog td=new TaiDog("泰迪",18);
        boou.eat();
        boou.catchMouse();

        lihua.drinkWater();
        lihua.catchMouse();

        hd.destroyHome();
        hd.protectHome();


        td.eat();
        td.touch();
    }
}
