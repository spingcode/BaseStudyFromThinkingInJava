package im.fenqi.study.chapter09.part01;

/**
 * @Author:zouw
 * @Description:
 * @Date:Created in 18:41 2018/1/20
 * @Modified By:
 */
public class LowPass extends Filter {
    @Override
    public String process(String input) {
        return "LowPass"+input;
    }
}
