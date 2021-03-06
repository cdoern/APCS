package Ch8Classes;

public class PointV4 {

    //state fields for point class
    //synonyms: state, state fields, fields, instance variables

        private int x;
        private int y;
        //static fields are owned by the class not the obj, they reside in classes
        private static int objCount;
    //constructor for the point class
    //a constructor has no return type
    //constructors only job is to initialize the state field
    public PointV4(int x, int y) {
        objCount++;
       this.x = x;
       this.y = y;
    }

    public PointV4(){
        objCount++;
        x = 0;
        y = 0;

    }

    //behaviors for point class (methods, object methods)
    public void translate(int x, int y){
        this.x+=x;
        this.y+=y;
    }
    public void setLocation(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double distance(PointV4 other){
       return (Math.sqrt((Math.pow((other.x-x),2))+(Math.pow((other.y-y),2))));
    }
    public static double distancetwo(PointV4 second, PointV4 first){
        return (Math.sqrt((Math.pow((second.x-first.x),2))+(Math.pow((second.y-first.y),2))));
    }
    public int getX(){
        return(x);
    }
    public static int getObjCount(){
        return objCount;
    }
    public int getY(){
        return(y);
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public String toString(){
        return("("+x+","+y+")");
    }


}
