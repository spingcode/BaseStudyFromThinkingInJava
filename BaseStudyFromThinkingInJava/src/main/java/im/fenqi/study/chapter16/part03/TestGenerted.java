package im.fenqi.study.chapter16.part03;

import java.util.Arrays;

/*
* 测试创建数组
* */
public class TestGenerted {


    public static void main(String[] args) {
        Integer[] a= {2,5,6,7};
        System.out.println(Arrays.toString(a));
        a=Generated.array(a,new RandomGenerator.IntG());
        System.out.println(Arrays.toString(a));

        Integer[] b = Generated.array(Integer.class,new RandomGenerator.IntG(),10);
        System.out.println(Arrays.toString(b));
    }
}
