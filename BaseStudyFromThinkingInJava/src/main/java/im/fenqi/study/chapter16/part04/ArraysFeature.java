package im.fenqi.study.chapter16.part04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
* 16.7、Arrays实用功能
* */
public class ArraysFeature {
    public static void main(String[] args) {
        //1、复制数组
        int[] i=new int[7];
        int[] j= new int[10];
        Arrays.fill(i,47);
        Arrays.fill(j,99);
        print(Arrays.toString(i));
        print(Arrays.toString(j));
        System.arraycopy(i,0,j,0,i.length);
        print(Arrays.toString(i));
        print(Arrays.toString(j));

        Integer[] k = new Integer[10];
        Arrays.fill(k,100);
        //不支持自动包装和拆包
        //System.arraycopy(i,0,k,0,i.length);

        //2、数组比较
        int[] a1= new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1,47);
        Arrays.fill(a2,47);
        System.out.println(Arrays.equals(a1,a2));
        a2[3]=11;
        System.out.println(Arrays.equals(a1,a2));

        //3、数组元素的比较
        Employ[] e = {new Employ(9,10),new Employ(3,5)};
        print("before:"+Arrays.toString(e));
        Arrays.sort(e);
        print("after:"+Arrays.toString(e));
        Arrays.sort(e, Collections.reverseOrder());
        print("reverse After:"+Arrays.toString(e));
        Arrays.sort(e,new MyCompator());
        print("MyCompator After:"+Arrays.toString(e));


        //4、在数组里面查找：下面介绍的方法必须在排序之后
        Integer[] f = {2,3,5,78,8,9,4,3,2,53,5,6};
        Arrays.sort(f);
        int location = Arrays.binarySearch(f,53);
        System.out.println(location);
    }
    public static  void print(String string)
    {
        System.out.println(string);
    }
}
class MyCompator implements Comparator<Employ>
{

    @Override
    public int compare(Employ o1, Employ o2) {
        return o1.y-o2.y;
    }
}
class Employ implements Comparable<Employ>
{
    int x;
    int y;

    public Employ(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Employ o) {
        return this.x>o.x?1:-1;
    }
}