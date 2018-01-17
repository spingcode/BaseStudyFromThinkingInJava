package im.fenqi.study.chapter19.part03;

import im.fenqi.study.chapter19.part02.Enums;

/*
* 重新组织代码
*
* */
public enum Meal2 {
    APPETIZER(Food.Appetizer.class);

    Meal2(Class<? extends Food> kind) {
        this.values = kind.getEnumConstants();
    }
    private Food[] values;
    public interface Food {
        enum Appetizer implements Food {
            SALAD,SOUP,SPRING_ROLLS;
        }
        enum MainCourse implements Food {
            LASAGNE,BURRITO,PAD_THAI,
            LENTILS,HUMMOUS,VINDALOO;
        }
        enum Dessert implements Food {
            TIRAMISU,GELATO,BLACK_FOREST_CAKE,
            FRUIT,CREME_CARAMEL;
        }
        enum Coffee implements Food {
            BLACK_COFFEE,DECAF_COFFEE,
            ESPRESSD,LATTE,CAPPUCCINO;
        }
    }
    public Food randomSelection()
    {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(Meal2 c:Meal2.values())
            {
                Food food = c.randomSelection();
                System.out.println(food);
            }
            System.out.println("----------------------------");
        }
    }
}
