package im.fenqi.study.chapter19.part03;

import java.util.EnumSet;

/*
* EnumSet的使用
* */
public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> enumSet = EnumSet.noneOf(AlarmPoints.class);
        enumSet.add(AlarmPoints.STAIR1);
        print(enumSet);
        enumSet.addAll(EnumSet.of(AlarmPoints.OFFICE1,AlarmPoints.OFFICE2));
        print(enumSet);
        enumSet = EnumSet.allOf(AlarmPoints.class);
        print(enumSet);
        enumSet.removeAll(EnumSet.of(AlarmPoints.STAIR1,AlarmPoints.STAIR2));
        print(enumSet);
        enumSet.removeAll(EnumSet.range(AlarmPoints.OFFICE1,AlarmPoints.OFFICE4));
        print(enumSet);
        //得到剩下的元素
        enumSet= EnumSet.complementOf(enumSet);
        print(enumSet);
    }

    public static <T> void print(T str)
    {
        System.out.println(str);
    }
}
enum AlarmPoints{
    STAIR1,STAIR2,LOBBY,OFFICE1,OFFICE2,OFFICE3,OFFICE4,BATHROOM,UTILITY,KITCHEN;
}
