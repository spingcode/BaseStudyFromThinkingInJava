package im.fenqi.study.chapter11.part01;

import java.util.ArrayList;
/*
* 11.1、泛型保证容器的安全运行：一个容器里面只放一种类型
*   在（1）处的容器不使用泛型时默认是Object类型，在运行的时候报错
*   在（2）处使用泛型保证错误在编译的时候发现
*
* */
public class AppleAndOrangeWithoutGenerics01 {
    public static void main(String[] args) {
        /*
        * (1)
        * */
        ArrayList list = new ArrayList();
        list.add(new Apple());
        list.add(new Apple());
        list.add(new Apple());
        list.add(new Orange());
        for (int i=0;i<list.size();i++)
        {
            //((Apple)list.get(i)).id();
        }
        ArrayList<Apple> list01 = new ArrayList<Apple>();
        list01.add(new Apple());
        list01.add(new Apple());
        list01.add(new Apple());
        //list01.add(new Orange());
        for (int i=0;i<list01.size();i++)
        {
            System.out.println(list01.get(i).id());
        }
    }

}
class Apple{
    private static long counter;
    private final long id=counter++;
    public long id(){
        return id;
    }
}
class Orange{

}