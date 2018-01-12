package im.fenqi.study.chapter15.part05;

import java.util.*;

/*
* 15.11.1：任何基本类型都不能作为类型参数
*
* */
public class PrimitiveGenericTest {
    public static void main(String[] args) {
        //List<int> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Byte[] possibles={1,2,3,4,5,6,7,8};
        Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(possibles));
        //不能把int[]变成Byte[]
        //mySet = new HashSet<Byte>(Arrays.<Byte>asList(1,2,3));


    }
}
