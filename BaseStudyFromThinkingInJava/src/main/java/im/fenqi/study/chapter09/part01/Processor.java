package im.fenqi.study.chapter09.part01;

/**
 * @Author:zouw
 * @Description:创建一个基类
 * @Date:Created in 18:29 2018/1/20
 * @Modified By:
 */
public class Processor {
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}
