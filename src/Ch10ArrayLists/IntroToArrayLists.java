package Ch10ArrayLists;
import java.util.ArrayList;

public class IntroToArrayLists {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Charlie");
        System.out.println(names);
        names.add(0, "Andrew");
        System.out.println(names);

    }
}
