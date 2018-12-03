package Ch8Classes;

public class PointV3 {

    //state fields for point class
    //synonyms: state, state fields, fields, instance variables

        public int x;
        public int y;
    //constructor for the point class
    //a constructor has no return type
    public PointV3(int inx, int iny) {
        x = inx;
        y = iny;
    }

    public PointV3(){
        x = 0;
        y = 0;

    }

    //behaviors for point class (methods, object methods)
    public void translate(int dx, int dy){
        x+=dx;
        y+=dy;
    }
    public void setLocation(int xnew, int ynew){
        x=xnew;
        y=ynew;
    }
    public double distance(PointV3 other){
       return (Math.sqrt((Math.pow((other.x-x),2))+(Math.pow((other.y-y),2))));
    }
    public static double distancetwo(PointV3 second, PointV3 first){
        return (Math.sqrt((Math.pow((second.x-first.x),2))+(Math.pow((second.y-first.y),2))));
    }
   /* public double distanceFromOrigin(PointV1 other){
        return;
    }
    */
}
