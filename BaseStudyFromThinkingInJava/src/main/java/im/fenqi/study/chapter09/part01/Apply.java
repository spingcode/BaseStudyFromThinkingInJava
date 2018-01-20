package im.fenqi.study.chapter09.part01;

/**
 * @Author:zouw
 * @Description: 用来处理Processor接口的类
 * @Date:Created in 18:32 2018/1/20
 * @Modified By:
 */
public class Apply {
    public static void process(Processor p,Object s){
        System.out.println(p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {

        //当我自己创建的类的时候只要想使用这个类只要继承Processor即可
        process(new Splitter(),"zouw01");
        //但是有一个类Filter和Processor有类似的接口元素也想使用这个类处理问题，但是这个类是别人维护的，可以使用适配器设计原则进行处理
        process(new FilterAdapter(new LowPass()),"zouw02");
    }
}

