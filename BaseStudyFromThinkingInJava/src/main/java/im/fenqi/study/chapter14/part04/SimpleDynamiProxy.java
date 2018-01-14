package im.fenqi.study.chapter14.part04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 动态代理
* */
public class SimpleDynamiProxy {
    public static void consumer(Interface iface)
    {
        iface.doSomeThing();
        System.out.println("iface:"+iface);
        iface.someThingElse("nonononono");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);
        //只要传入proxy对象
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[]{Interface.class},new DynamicProxyHandler(realObject));
        System.out.println("main:"+proxy);
        consumer(proxy);
    }
}
class  DynamicProxyHandler implements InvocationHandler
{

    private Object proxied;

    DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("someThingElse"))
        {
            System.out.println("proxy:"+proxy.getClass());
            System.out.println("proxied:"+proxied.getClass());
        }
        return method.invoke(proxied,args);
    }
}
