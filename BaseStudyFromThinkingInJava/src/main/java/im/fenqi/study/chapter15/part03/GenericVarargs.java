package im.fenqi.study.chapter15.part03;

import java.util.ArrayList;
import java.util.List;

/*
* 15.4.2、可变参数
* */
public class GenericVarargs {
    //和Arrays.asList类似
    public static <T> List<T> makeList(T... args)
    {
        List<T> result = new ArrayList<>();
        for (T item:args)
            result.add(item);
        return result;
    }

    public static void main(String[] args) {
            System.out.println(makeList("a"));
            System.out.println(makeList("a","b"));
            System.out.println(makeList("a b c d e f g d s s df s f sf s".split("\\s+")));
    }
}
