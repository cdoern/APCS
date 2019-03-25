package Ch9Inheritance;

import Ch9Inheritance.ShapeV1;

//implements the interface shape ad is responsible to implement all of the methods from shape
public class CircleV2 extends ShapeV2 {
    //state fields
    private double radius;

    //constructor
    public CircleV2(double radius){
        this.radius = radius;

    }
    //methods
    public double area(){
        return(Math.PI * Math.pow(radius,2));
    }
    public double perimeter(){
        return(2*Math.PI*radius);
    }
}
