package im.fenqi.study.chapter08.part02;

/**
 * @Author:zouw
 * @Description:8.3.3、构造器内部发生多态的情况
 * @Date:Created in 20:46 2018/1/18
 * @Modified By:
 */
public class PolyConstructors {
    public static void main(String[] args) {
        //在创建RoundGlyph对象的时候先初始化Glyph对象，会先调用父类的构造方法，在父类的构造器里面执行draw()方法因为多态会执行子类
        //的draw（）方法，但是这个时候子类还没有初始化radius=0，所以输出都为0；
        for (int i = 0; i < 5; i++) {
            new RoundGlyph(10);
        }
    }
}
class Glyph{
    void draw(){
        System.out.println("Glyph.draw");
    }

    public Glyph() {
        System.out.println("before　draw()");
        draw();
        System.out.println("after　draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radius=1;
    @Override
    void draw() {
        System.out.println("RoundGlyph.draw():"+radius);
    }

    public RoundGlyph(int radius) {
        this.radius = radius;
       // System.out.println("RoundGlyph:"+radius);
    }
}