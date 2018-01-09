package im.fenqi.study.chapter14.part01;

import java.util.Random;

/*
* 14.2.1、类字面常量，什么情况下会触发初始化（对静态域的初始化）
*
* */
class Initable{
    static final int staticFinal=47;
    static final int staticFinal2=new Random().nextInt(1000);
    static {
        System.out.println("Initialing Initable");
    }
}
class Initable2{
    static int staticNoFinal=47;
    static {
        System.out.println("Initialing Initable2");
    }
}
class Initable3{
    static int staticNoFinal=47;
    static {
        System.out.println("Initialing Initable3");
    }
}
public class ClassInitialization {
    public static Random random = new Random(47);
    public static void main(String[] args) throws ClassNotFoundException {
        //不引发初始化，编译的时候检查
        Class initable = Initable.class;

        //不引发初始化，因为调用的常数域,编译器常量
        System.out.println(Initable.staticFinal);
        //引起初始化，调用静态域
        System.out.println(Initable.staticFinal2);
        //引起初始化，调用静态域
        System.out.println(Initable2.staticNoFinal);

        
        //引发初始化
        Class initable3 = Class.forName("im.fenqi.study.chapter14.part01.Initable3");
        //静态域只初始化一次
        System.out.println(Initable3.staticNoFinal);
    }
}
