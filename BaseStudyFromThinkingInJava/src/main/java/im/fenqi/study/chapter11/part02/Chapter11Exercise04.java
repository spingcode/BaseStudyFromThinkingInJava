package im.fenqi.study.chapter11.part02;

import java.util.ArrayList;
import java.util.List;

/*
* 11.4、练习四
* */
public class Chapter11Exercise04 {
    static  List<String> list = fill(new ArrayList<String>());
    static int i=0;
    static List fill(List<String> list)
    {
        list.add("film01");
        list.add("film02");
        list.add("film03");
        list.add("film04");
        list.add("film05");
        return  list;
    }

    public static void main(String[] args) {
        int j=0;
        while(j++<10)
        {
            System.out.println(next());
        }
    }
    public static String next()
    {
        if(i==list.size())
            i=0;
       return list.get(i++);
    }
}
