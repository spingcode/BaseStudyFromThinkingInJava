package im.fenqi.study.chapter14.part02.InstanceOf;
/*
* 对另一种方法进行测试
*
* */
public class PetCount02 {
    public static void main(String[] args) {
        PetCount.countPets(new LiteralPetCreator());
    }
}
