package im.fenqi.study.chapter14.part01;
/*
* 14.2.2、泛化的Class引用：
*
* */
public class GenericClassReferences {
    public static void main(String[] args) throws Exception{
        //普通的Class引用,可以接收所以得class类型
        Class c01 = int.class;
        c01 = double.class;
        c01 = GenericClassReferences.class;

        //使用通配符？:和普通的类似但是可以被编译器检查
        Class<?> c02 = int.class;
        c02 = double.class;
        c02=Float.class;

        Class<Integer> c03 = int.class;
        c03 = Integer.TYPE;
        //c03 = Double.TYPE;

        //使用Class引用创建对象
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();

        //ftClass.getSuperclass():得到的是父类，不能使用Class<Toy>接收
        Class<? super FancyToy> up = ftClass.getSuperclass();
        Object obj = up.newInstance();

        Toy t = new FancyToy();
        //下面两个操作一样，一个是用字节码一个用类型
        FancyToy ft = ftClass.cast(t);
        ft = (FancyToy) t;
    }
}
