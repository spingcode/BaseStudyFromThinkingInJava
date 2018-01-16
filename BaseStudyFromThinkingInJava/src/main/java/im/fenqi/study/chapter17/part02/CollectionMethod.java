package im.fenqi.study.chapter17.part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
* Collection的功能方法
* */
public class CollectionMethod
{
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zouw01");

        String[] str = coll.toArray(new String[0]);
        print(Arrays.toString(str));
        print(Collections.max(coll));

    }
    public static void print(String str)
    {
        System.out.println(str);
    }
}
