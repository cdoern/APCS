package Ch8Classes;


public class PointClientV1 {
    public static void main(String[] args){
        //creates a point at (0,0)
        PointV1 p1 = new PointV1();
        System.out.println("x = " +p1.x+" y = "+p1.y);
        p1.x = 5;
        p1.y = 7;
        System.out.println("x = " +p1.x+" y = "+p1.y);
    }
}
