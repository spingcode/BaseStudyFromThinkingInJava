package im.fenqi.study.chapter11.part04;

import im.fenqi.study.util.Pets;

import java.util.Iterator;
import java.util.List;
import static im.fenqi.study.util.PrintUtil.*;
/*
* 11.6、迭代器的使用
* */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pets> pets = Pets.arrayList(12);
        Iterator<Pets> iterator = pets.iterator();
        while(iterator.hasNext())
        {
            Pets p = iterator.next();
            System.out.print(p.getCount()+",");
        }
        System.out.println();
        System.out.println("----------------------------------------");
        for (Pets p :pets)
            System.out.print(p.getCount()+",");
        System.out.println();
        System.out.println("----------------------------------------");
        iterator = pets.iterator();
        print(iterator);
        iterator = pets.iterator();
        for (int i=0;i<6;i++)
        {
            iterator.next();
            iterator.remove();
        }
        System.out.println(pets);
        print(iterator);
    }
}
