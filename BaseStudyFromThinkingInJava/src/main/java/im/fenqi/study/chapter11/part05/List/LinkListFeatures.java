package im.fenqi.study.chapter11.part05.List;

import im.fenqi.study.util.Pets;

import java.util.LinkedList;
import static im.fenqi.study.util.PrintUtil.*;
/*
 * 11.7、LinkedList
 * */
public class LinkListFeatures {
    public static void main(String[] args) {
        LinkedList<Pets> pets = new LinkedList<>(Pets.arrayList(5));
        print(pets);
        //下面3个类似，只有当列表为空的时候peek返回空，上面2个抛异常
        print("getFrist():"+pets.getFirst());
        print("element():"+pets.element());
        print("peek():"+pets.peek());

        //前两个完全一样，移除第一个元素并且返回,poll为空的时候返回空
        print("remove():"+pets.remove());
        print("removeFrist():"+pets.removeFirst());
        print("poll():"+pets.poll());

        //插入第一个
        pets.addFirst(new Pets(200));
        print("addFrist():"+pets);

        //插入最后一个位置
        pets.offer(new Pets(250));
        print("offer():"+pets);
        pets.add(new Pets(300));
        print("add():"+pets);
        pets.addLast(new Pets(350));
        print("addLast():"+pets);

        print("removeLast():"+pets.removeLast());


    }
}