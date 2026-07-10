package 继承;

public class Student extends Person {
    private String number;

    public Student() {
    }

    public Student(String number) {
        this.number = number;
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

    public String toString() {
        return "Student{number = " + number + "}";
    }
}
