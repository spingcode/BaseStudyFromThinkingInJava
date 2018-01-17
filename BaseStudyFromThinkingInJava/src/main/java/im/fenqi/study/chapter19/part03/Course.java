package im.fenqi.study.chapter19.part03;

import im.fenqi.study.chapter19.part02.Enums;

public enum Course {
    AppETIZER(Food.Appetizer.class);

    Course(Class<? extends Food> kind) {
        this.values = kind.getEnumConstants();
    }
    private Food[] values;
    public Food randomSelection()
    {
        return Enums.random(values);
    }
}
