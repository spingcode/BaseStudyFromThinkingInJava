package im.fenqi.study.chapter15.part01;
/*
* 15.2、简单的范型：本例想说明使用泛型的时候可以在使用的时候确定类型，一般用在容器里面
* */
public class Holder01<AnyTye> {
    private AnyTye x;

    public Holder01(AnyTye x) {
        this.x = x;
    }

    public AnyTye getX() {
        return x;
    }

    public void setX(AnyTye x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Holder01<Integer> h=new Holder01<>(12);
        System.out.println(h.getX());
    }
}
