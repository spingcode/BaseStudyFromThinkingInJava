package im.fenqi.study.chapter15.part01;
/*
* 测试元组
* */
public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return new TwoTuple<String, Integer>("hi",47);
    }
    public static void main(String[] args) {
            System.out.println(f());
    }
}
