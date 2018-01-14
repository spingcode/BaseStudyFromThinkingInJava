package im.fenqi.study.chapter16.part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 16.5、数组和泛型
* */
public class ParameterizedArrayType {
    public static <T> void main(String[] args) {

        //1、错误,不能创建泛型数组
        //List<Integer>[] listArray = new ArrayList<Integer>[10];
       // T[] t = new T[10];

        //2、方法参数化和类参数化，方法参数化优先
        Integer[] ints={1,2,3,4,5,6};
        System.out.println(Arrays.toString(MethodParameter.f(ints)));

        //3、创建泛型数组
        T[] tt = (T[]) new Object[10];
        List[] ls01 = new List[10];
        List<String>[] ls02 =( List<String>[])new List[10];
       // ls02[0] = new ArrayList<Integer>();
        ls02[0] = new ArrayList<String>();

    }
}
class ClassParameter<T>{
    public  T[] f(T[] args){
        return args;
    }
}
class MethodParameter{
    public static <T> T[] f(T[] args)
    {
        return args;
    }
}
