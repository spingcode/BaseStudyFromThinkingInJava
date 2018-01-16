package im.fenqi.study.chapter17.part03;

import java.util.Arrays;

/*
*
*
* */
public class AssociativeArray<K,V> {
    private Object[][] pairs;
    private int index;

    public AssociativeArray(int length) {
        this.pairs = new Object[length][2];
    }
    public void put(K key,V value)
    {
        if(index>=pairs.length)
            throw new ArrayIndexOutOfBoundsException();
        pairs[index++]=new Object[]{key,value};
    }
    public V get(K key)
    {
        for (int i = 0; i < index; i++) {
            if(key.equals(pairs[index][0]))
            {
                return (V)pairs[index][1];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(pairs[i][0]+":"+pairs[i][1]);
            if (i<index-1)
                result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        AssociativeArray<String,String> map = new AssociativeArray<>(6);
        map.put("zouw","123");
        map.put("zouw01","abc");
        map.put("zouw02","#@$");
        map.put("zouw03","*&^");
        System.out.println("map:\n"+map);
    }
}
