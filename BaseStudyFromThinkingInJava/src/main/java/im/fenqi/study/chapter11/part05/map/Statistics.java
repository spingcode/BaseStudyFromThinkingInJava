package im.fenqi.study.chapter11.part05.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import static im.fenqi.study.util.PrintUtil.*;
/*
* 11.10、Map的使用
*
* */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer,Integer> m = new HashMap<>();
        for (int i =0;i<10000;i++)
        {
            int r=random.nextInt(20);
            Integer freq = m.get(r);
            m.put(r,freq==null?1:freq+1);
        }
        System.out.println(m);
        m.put(30,100);
        //包含：
        Integer value = m.get(30);
        print("key:"+m.containsKey(30));
        print("value:"+m.containsValue(value));

        print("set:"+m.keySet());
        print("values:"+m.values());

        Set<Map.Entry<Integer,Integer>> s = m.entrySet();
        for (Map.Entry<Integer,Integer> e:s)
        {
            Integer key = e.getKey();
            Integer value01 = e.getValue();
            System.out.println(key+":"+value01);
        }
    }
}
