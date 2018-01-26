package im.fenqi.study.chapter10.part01;

/**
 * @Author:zouw
 * @Description:10.3、创建内部类
 * @Date:Created in 20:47 2018/1/20
 * @Modified By:
 */
public class Outer {
    class Inner{
        public Outer getOut(){
            return Outer.this;
        }
    }

    public void condition()
    {
        //外部类的非静态方法直接创建内部类
        Inner inner = new Inner();
        Outer out = inner.getOut();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        //外部类的静态方法，需要一个外部对象
        Outer.Inner i = outer.new Inner();
        Outer out = i.getOut();
        System.out.println(outer==out);
    }
}
