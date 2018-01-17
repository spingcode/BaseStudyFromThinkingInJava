package im.fenqi.study.chapter19.part03;

public class Meal {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
           for(Course c:Course.values())
           {
               Food food = c.randomSelection();
               System.out.println(food);
           }
           System.out.println("----------------------------");
        }
    }
}
