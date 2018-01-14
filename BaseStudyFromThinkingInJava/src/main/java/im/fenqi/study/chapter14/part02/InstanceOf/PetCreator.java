package im.fenqi.study.chapter14.part02.InstanceOf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {
    private Random random = new Random(47);
    public abstract List<Class<? extends Pet>> types();
    public Pet PetRandom(){
        int n=random.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Pet[] createArray(int size)
    {
        Pet[] result = new Pet[size];
        for (int i=0;i<size;i++)
            result[i]=PetRandom();
        return result;
    }
    public ArrayList<Pet> arrayList(int size)
    {
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result,createArray(size));
        return result;
    }
}
