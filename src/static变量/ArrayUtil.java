package static变量;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil(){

    }

    public static String printArr(int[] arr){
        StringJoiner stringJoiner=new StringJoiner(",","[","]");
        for (int j : arr) {
            stringJoiner.add(j + "");
        }
        return stringJoiner.toString();
    }

    public static double getAerage(double[] arr){
        double sum=0;
        double result=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        result=sum/ arr.length;
        return result;
    }



}
