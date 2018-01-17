package im.fenqi.study.chapter19.part02;
/*
*19.3、可以使用在switch里面
* values：是枚举类的方法，不是Enum方法。
* 所有的枚举类都是继承Enum类，所以枚举类不能再继承了，可以实现
* */
public class TrafficLight {
    Signal color = Signal.RED;
    public void change(){
        switch (color){
            case RED:
                        color = Signal.GREEN;
                        break;
            case GREEN:
                        color = Signal.YELLOW;
                        break;
            case YELLOW:
                        color =Signal.RED;
                        break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light is "+color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
        //values是Signal方法不是Enum方法
        Enum e = Signal.RED;
        Signal s= Signal.RED;
        s.values();
        Signal.values();

    }
}
enum Signal {GREEN,YELLOW,RED}