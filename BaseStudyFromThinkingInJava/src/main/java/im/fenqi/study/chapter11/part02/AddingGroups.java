package im.fenqi.study.chapter11.part02;

import java.util.*;

/*
* 添加一组元素:
* */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1,99);
        //list是通过Arrays.asList获取的，底层使用的数组，不能改变数组的大小，add/delete操作都不行
        //list.add(12);
    }
}
