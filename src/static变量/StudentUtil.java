package static变量;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil(){

    }
    public static int getMaxAge(ArrayList<Student> list){
        int maxAge=list.getFirst().getAge();
        for (Student student:list){
            int temp=student.getAge();
            if(temp>maxAge){
                maxAge=temp;
            }
        }
        return maxAge;
    }

}
