package Ch10ArrayLists;
import java.util.*;
import java.io.*;
public class ArrayListExercise {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        File fi = new File("data.txt");
        Scanner in = new Scanner(fi);
        while (in.hasNextLine()) {
            list.add(in.next());
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Scanner in2 = new Scanner(fi);
        ArrayList<String> list2 = new ArrayList<String>();
        while (in2.hasNextLine()) {
            String str = in2.next();
            if (str.charAt(str.length() - 1) == 's') {
                String str2 = str.substring(0, 1).toUpperCase();
                str = str2 + str.substring(1);
                list2.add(str);
            } else {
                list2.add(str);
            }
        }
        System.out.println(list2);
        Scanner in3 = new Scanner(fi);
        ArrayList<String> list3 = new ArrayList<String>();
        while (in3.hasNextLine()) {
            String str = in3.next();
            if (str.charAt(str.length() - 1) == 's') {
                list3.remove(str);
            } else {
                list3.add(str);
            }
        }
        System.out.println(list3);
    }
}
