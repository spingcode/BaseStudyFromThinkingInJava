package im.fenqi.study.chapter19.part01;
/*
* 19.2、枚举里面添加方法
* */
public enum OzWitch {
    WEST("Miss Gulch"),
    NORTH("Wiched"),
    EATH("sfds");
    private String description;

    OzWitch(String description) {
        this.description = description;
    }
    public String getDescription(){return description;}

    public static void main(String[] args) {
        for (OzWitch o:OzWitch.values())
        {
            System.out.println(o+" "+o.getDescription());
        }
    }
}
