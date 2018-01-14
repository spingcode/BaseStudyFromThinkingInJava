package im.fenqi.study.chapter15.part02;

import java.util.Iterator;

/*
* 为Fibonacci类增加迭代的功能，这里使用的也是适配器模式
* */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{

    private int n;
    public IterableFibonacci(int n) {
        this.n = n;
    }
    private  class MyIterator implements Iterator<Integer>
    {

        @Override
        public boolean hasNext() {
            return n>0;
        }
        @Override
        public Integer next() {
            n--;
            return IterableFibonacci.this.next();
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    public static void main(String[] args) {
        Iterable<Integer> it = new IterableFibonacci(18);
        for (int i:it)
            System.out.println(i);
        Iterator<Integer> it01 = new IterableFibonacci(18).iterator();
        while (it01.hasNext())
            System.out.print(it01.next()+" ");
    }
}
