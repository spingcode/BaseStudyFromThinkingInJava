package im.fenqi.study.chapter09.part03;

/**
 * @Author:zouw
 * @Description:
 * @Date:Created in 19:19 2018/1/20
 * @Modified By:
 */
public class Factories {
    public static void main(String[] args) {
        serviceConsumer(new ServiceFactory01());
    }
    public static void serviceConsumer(ServiceFactory serviceFactory){
        Service s= serviceFactory.getService();
        s.method1();
        s.method2();
    }
}

class Service01 implements Service{
    @Override
    public void method1() {
        System.out.println("Service01.method1");
    }
    @Override
    public void method2() {
        System.out.println("Service01.method2");
    }
}
class ServiceFactory01 implements ServiceFactory{
    @Override
    public Service getService() {
        return new Service01();
    }
}
interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getService();
}