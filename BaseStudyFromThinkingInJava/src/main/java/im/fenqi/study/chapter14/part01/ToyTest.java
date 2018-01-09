package im.fenqi.study.chapter14.part01;
import static im.fenqi.study.util.PrintUtil.*;
/*
* 14.2、Class对象
*
* */
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
class Toy {
    public Toy() {
    }
    public Toy(int i) {
    }
}
class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots
{
    static {
        System.out.println("FancyToy");
    }
    public FancyToy() {
        super(1);
    }
}
public class ToyTest {
    public static void main(String[] args) {
        Class c=null;
        try {
           c= Class.forName("im.fenqi.study.chapter14.part01.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        printInfo(c);
        for (Class face:c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            //需要默认的构造器
            obj = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(obj.getClass());
    }
    static void printInfo(Class cc)
    {
        print("Class Name:"+cc.getName()+"is Interface??:"+cc.isInterface());
        print("Simple name:"+cc.getSimpleName());
        print("Canonical name:"+cc.getCanonicalName());
    }
}
