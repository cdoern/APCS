import java.io.File;
import java.util.*;
public class CharlieDoernSum {

public static void main(String[] args){
    Scanner in = new Scanner(new File("sum.txt"));
    add(in);
}
public static void add(Scanner in){
   // char[] let;
    int[] num;
    while(in.hasNextLine()){
    String line = in.nextLine();
    Scanner token = new Scanner(line);
    while(token.hasNext()) {
        String word = token.next();
      char[] let =  word.toCharArray();
        for(int i =0; i<let.length; i++){
            String s = "" +let[i];
           int nums = Integer.parseInt(s);


        }
    }
    }


    }
}
}
