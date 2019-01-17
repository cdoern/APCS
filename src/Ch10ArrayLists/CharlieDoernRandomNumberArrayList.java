package Ch10ArrayLists;
import java.util.*;
import java.io.*;
public class CharlieDoernRandomNumberArrayList {
public static void main(String[] args)throws FileNotFoundException{
    ArrayList<String> list = new ArrayList<String>();
    File fi = new File("randomNumbers.txt");
    Scanner in = new Scanner(fi);
    while(in.hasNextLine()){
        String string = in.nextLine();
        Scanner scan = new Scanner(string);
        while(scan.hasNext()) {
            list.add(scan.next());
        }
    }
    System.out.println(list);
    double total = 0.0;
    int amount = list.size();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < list.size(); i++){
        total+=Integer.parseInt(list.get(i));
        if(Integer.parseInt(list.get(i)) > max){
            max = Integer.parseInt(list.get(i));
        }
        if(Integer.parseInt(list.get(i)) < min){
            min = Integer.parseInt(list.get(i));
        }
        if(Integer.parseInt(list.get(i)) % 2 == 0) {
            list.remove(i);
            i--;
        }
    }
    double avg = total/amount;
    System.out.println("Average: "+avg);
    System.out.println("min: "+min);
    System.out.println("max: "+max);
    System.out.println(list);
}
}
