package im.fenqi.study.chapter17.part03;

import java.util.LinkedHashMap;

/*
* 17.8.3、LinkheHashMap的使用
* */
public class LinkheHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedMap = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            linkedMap.put(i,"zouw0"+i);
        }
        print("Map:"+linkedMap);
        //让数据的输出满足LRU算法，访问次数最少的先输出
        linkedMap = new LinkedHashMap<>(16,0.75f,true);
        for (int i = 0; i < 10; i++) {
            linkedMap.put(i,"zouw0"+i);
        }
        print("Map:"+linkedMap);
        for (int i = 0; i <5; i++) {
            linkedMap.get(i);
        }
        linkedMap.get(0);
        print("Map:"+linkedMap);
    }
    public static void print(String str)
    {
        System.out.println(str);
    }
}
