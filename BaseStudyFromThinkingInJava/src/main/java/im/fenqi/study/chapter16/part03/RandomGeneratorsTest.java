package im.fenqi.study.chapter16.part03;

import im.fenqi.study.chapter15.part02.Generator;

/*
*
* */
public class RandomGeneratorsTest {
    public static int size=10;
    public static void main(String[] args) {
        test(RandomGenerator.class);
    }
    public static void test(Class<?> testClass)
    {
        for (Class<?> type:testClass.getClasses()) {
            try {
                Generator<?> g= (Generator<?>) type.newInstance();
                for (int i=0;i<size;i++)
                    System.out.println(g.next()+" ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
