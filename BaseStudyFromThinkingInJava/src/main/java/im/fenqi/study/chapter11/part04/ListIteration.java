package im.fenqi.study.chapter11.part04;

import im.fenqi.study.util.Pets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import static im.fenqi.study.util.PrintUtil.*;
/*
* 11.6、双向迭代器
*
* */
public class ListIteration {
    public static void main(String[] args) {
        List<Pets> list = Pets.arrayList(8);
        ListIterator<Pets> it = list.listIterator();
        while (it.hasNext())
            System.out.print(it.next()+","+it.nextIndex()+","+it.previousIndex()+";");
        System.out.println();
        while (it.hasPrevious())
            System.out.print(it.previous().getCount()+" ");
        System.out.println();
        System.out.println(list);
        it = list.listIterator(3);
        while (it.hasNext())
        {
            it.next();
            it.set(new Pets(200));
        }
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8);
        print(reserver(numList));
    }
    //exercise 12
    public static List<Integer> reserver(List<Integer> numList)
    {
        ListIterator<Integer> listIterator = numList.listIterator();
        List<Integer> resultList = new ArrayList<>();
        while (listIterator.hasNext())
        {
            Integer temp = listIterator.next();
            resultList.add(0,temp);
        }
        return resultList;
    }
}
