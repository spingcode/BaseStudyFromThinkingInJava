package im.fenqi.study.chapter11.part05.set;

import java.util.*;
import static im.fenqi.study.util.PrintUtil.*;
/*
 * 11.9 Set集合的使用
 * */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i=0;i<10000;i++)
            intset.add(random.nextInt(30));
        System.out.println(intset);

        Set<Integer> intSortSet = new TreeSet<>();
        for (int i=0;i<10000;i++)
            intSortSet.add(random.nextInt(30));
        System.out.println(intSortSet);
        //添加
        Set<String> set01 = new HashSet<>();
        Collections.addAll(set01,"A B C D F H M O".split(" "));
        set01.add("L");

        //包含关系：contain
        print("H:"+set01.contains("H"));
        print("N:"+set01.contains("N"));

        Set<String> set02 = new HashSet<>();
        Collections.addAll(set02,"H M O".split(" "));
        print("set02 in set01:"+set01.containsAll(set02));

        set01.remove("H");
        print("set02 in set01:"+set01.containsAll(set02));

        //删除set01里面包含set02的元素
        print("set01:"+set01);
        set01.removeAll(set02);
        print("set2 remove in set01:"+set01);

        //TreeSet的排序功能
        Set<String> set03 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (int i=0;i<10000;i++)
        {
            set03.add((char)(random.nextInt(26)+'a')+"");
            set03.add((char)(random.nextInt(26)+'A')+"");
        }
        print(set03);
    }
}
