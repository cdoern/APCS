package Ch9Inheritance;

import java.util.ArrayList;

public class ShapeClientV1 {
    public static void main(String[] args) {
       ArrayList<ShapeV1> shapes = new ArrayList<ShapeV1>();
        shapes.add(new TriangleV1(4,5,6));
        shapes.add(new CircleV1(6));
        shapes.add(new RectangleV1(4,5));
        for(ShapeV1 shape : shapes){
            System.out.println("Area: "+shape.area());
            System.out.println("Perimeter: "+shape.perimeter());
            System.out.println("");

        }
    }
}