package im.fenqi.study.chapter14.part02.InstanceOf;

import java.util.ArrayList;
import java.util.List;
/*
* 使用ForName进行加载类，PetCreator的一种实现方法
* */
public class ForNameCreator extends PetCreator {
    private  static List<Class<? extends Pet>> types=new ArrayList<>();
    private static String[] typeNames = {
            "im.fenqi.study.chapter14.part02.InstanceOf.Pet",
            "im.fenqi.study.chapter14.part02.InstanceOf.Cat",
            "im.fenqi.study.chapter14.part02.InstanceOf.Pug",
            "im.fenqi.study.chapter14.part02.InstanceOf.Mutt",
            "im.fenqi.study.chapter14.part02.InstanceOf.Dog"
    };
    private static void loader()
    {
        for (String typeName:typeNames) {
            try {
                types.add((Class<? extends Pet>)Class.forName(typeName));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    static {
        loader();
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
