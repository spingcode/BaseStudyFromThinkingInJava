package im.fenqi.study.chapter09.part02;

/**
 * @Author:zouw
 * @Description:9.5.1、组合接口名字的冲突
 * @Date:Created in 19:04 2018/1/20
 * @Modified By:
 */
class C{
    public int f(){
        return 1;
    }
}
interface C1{
    public int f();
}
interface C2{
    public void f();
}
//正确，继承C相当于C4类有一个C里面的f方法，正好实现类接口C1的方法，正确
public class C4 extends C implements C1 {

}

/*
错误，C5继承了C的方法，相当于C5类有一个int f(),实现C2的时候需要实现 void f()方法，这两个方法冲突了。
class C5 extends C implements C2{

}*/
