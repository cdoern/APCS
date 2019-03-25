package Ch9Inheritance;

import java.util.ArrayList;

public class ShapeClientV2 {
    public static void main(String[] args) {
       ArrayList<ShapeV2> shapes = new ArrayList<ShapeV2>();
        shapes.add(new TriangleV2(4,5,6));
        shapes.add(new CircleV2(6));
        shapes.add(new RectangleV2(4,5));
        int compareArea = shapes.get(1).compareTo(shapes.get(2));
        if(compareArea > 0){
            System.out.println("Triangle has larger area than circle");
        }
        if(compareArea < 0){
            System.out.println("Circle has larger area than triangle");
        }

        for(ShapeV2 shape : shapes){
            System.out.println("Area: "+shape.area());
            System.out.println("Perimeter: "+shape.perimeter());
            System.out.println("");

        }
    }
}