package im.fenqi.study.chapter19.part04;

import java.text.DateFormat;
import java.util.Date;

/*
*19.10、常量相关的方法
* 枚举类里面如果有抽象方法那么在枚举项里面必须实现该方法
* */
public enum ConstantSpecificMethod {
    DATE_TIME{
        @Override
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH{
        @Override
        String getInfo() {

            return System.getenv("CLASSPATH");
        }
    },
    VERSION{
        @Override
        String getInfo() {
            return System.getProperty("java.version");
        }

        @Override
        public void print() {
            System.out.println("override");
        }
    };
    abstract String getInfo();

    public void  print()
    {
        System.out.println("default");
    }
    public static void main(String[] args) {
        for (ConstantSpecificMethod c:ConstantSpecificMethod.values())
        {
            System.out.println(c.getInfo());
            c.print();
        }
    }
}
