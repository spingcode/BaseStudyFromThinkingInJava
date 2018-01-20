package im.fenqi.study.chapter09.part01;

/**
 * @Author:zouw
 * @Description:
 * @Date:Created in 18:38 2018/1/20
 * @Modified By:
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public String process(String input){
        return input;
    }
}
