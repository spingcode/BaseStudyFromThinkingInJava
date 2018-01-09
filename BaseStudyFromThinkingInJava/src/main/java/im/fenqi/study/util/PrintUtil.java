package im.fenqi.study.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/*
* 打印各种数据类型
* */
public class PrintUtil {
    public static void print(Collection<String> collection)
    {
        System.out.println(Arrays.toString(collection.toArray()));
    }
    public static void print(Map<String,String> map)
    {
        System.out.println(map.toString());
    }
}
