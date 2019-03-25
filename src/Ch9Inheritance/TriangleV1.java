package Ch9Inheritance;

public class TriangleV1 implements ShapeV1 {
    //state fields
    private double a;
    private double b;
    private double c;

    //constructor
    public TriangleV1(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    //methods
    public double area(){
        double s = .50 * (a + b + c);
       return(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    public double perimeter(){
        return(a+b+c);
    }
}
