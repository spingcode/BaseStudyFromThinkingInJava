package im.fenqi.study.chapter19.part02;
/*
*测试随机产生对象
* */
public class EnumsTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(Enums.random(Activity.class)+" ");
        }
    }
}
enum Activity{SITTING,LYING,STANDING}