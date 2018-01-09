package im.fenqi.study.chapter14.part01;

import java.util.Arrays;
import java.util.List;

/*
* 14.1、运行时类型，多态的基本应用
*
* */
public class Shapes {
    public static void main(String[] args) {
        List<Shape> list = Arrays.asList(new Circle(),new Square(),new Triangle());
        for (Shape shape:list)
            shape.draw();
    }
}
 abstract class Shape{
    void draw(){
        System.out.println(this+".draw()");
    }
    abstract public String toString();
}
class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}
class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}
class Triangle extends Shape{
    @Override
    public String toString() {
        return "Triangle";
    }
}
