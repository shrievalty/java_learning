package 工作;

public class Worker {
    private String number;
    private String name;
    private int salary;


    public Worker() {
    }

    public Worker(String number, String name, int salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    public void eat(){
        System.out.println("吃米饭！");
    }

    public void work(){
        System.out.println("工作");
    }
    /**
     * 获取
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Worker{number = " + number + ", name = " + name + ", salary = " + salary + "}";
    }
}
