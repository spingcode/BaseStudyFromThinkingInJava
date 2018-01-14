package im.fenqi.study.chapter16.part03;

import im.fenqi.study.chapter15.part02.Generator;
import im.fenqi.study.chapter17.part01.CollectionData;

import java.lang.reflect.Array;

/*
* 16.6.3、创建数组
* */
public class Generated {
    public static <T> T[] array(T[] a, Generator<T> gen)
    {
        return new CollectionData<T>(gen,a.length).toArray(a);
    }
    public static <T> T[] array(Class<?> type,Generator<T> gen,int size){
        T[] a= (T[]) Array.newInstance(type,size);
        return new CollectionData<T>(gen,size).toArray(a);
    }
}
