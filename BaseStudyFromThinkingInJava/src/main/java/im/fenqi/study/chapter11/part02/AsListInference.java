package im.fenqi.study.chapter11.part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* Arrays.asList的使用
* */
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow01 = Arrays.asList(new Light(),new Crusty());
        //Arrays.asList(new Light(),new Heavy())生成的是List<Powder>，不是List<Snow>类型
       // List<Snow> snow02 = Arrays.asList(new Light(),new Heavy());
        List<Snow> snow03 = new ArrayList<Snow>();
        Collections.addAll(snow03,new Light(),new Heavy());
        List<Snow> snow04 = Arrays.<Snow>asList(new Light(),new Heavy());
    }

}
