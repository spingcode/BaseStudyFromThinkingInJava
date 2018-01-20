package im.fenqi.study.chapter09.part02;

/**
 * @Author:zouw
 * @Description: 9.5、接口和接口之间的关系
 * @Date:Created in 18:59 2018/1/20
 * @Modified By:
 */
public class HorrorShow {
}
interface Monster{
    void menace();
}
interface Dangerousmonster extends Monster{
    void destroy();
}
interface Lethal{
    void kill();
}
class DragonZilla implements Dangerousmonster{
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
}
interface Vamire extends Dangerousmonster,Lethal{
    void drinkBlood();
}
class VeryBadVampire implements Vamire{
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}