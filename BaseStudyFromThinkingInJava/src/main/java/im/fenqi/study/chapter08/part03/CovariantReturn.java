package im.fenqi.study.chapter08.part03;

/**
 * @Author:zouw
 * @Description:8.4、协变返回类型
 * @Date:Created in 20:59 2018/1/18
 * @Modified By:
 */
public class CovariantReturn {
    //WheatMill重写了Mill的process方法，但是返回值不同，采用了协变返回类型
    //子类的返回类型要是父类返回类型的子类
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain grain = m.process();
        System.out.println(grain);
        m = new WheatMill();
        grain = m.process();
        System.out.println(grain);
    }

}
class Grain{
    @Override
    public String toString() {
        return "Grain";
    }
}
class Wheat extends Grain{
    @Override
    public String toString() {
        return "Wheat";
    }
}
class Mill{
    Grain process(){
        return new Grain();
    }
}
class WheatMill extends Mill{
    @Override
    Wheat process() {
        return new Wheat();
    }
}
