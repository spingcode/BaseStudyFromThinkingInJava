package im.fenqi.study.chapter15.part03;

import im.fenqi.study.chapter15.part02.Generator;

import java.util.ArrayList;
import java.util.Collection;

/*
* 15.4.4、创建一个通用的Generator
* 15.4.5:讲解了元组的简单使用
* 15.4.6、讲解类set的应用
*
*
* 15.7和15.8讲解类泛型的工作原理可以更加深入的了解
*
* */
public class BaseGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BaseGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> Collection<T> fill(Collection<T> coll,Generator<T> generator,int n)
    {
        for (int i=0;i<n;i++)
            coll.add(generator.next());
        return coll;
    }
    public static <T> Generator<T> create(Class<T> type)
    {
        return new BaseGenerator<>(type);
    }

    public static void main(String[] args) {
        Generator<String> generator = BaseGenerator.create(String.class);
        for (int i=0;i<10;i++)
            System.out.println(generator.next());
        System.out.println(fill(new ArrayList<String>(),generator,10));

    }
}
