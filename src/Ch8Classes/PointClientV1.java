package Ch8Classes;


public class PointClientV1 {
    public static void main(String[] args){
        //instantiate a point object at (0,0)
        //p1 is an object of the type PointV1
        PointV1 p1 = new PointV1();
        PointV1 p2 = new PointV1();
        System.out.println("x = " +p1.x+" y = "+p1.y);
        p1.x = 5;
        p1.y = 7;
        System.out.println("x = " +p1.x+" y = "+p1.y);
        p2.translate(5,4);
        System.out.println("x = " +p2.x+" y = "+p2.y);
        System.out.println(p1.distance(p2));
        System.out.println(PointV1.distancetwo(p1,p2));
    }
}
