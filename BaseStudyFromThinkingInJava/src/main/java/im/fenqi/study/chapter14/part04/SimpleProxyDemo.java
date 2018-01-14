package im.fenqi.study.chapter14.part04;
/*
* 14.7、动态代理：简单的代理
* */
public class SimpleProxyDemo {
    public static void consumer(Interface iface)
    {
        iface.doSomeThing();
        iface.someThingElse("nonononono");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
interface Interface{
    void doSomeThing();
    void someThingElse(String arg);
}
class RealObject implements Interface
{
    @Override
    public void doSomeThing() {
        System.out.println("doSomeThing");
    }

    @Override
    public void someThingElse(String arg) {
        System.out.println("someThingElse"+arg);
    }
}
class SimpleProxy implements Interface
{
    Interface proxy;

    public SimpleProxy(Interface proxy) {
        this.proxy = proxy;
    }

    @Override
    public void doSomeThing() {
        System.out.println("SimpleProxy doSomeThing");
    }

    @Override
    public void someThingElse(String arg) {
        System.out.println("SimpleProxy someThingElse"+arg);
        proxy.someThingElse(arg);
    }
}