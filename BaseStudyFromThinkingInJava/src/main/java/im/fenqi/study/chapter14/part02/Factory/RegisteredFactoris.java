package im.fenqi.study.chapter14.part02.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
* 14.4、工厂模式
*
* */
public class RegisteredFactoris {

    public static void main(String[] args) {
        for (int i=0;i<10;i++)
            System.out.println(Part.createRandom());
    }
}
class Part{
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> partFactory=new ArrayList<>();
    static {
        partFactory.add(new FuelFilter.Factory());
        partFactory.add(new AirFilter.Factory());
        partFactory.add(new CabinAirFilter.Factory());
    }
    private static Random random = new Random(47);
    public static Part createRandom()
    {
        int n=random.nextInt(partFactory.size());
        return partFactory.get(n).create();
    }
}
class Filter extends Part{}
class FuelFilter extends Filter{
    public static class Factory implements im.fenqi.study.chapter14.part02.Factory.Factory<FuelFilter>{
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
class AirFilter extends Filter{
    public static class Factory implements im.fenqi.study.chapter14.part02.Factory.Factory<AirFilter>{
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
class CabinAirFilter extends Filter{
    public static class Factory implements im.fenqi.study.chapter14.part02.Factory.Factory<CabinAirFilter>{
        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}