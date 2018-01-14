package im.fenqi.study.chapter15.part04;

import im.fenqi.study.chapter15.part02.Generator;
import im.fenqi.study.chapter15.part03.BaseGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*15.10:这一小节还需要认真研究（****************************）
* */
public class CompilerIntelligence {
    public static void main(String[] args) {
       /* 这个操作不行
       List<? extends Generator> first = new ArrayList<>();
        first.add(new BaseGenerator(String.class));*/
       List<? extends Generator> flist = Arrays.asList(new BaseGenerator(String.class));
       BaseGenerator<String> b = (BaseGenerator<String>) flist.get(0);
       System.out.println(b.getClass().getSimpleName());
       System.out.println(flist.contains(new BaseGenerator<String>(String.class)));

    }
}
