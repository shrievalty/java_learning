package static变量;



public class TestDmoe {
    public static void main(String[] args) {
        int[] a1={2,3,4,5,6,7};

        double[] a2={1,2,3,4,5,6,7};

        String s=ArrayUtil.printArr(a1);
        System.out.println(s);

        double result=ArrayUtil.getAerage(a2);
        System.out.println(result);

    }
}
