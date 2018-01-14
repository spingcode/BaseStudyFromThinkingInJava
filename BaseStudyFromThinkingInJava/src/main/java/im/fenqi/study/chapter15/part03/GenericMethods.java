package im.fenqi.study.chapter15.part03;
/*
* 15.4、泛型方法
* */
public class GenericMethods {
    public <AnyType> void f(AnyType x)
    {
        System.out.println(x);
    }
    public static void main(String[] args) {
        GenericMethods gm=new GenericMethods();
        gm.f("dsfg");
        gm.f(12);
        gm.f(2.345);
    }
}
