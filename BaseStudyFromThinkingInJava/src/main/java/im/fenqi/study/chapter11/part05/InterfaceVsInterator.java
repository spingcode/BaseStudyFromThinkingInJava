package im.fenqi.study.chapter11.part05;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/*
* 11.12、集合的父类Collection
*Collection:集合的父类，可以实现容器和打印函数的解耦
*         可以使用foreach简洁，但是自定义容器的时候需要实现Collection接口，需要实现很多没有必要的方法
*         当然可以继承AbstractCollection类
* Iterator迭代器也可以实现该功能
* */
public class InterfaceVsInterator {

    public static void display(Collection<String> c)
    {
        for (String s:c)
            System.out.print(s+" ");
        System.out.println();
    }
    public static void display(Iterator<String> iterator)
    {
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Collection<String> c = new LinkedList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");
        c.add("f");
        c.add("g");
        display(c);
        display(c.iterator());

        display(new SelfCollection().iterator());
    }
}
class PetCollection{
    protected String[] c={"a","b","c","d","e","f"};

}
class SelfCollection extends PetCollection
{
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<c.length;
            }

            @Override
            public String next() {
                return c[index++];
            }
        };
    }
}