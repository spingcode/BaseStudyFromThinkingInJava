package im.fenqi.study.util;

import java.util.ArrayList;
import java.util.Random;

/*
* 随机产生几个列表
* */
public class Pets implements Comparable<Pets>{
    int count;
    public Pets()
    {
        this.count = new Random().nextInt(100);
    }

    public Pets(int count) {
        this.count = count;
    }
    public static ArrayList<Pets> arrayList(int num)
    {
        ArrayList<Pets> list = new ArrayList<>();
        for (int i=0;i<num;i++)
        {
            Pets pets = new Pets();
            list.add(pets);
        }
        return list;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return this.count+"";
    }

    @Override
    public int compareTo(Pets o) {
        return this.count-o.count;
    }
}