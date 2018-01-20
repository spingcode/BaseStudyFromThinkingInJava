package im.fenqi.study.chapter08.part01;

import org.junit.Test;

/**
 * @Author:zouw
 * @Description:8.2.4、在多态中对私有方法的讨论
 * @Date:Created in 17:12 2018/1/18
 * @Modified By:
 */
public class PrivateOverride{
    public int field=0;
    private void f()
    {
        System.out.println("PrivateOverride.f");
    }
    public static void g(){
        System.out.println("PrivateOverride.g");
    }

    public static void main(String[] args) {
        //1、当父类是私有方法时相当于是final类型的不能被重写
        PrivateOverride p = new Derived();
        p.f();
        //对于域而言也没有多态的特性
        System.out.println(p.field);
        //静态方法也没有多态的特性
        p.g();
    }
}
class Derived extends PrivateOverride{
    public int field=1;
    public void f(){
        System.out.println("BaseClass.f");
    }
    public static void g(){
        System.out.println("Derived.g");
    }
}