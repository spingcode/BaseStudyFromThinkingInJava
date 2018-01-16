package im.fenqi.study.chapter17.part02;

import java.util.*;

/*
* 17.4、可选操作
* */
public class Unsupported {
    public static void main(String[] args) {
        //1、Arrays.asList时基于一个固定大小的数组，不能进行改变数组大小操作。
        Collection<String> c= Arrays.asList("a b c d e f".split(" "));
       // c.add("x");

        //2、可以通过其他方式变成正常使用的集合
        Collection<String> c02 = new ArrayList<>();
        Collections.addAll(c02,"a b c d e".split(" "));
        c02.add("y");
        System.out.println(c02);

        //3、unmodifiableList不能改变大小和内容
        List<String> list = new ArrayList<>(Arrays.asList("a b c".split(" ")));
        list = Collections.unmodifiableList(list);
        //list.add("x");
        //list.set(1,"ss");
    }
}
