package Ch9Inheritance;
//Shape is an interface with only two methods in it -
//Area and perimeter, any class that implements shape is responsible to implement its inherited area and perimeter methods
public abstract class ShapeV2 implements Comparable {
public abstract double area();
public abstract double perimeter();

public int compareTo(Object other){
    if(((ShapeV2)(other)).area() > this.area()){
        return 1;
    }
    else if(((ShapeV2)(other)).area() == this.area()){
        return 0;
    }
    else {
        return -1;
    }
}

}
