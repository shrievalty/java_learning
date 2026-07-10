package 工作;

public class Manger extends Worker{
    private int bonus;

    public Manger() {
    }

    public Manger(String number, String name, int salary, int bonus) {
        super(number, name, salary);
        this.bonus = bonus;
    }

    public Manger(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work(){
        System.out.println("管理其他人");
    }

    /**
     * 获取
     * @return bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Manger{bonus = " + bonus + "}";
    }
}
