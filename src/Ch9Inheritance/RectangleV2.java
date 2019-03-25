package Ch9Inheritance;

public class RectangleV2 extends ShapeV2 {
    //state fields
    private double w;
    private double h;

    //constructor
    public RectangleV2(double w, double h){
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
