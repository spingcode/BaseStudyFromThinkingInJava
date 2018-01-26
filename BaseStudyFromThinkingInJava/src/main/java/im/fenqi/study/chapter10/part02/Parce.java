package im.fenqi.study.chapter10.part02;

/**
 * @Author:zouw
 * @Description:在方法和作用域里面的内部类
 * @Date:Created in 20:57 2018/1/20
 * @Modified By:
 */
public class Parce {
    public Destination destination(String s)
    {
        class PDestination implements Destination{

            private String label;

            public PDestination(String label) {
                this.label = label;
            }

            @Override
            public String readLine() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parce p = new Parce();
        Destination d = p.destination("dsaaaaaaaaaa");
        System.out.println( d.readLine());;
    }
}
