package im.fenqi.study.chapter19.part01;
/*
* 19.1、基本enum特性
*
* */
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s:Shrubbery.values())
        {
            //枚举声明时的顺序
            print(s+" ordinal: "+s.ordinal());
            print(s.compareTo(Shrubbery.CRAWLING)+" ");
            print(s.equals(Shrubbery.CRAWLING)+" ");
            print(s==Shrubbery.CRAWLING);
            //得到所属的类
            print(s.getDeclaringClass());
            print(s.name());
            //返回枚举对象
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s.name());
            Shrubbery shrubbery1 = Shrubbery.valueOf(s.name());
            print("--------------------------------");
        }
    }
    public static <T> void print(T str)
    {
        System.out.println(str);
    }

}
enum Shrubbery{GROUND,CRAWLING,HANGING}