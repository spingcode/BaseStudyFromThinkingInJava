package im.fenqi.study.chapter09.part01;

/**
 * @Author:zouw
 * @Description:
 * @Date:Created in 18:42 2018/1/20
 * @Modified By:
 */
public class FilterAdapter extends Processor {
    //可以通过组合也可以通过继承持有这个对象
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    Object process(Object input) {
        return filter.process((String) input);
    }
}
