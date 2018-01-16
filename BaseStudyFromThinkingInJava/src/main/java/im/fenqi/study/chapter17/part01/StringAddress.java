package im.fenqi.study.chapter17.part01;


import im.fenqi.study.chapter15.part02.Generator;
import im.fenqi.study.chapter16.part03.RandomGenerator;

import java.util.*;

/*
* 17.2、填充容器：
* */
public class StringAddress {
    public static void main(String[] args) {
        //1、自带的填充
        List<String> list = new ArrayList<>(Collections.nCopies(10,new String("dfsddf")));
        System.out.println(list);

        //2、使用Genertor产生容器
        Set<Integer> set = new LinkedHashSet<>(new CollectionData<Integer>(new Generator<Integer>() {
            @Override
            public Integer next() {
                return new Random().nextInt(100);
            }
        },10));
        System.out.println(set);

        System.out.println(new ArrayList<Byte>(new CollectionData<Byte>(new RandomGenerator.ByteG(),10)));
    }
}
