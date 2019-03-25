package Ch9Inheritance;
//implements the interface shape ad is responsible to implement all of the methods from shape
public class CircleV1 implements ShapeV1 {
    //state fields
    private double radius;

    //constructor
    public CircleV1(double radius){
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
