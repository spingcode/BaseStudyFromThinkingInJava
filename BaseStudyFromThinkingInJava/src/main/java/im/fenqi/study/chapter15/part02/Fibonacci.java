package im.fenqi.study.chapter15.part02;


/*
* 15.3、接口中使用泛型
*
* */
public class Fibonacci implements Generator<Integer>{
    private int count=0;
    @Override
    public Integer next() {
        return fib(count++);
    }

    private Integer fib(int i) {
        if (i<2)
            return 1;
        else
        {
            return fib(i-1) + fib(i-2);
        }
    }

    public static void main(String[] args) {
        Fibonacci fcci= new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.print(fcci.next()+" ");
        }
    }
}
