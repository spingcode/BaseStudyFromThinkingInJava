package im.fenqi.study.chapter11.part01;

import java.util.ArrayList;
/*
* 11.1�����ͱ�֤�����İ�ȫ���У�һ����������ֻ��һ������
*   �ڣ�1������������ʹ�÷���ʱĬ����Object���ͣ������е�ʱ�򱨴�
*   �ڣ�2����ʹ�÷��ͱ�֤�����ڱ����ʱ����
*
* */
public class AppleAndOrangeWithoutGenerics01 {
    public static void main(String[] args) {
        /*
        * (1)
        * */
        ArrayList list = new ArrayList();
        list.add(new Apple());
        list.add(new Apple());
        list.add(new Apple());
        list.add(new Orange());
        for (int i=0;i<list.size();i++)
        {
            //((Apple)list.get(i)).id();
        }
        ArrayList<Apple> list01 = new ArrayList<Apple>();
        list01.add(new Apple());
        list01.add(new Apple());
        list01.add(new Apple());
        //list01.add(new Orange());
        for (int i=0;i<list01.size();i++)
        {
            System.out.println(list01.get(i).id());
        }
    }

}
class Apple{
    private static long counter;
    private final long id=counter++;
    public long id(){
        return id;
    }
}
class Orange{

}