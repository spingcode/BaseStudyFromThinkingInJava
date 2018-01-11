package im.fenqi.study.chapter14.part02.InstanceOf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* 使用字面量进行加载类，PetCreator的一种实现方法
*
* */
public class LiteralPetCreator extends PetCreator{
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
    //产生不可修改的列表
    public static final List<Class<? extends Pet>> allTypes= Collections.unmodifiableList(Arrays.asList(
       Pet.class,Cat.class,Dog.class,Mutt.class,Pug.class
    ));
    private static  final List<Class<? extends Pet>> types=allTypes.subList(allTypes.indexOf(Cat.class),allTypes.size());
}
