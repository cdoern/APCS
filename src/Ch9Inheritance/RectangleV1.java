package Ch9Inheritance;

public class RectangleV1 implements ShapeV1 {
    //state fields
    private double w;
    private double h;

    //constructor
    public RectangleV1(double w, double h){
        this.w = w;
        this.h = h;
    }
    //methods
    public double area(){
        return(w*h);
    }
    public double perimeter(){
        return((2*w)+(2*h));
    }
}
