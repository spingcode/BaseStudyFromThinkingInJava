package im.fenqi.study.chapter11.part03;

import im.fenqi.study.util.Pets;
import im.fenqi.study.util.Hamster;
import java.util.*;

import static im.fenqi.study.util.PrintUtil.*;
/*
* 11.5、List的应用
*
* */
public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Pets> list = Pets.arrayList(7);
        print(list);
        Hamster h = new Hamster();
        list.add(h);
        print(list);
        System.out.println(list.contains(h));
        list.remove(h);
        Pets p = list.get(2);
        System.out.println(list.indexOf(p));
        List<Pets> sub = list.subList(1,3);
        print(sub);
        System.out.println(list.containsAll(sub));
        Collections.sort(sub);
        print(sub);

        //(1):安装指定的随机元进行置换
        Collections.shuffle(sub,random);
        print(sub);

        List<Pets> copy = new ArrayList<>(list);
        sub = Arrays.asList(list.get(1),list.get(2));
        //求交集
        copy.retainAll(sub);
        print(copy);

        //集合变成数组
        Object[] o= copy.toArray();
        Pets[] pa = copy.toArray(new Pets[0]);
    }
}
