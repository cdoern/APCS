package Ch8Classes;

public class PointV1 {

    //state fields for point class
    //synonyms: state, state fields, fields, instance variables
    public int x;
    public int y;

    //behaviors for point class (methods, object methods)
    public void translate(int dx, int dy){
        x+=dx;
        y+=dy;
    }
    public void setLocation(int xnew, int ynew){
        x=xnew;
        y=ynew;
    }
    public double distance(PointV1 other){
       return (Math.sqrt((Math.pow((other.x-x),2))+(Math.pow((other.y-y),2))));
    }
    public static double distancetwo(PointV1 second, PointV1 first){
        return (Math.sqrt((Math.pow((second.x-first.x),2))+(Math.pow((second.y-first.y),2))));
    }
   /* public double distanceFromOrigin(PointV1 other){
        return;
    }
    */
}
