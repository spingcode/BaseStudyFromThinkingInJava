package im.fenqi.study.chapter17.part02;

import java.util.*;

/*
* 17.6、set，TreeSet
* */
public class TypesForSets {
    public static void main(String[] args) {

        SortedSet<SortType> set = new TreeSet<>();
        fill(set,SortType.class);
        fill(set,SortType.class);
        System.out.println(set);
        SortType low =  set.first();
        SortType high = set.last();
        print("low:"+low);
        print("high:"+high);
        Iterator<SortType> iterator = set.iterator();
        int i=0;
        while (iterator.hasNext())
        {
            if(i==3)
                low=iterator.next();
            if (i==6)
                high = iterator.next();
            else
                iterator.next();
            i++;
        }
        print("low:"+low);
        print("high:"+high);
        print("subList:"+set.subSet(low,high));
        print("headSet:"+set.headSet(high));
        print("tailSet:"+set.tailSet(low));
    }
    public static <T> Set<T> fill(Set<T> set,Class<T> type)
    {
        try {
            for (int i = 0; i < 10; i++) {
                set.add(type.getConstructor(int.class).newInstance(i));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return set;
    }
    public static void print(String str)
    {
        System.out.println(str);
    }
}
class SetType{
    int i;

    public SetType(int i)
    {
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof SetType)&&i==((SetType)obj).i;
    }
}
class SortType extends SetType implements Comparable<SortType>{

    public SortType(int i) {
        super(i);
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }

    //递增，最好不要直接使用return i-o.i:容易溢出（*******************************）
    @Override
    public int compareTo(SortType o) {
        return i>o.i?1:(i==o.i?0:-1);
    }
}