package im.fenqi.study.chapter17.part01;

import im.fenqi.study.chapter16.part03.RandomGenerator;
/*
*
* 17.2.2、填充集合
* 17.2.3、（****************************************）
* */
public class MapDataTest {
    public static void main(String[] args) {
        MapData<Integer,String> mapData = MapData.map(new GenertedMap.GenertedPair(),10);
        System.out.println(mapData);
        MapData<Integer,String> mapData1 = MapData.map(new RandomGenerator.IntG(),"zouw",10);
        System.out.println(mapData1);
    }
}
