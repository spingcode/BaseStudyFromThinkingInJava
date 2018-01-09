package im.fenqi.study.chapter11.part02;

import java.util.*;

import static im.fenqi.study.util.PrintUtil.*;
/*
* 11.4、把容器里面的值打印到控制台
* */
public class PrintingContainers {
    static Collection fill(Collection<String> collection)
    {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String,String> map)
    {
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","spot");
        return map;
    }

    public static void main(String[] args) {
       print( fill(new ArrayList<String>()));
       print( fill(new LinkedList<String>()));
       print( fill(new HashSet<String>()));
       print( fill(new TreeSet<String>()));

       print(fill(new HashMap<String, String>()));
    }
}
