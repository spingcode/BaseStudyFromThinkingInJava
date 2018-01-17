package im.fenqi.study.chapter19.part02;

import java.util.Random;

/*
* 19.6、随机产生枚举对象
* */
public class Enums {
    private static Random rand = new Random(47);
    public static <T extends Enum<T>> T random(Class<T> cls)
    {
        return random(cls.getEnumConstants());
    }
    public static <T> T random(T[] values)
    {
        return values[rand.nextInt(values.length)];
    }
}
