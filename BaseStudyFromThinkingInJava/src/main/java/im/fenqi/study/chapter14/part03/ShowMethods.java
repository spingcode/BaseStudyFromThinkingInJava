package im.fenqi.study.chapter14.part03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/*
* 反射的操作：在运行的时候获取class文件并且检查
*
* */
public class ShowMethods {
    private static String usage="no input";

    //private static Pattern p = Pattern.compile("\\w+\\.");
    private static Pattern p = Pattern.compile("\\w+\\.|native|final");
    public static void main(String[] args) {
        if (args.length<1)
        {
            System.out.println(usage);
            System.exit(0);
        }
        int lines=0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor<?>[] ctors = c.getConstructors();
            if(args.length==1)
            {
                for (Method method:methods)
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                for (Constructor ctor:ctors)
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
            }
            try {
                //反射进行创建对象
                Object o = ctors[0].newInstance();
                System.out.println(o);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
