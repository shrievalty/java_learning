package 工作;

public class Chef extends Worker{

    public Chef() {
    }

    public Chef(String number, String name, int salary) {
        super(number, name, salary);
    }
    @Override
    public void work(){
        System.out.println("炒菜");
    }

}
