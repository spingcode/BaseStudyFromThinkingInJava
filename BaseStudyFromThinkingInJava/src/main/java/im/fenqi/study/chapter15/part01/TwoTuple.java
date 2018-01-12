package im.fenqi.study.chapter15.part01;
/*
* 元组：经常需要返回二个对象，平常遇到这样的情况创建一个类，使用泛型只要是2个对象的可以通用
*       依次类推返回3个、4个都可以。
* */
public class TwoTuple<A,B> {
    private A first;
    private B second;

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public TwoTuple(A first, B second) {

        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
