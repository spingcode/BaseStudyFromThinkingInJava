package im.fenqi.study.chapter17.part01;

import im.fenqi.study.chapter15.part02.Generator;

import java.util.Iterator;
import java.util.LinkedHashMap;

/*
17.2.2、Map生成器
* */
public class MapData<K,V> extends LinkedHashMap<K,V>{
    public MapData(Generator<pair<K,V>> gen,int size) {
        for (int i = 0; i < size; i++) {
            pair<K,V> p = gen.next();
            put(p.key,p.value);
        }
    }

    public MapData(Generator<K> genK,Generator<V> genV,int size) {
        for (int i = 0; i <size; i++) {
            put(genK.next(),genV.next());
        }
    }
    public MapData(Generator<K> genK,V value,int size) {
        for (int i = 0; i <size; i++) {
            put(genK.next(),value);
        }
    }
    public MapData(Iterable<K> iterable,Generator<V> genV) {
        for (K key:iterable) {
            put(key,genV.next());
        }
    }
    public static <K,V> MapData<K,V> map(Generator<pair<K,V>> gen,int size)
    {
        return new MapData<K,V>(gen,size);
    }

    public static <K,V> MapData<K,V> map(Generator<K> genK,Generator<V> genV,int size) {
        return new MapData<K,V>(genK,genV,size);
    }
    public static <K,V> MapData<K,V> map(Generator<K> genK,V value,int size) {
        return new MapData<K,V>(genK,value,size);
    }
    public static <K,V> MapData<K,V> map(Iterable<K> iterable,Generator<V> genV) {
        return new MapData<K,V>(iterable,genV);
    }
}
class pair<K,V>
{
    public final K key;
    public final V value;

    public pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
class GenertedMap{
    public static int key=0;
    public static int value=0;
    public static final int size=10;
    public static int index=0;
    public static class GenertedPair implements Generator<pair<Integer,String>>,Iterable<Integer>{

        @Override
        public pair<Integer, String> next() {
            return new pair<>(key++,"zouw"+value++);
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                @Override
                public boolean hasNext() {
                    return key<size;
                }
                @Override
                public Integer next() {
                    return index++;
                }
            };
        }
    }

    //public static class GenertedK implements Generator<Integer>,
}