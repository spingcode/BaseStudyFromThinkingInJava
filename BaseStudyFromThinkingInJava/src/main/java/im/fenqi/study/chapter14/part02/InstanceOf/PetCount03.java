package im.fenqi.study.chapter14.part02.InstanceOf;

import java.util.LinkedHashMap;
import java.util.Map;

/*
* 使用isInstance进行测试
* isInstance：是Class类的方法，参数是对象
*  Dog.class.isInstance(pet):pet对是不是Dog类型？？？
*  isInstance和Instanceof：表示是这个类吗或者是这个类的子类吗？？
*  和==以及equal不同。
* */
public class PetCount03 {
    static class  PetCounter extends LinkedHashMap<Class<? extends Pet>,Integer>{
        public PetCounter() {
            //Pet.class,Cat.class,Dog.class,Mutt.class,Pug.class
            put(Pet.class,0);
            put(Cat.class,0);
            put(Dog.class,0);
            put(Mutt.class,0);
            put(Pug.class,0);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Class<? extends Pet>,Integer> pair:entrySet())
            {
                sb.append(pair.getKey().getSimpleName()+":"+pair.getValue());
                sb.append("\n");
            }
            return sb.toString();
        }

        public void count(Pet pet)
        {
            for (Map.Entry<Class<? extends Pet>,Integer> pair:entrySet())
            {
                //Dog.class.isInstance(pet):pet对是不是Dog类型？？？
                if(pair.getKey().isInstance(pet))
                    put(pair.getKey(),pair.getValue()+1);
            }
        }
    }

    public static void main(String[] args) {
        PetCounter counter = new PetCounter();
        for (Pet pet:new LiteralPetCreator().createArray(20))
            counter.count(pet);
        System.out.println(counter);
    }
}
