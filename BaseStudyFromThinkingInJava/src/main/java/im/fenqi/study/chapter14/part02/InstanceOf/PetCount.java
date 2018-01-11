package im.fenqi.study.chapter14.part02.InstanceOf;

import java.util.HashMap;
/*
* 统计类型的个数：
*       使用类模版设计模式，使用instanceof
* */
public class PetCount {
    static class PetCounter extends HashMap<String,Integer>{
        public void count(String type)
        {
            Integer n = get(type);
            if(n==null)
                put(type,1);
            else
                put(type,n+1);
        }
    }
    public static void countPets(PetCreator petCreator)
    {
        PetCounter petCounter = new PetCounter();
        for (Pet pet:petCreator.createArray(20))
        {
            System.out.println(pet.getClass().getSimpleName()+" ");
            if (pet instanceof Pet)
                petCounter.count("Pet");
            if (pet instanceof Dog)
                petCounter.count("Dog");
            if (pet instanceof Mutt)
                petCounter.count("Mutt");
            if (pet instanceof Pug)
                petCounter.count("Pug");
            if (pet instanceof Cat)
                petCounter.count("Cat");
        }
        System.out.println(petCounter);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
class Individual{
    public String name;
    public Individual() {
    }
    public Individual(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Pet extends Individual{
    public Pet() {
        super();
    }

    public Pet(String name) {
        super(name);
    }
}
class Dog extends Pet{
    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }
}
class Mutt extends Dog{
    public Mutt() {
    }

    public Mutt(String name) {
        super(name);
    }
}
class Pug extends Dog{

    public Pug(String name) {
        super(name);
    }
    public Pug() {

    }
}
class Cat extends Pet{
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
}