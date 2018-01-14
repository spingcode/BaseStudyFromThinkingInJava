package im.fenqi.study.chapter17.part01;

import im.fenqi.study.chapter15.part02.Generator;

import java.util.ArrayList;
import java.util.Collection;

/*
* 产生集合
* */
public class CollectionData<T> extends ArrayList<T>{
    public CollectionData(Generator<T> gen,int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }
    public static <T> CollectionData<T> list(Generator<T> gen,int quantity)
    {
        return new CollectionData<>(gen,quantity);
    }
}
