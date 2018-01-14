package im.fenqi.study.chapter15.part05;

import java.util.*;

/*
* 15.11.1：任何基本类型都不能作为类型参数
*15.11.2:一个类不能实现一个泛型接口的两种变体
* 15.11.4：重载
* 15.11.5以及本章后面的内容后期研究（************************************）
* */
public class PrimitiveGenericTest<W,T> {
    public static void main(String[] args) {
        //List<int> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Byte[] possibles={1,2,3,4,5,6,7,8};
        Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(possibles));
        //不能把int[]变成Byte[]
        //mySet = new HashSet<Byte>(Arrays.<Byte>asList(1,2,3));

        //int[]不能变成Integer[]
        List<Integer[]> list1 = new ArrayList<>();
        int[] arr = new int[10];
        //list1.add(arr);

    }
    //因为擦除变成相同的参数
    //void f(List<W> v){}
    void f(List<T> v){}
}
class Com01 implements Comparable<Integer>
{

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}

/*
泛型擦除的时候，不管是Comparable<Integer>还是Comparable<String>都会变成 Comarable
不能够编译成功
class Comp2 extends Com01 implements Comparable<String>
{

}*/
