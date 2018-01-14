package im.fenqi.study.chapter16.part03;

import im.fenqi.study.chapter15.part02.Generator;

import java.util.Random;

/*
* 16.6.2、随机产生数据
* */
public class RandomGenerator {
    private static Random random = new Random(47);
    public static class BooleanG implements Generator<Boolean>{
        @Override
        public Boolean next() {
            return random.nextBoolean();
        }
    }
    public static class ByteG implements Generator<Byte>{

        @Override
        public Byte next() {
            return (byte)random.nextInt();
        }
    }
    public static class IntG implements Generator<Integer>{

        @Override
        public Integer next() {
            return random.nextInt();
        }
    }
}
