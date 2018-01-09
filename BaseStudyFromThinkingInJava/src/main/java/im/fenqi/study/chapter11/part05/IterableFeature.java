package im.fenqi.study.chapter11.part05;

import java.util.Arrays;
import java.util.Iterator;

/*
* 11.13、foreach
*   所有实现类Iterable接口的类都可以使用foreach
*   Iterable类里面有一个Iterator方法可以实现迭代功能
*   可以实现不同的方法返回不同的Iterator对象，实现不同的迭代效果
* */
public class IterableFeature implements Iterable<String>{
    protected String[] words=("And that is how we know the Earth").split(" ");


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<words.length;
            }
            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        String[] s ={"a","b","c"};
        //迭代器不能传入数组
        //test(s);
        test(Arrays.asList(s));

        test(new IterableFeature());
    }
    public static <AnyType> void test(Iterable<AnyType> it)
    {
        for (AnyType x:it)
            System.out.print(x+" ");
        System.out.println();
    }
}
