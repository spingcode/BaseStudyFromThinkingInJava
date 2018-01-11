package im.fenqi.study.chapter14.part05;

/*
* 反射的方法调用没有权限访问的方法
* */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class HiddenC{

    public static A makeA()
    {
        return new C();
    }
    public static void callHiddenMethod(Object o,String name) throws Exception
    {
        Method method = o.getClass().getDeclaredMethod(name);
        method.setAccessible(true);
        method.invoke(o);
    }
    public static void main(String[] args) throws Exception{
        C c =(C)makeA();
        c.f();
        c.g();
        c.u();
        c.v();
        //私有的访问不了
        //c.w();

        //通过反射的方法对私有的方法进行调用
        callHiddenMethod(c,"w");

        //d对类C里面的私有域进行访问并且修改
        //i可以修改
        Field field01 = c.getClass().getDeclaredField("i");
        field01.setAccessible(true);
        System.out.println("modify before i:"+field01.getInt(c));
        field01.set(c,20);
        System.out.println("modify after i:"+field01.getInt(c));

        //s可以修改
        Field field02 = c.getClass().getDeclaredField("s");
        field02.setAccessible(true);
        System.out.println("modify before s:"+field02.get(c));
        field02.set(c,"fffff");
        System.out.println("modify after s:"+field02.get(c));

        //g不能修改,虽然使用反射的看似修改了，实际上调用printG的时候还是原来的值
        //主要在编译的时候把final对应的值直接替换了printG实际变成： System.out.println("g:"+"git");
        Field field03 = c.getClass().getDeclaredField("g");
        field03.setAccessible(true);
        System.out.println("modify before g:"+field03.get(c));
        field03.set(c,"aaaaaaa");
        System.out.println("modify after g:"+field03.get(c));
        c.printG();
    }
}
class C implements A {
    private int i=10;
    private String s="sss";
    private final String g="git";
    public void printG()
    {
        System.out.println("g:"+g);
    }
    @Override
    public void f() {
        System.out.println("f()");
    }
    public void g()
    {
        System.out.println("g()");
    }
    void u(){
        System.out.println("u()");
    }
    protected void v()
    {
        System.out.println("v()");
    }
    private void w()
    {
        System.out.println("w()");
    }
}
