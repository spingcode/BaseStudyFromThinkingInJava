package im.fenqi.study.chapter11.part01;

import java.util.ArrayList;

/*
 * AppleAndOrangeWithoutGenerics01基础上，创建几个Apple的子类也可以放到list01容器里面
 * */
public class GenericsAndUpcasting02 {
    public static void main(String[] args) {
        ArrayList<Apple> list02 = new ArrayList<Apple>();
        list02.add(new GrannySmith());
        list02.add(new Gala());
        list02.add(new Fuji());
        list02.add(new Braeburn());
        for (int i=0;i<list02.size();i++)
        {
            System.out.println(list02.get(i).id());
        }
        for (Apple c:list02)
        {
            System.out.println(c);
        }
    }
}
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}