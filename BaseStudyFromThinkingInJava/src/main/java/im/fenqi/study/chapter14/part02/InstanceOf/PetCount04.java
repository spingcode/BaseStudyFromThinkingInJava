package im.fenqi.study.chapter14.part02.InstanceOf;

import java.util.HashMap;
import java.util.Map;

/*
* 递归计数：主要使用baseType.isAssignableFrom(type)
* 这个也是Class方法，参数也是Class类型
* baseType.isAssignableFrom(type)：type对应的类型是baseType对应的类型吗？？？？？
* */
public class PetCount04 {
    public static void main(String[] args) {
        TypeCount typeCount = new TypeCount(Pet.class);
        Pet[] p=new LiteralPetCreator().createArray(20);
        for (Pet pet:p)
            typeCount.count(pet);
        System.out.println(typeCount);
    }
}
class TypeCount extends HashMap<Class<?>,Integer>{
    private Class<?> baseType;
    public TypeCount(Class<?> baseType) {
        this.baseType = baseType;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Class<?>,Integer> pair:entrySet())
        {
            sb.append(pair.getKey().getSimpleName()+":"+pair.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }
    public void count(Object obj)
    {
        Class<?> type = obj.getClass();
        if (!baseType.isAssignableFrom(type))
            throw new RuntimeException(obj+" incorrect type");
        countClass(type);
    }
    public void countClass(Class<?> type)
    {
        Integer num= get(type);
        put(type,num==null?1:num+1);
        Class<?> superClass = type.getSuperclass();
        if(superClass!=null&&baseType.isAssignableFrom(superClass))
            countClass(superClass);
    }
}
