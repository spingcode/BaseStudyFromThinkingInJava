package im.fenqi.study.chapter14.part05;
/*
* 14.9、B实现A并且添加一个方法
*   其实我们并不想让别人访问B里面其他方法
* */
public class B implements A {
    @Override
    public void f() {

    }
    public void g(){

    }

    public static void main(String[] args) {
        A a=new B();
        a.f();
        if (a instanceof B)
        {
            B b=(B)a;
            b.g();
        }
    }
}
