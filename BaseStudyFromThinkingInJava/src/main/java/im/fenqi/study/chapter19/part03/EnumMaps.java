package im.fenqi.study.chapter19.part03;

import java.util.EnumMap;
import java.util.Map;

/*
* 19.9、使用EnumMap
*
* */
public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints,Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(AlarmPoints.KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fire");
            }
        });
        em.put(AlarmPoints.BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("Bathroom alert");
            }
        });
        for (Map.Entry<AlarmPoints,Command> e:em.entrySet())
        {
            System.out.print(e.getKey()+":");
            e.getValue().action();
        }
        try {
            em.get(AlarmPoints.BATHROOM).action();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

interface Command{
    void action();
}