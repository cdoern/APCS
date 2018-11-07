import java.io.*;
import java.util.*;
public class CharlieDoernSum {

public static void main(String[] args) throws FileNotFoundException{
    Scanner in = new Scanner(new File("sum.txt"));
    add(in);
}
public static void add(Scanner in){
   // char[] let;
    int[] num = new int[25];

    while(in.hasNextLine()) {
        String line = in.nextLine();
        Scanner token = new Scanner(line);
        while (token.hasNext()) {
            String word = token.next();
            char[] let = word.toCharArray();
            System.out.println(Arrays.toString(let));
            for (int i = 0; i < let.length; i++) {
                String s = "" + let[let.length - i - 1];
                int nums = Integer.parseInt(s);
                num[num.length - i - 1] = nums;

            }

        }
    }
  //  System.out.println(Arrays.toString(num));


    }
}

