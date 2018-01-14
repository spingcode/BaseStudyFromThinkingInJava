package im.fenqi.study.chapter16.part03;

import java.util.Arrays;

/*
* 16.6、创建测试数据
*
* */
public class FillingArrays {
    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        char[] a3 = new char[size];
        short[] a4 =new short[size];
        int[] a5= new int[size];
        long[] a6= new long[size];
        float[] a7= new float[size];
        double[] a8 = new double[size];
        String[] a9 = new String[size];

       Arrays.fill(a1,true);
       Print(Arrays.toString(a1));

       Arrays.fill(a2,(byte)11);
       Print(Arrays.toString(a2));
    }
    public static  void Print(String string)
    {
        System.out.println(string);
    }
}
