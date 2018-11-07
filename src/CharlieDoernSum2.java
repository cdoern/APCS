import java.io.*;
import java.util.*;
public class CharlieDoernSum2 {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("sum.txt"));
        add(in);
    }
    public static void add(Scanner in){
        // char[] let;


        while(in.hasNextLine()) {
            int[] num = new int[27];
            String line = in.nextLine();
            Scanner token = new Scanner(line);
            while (token.hasNext()) {
                String word = token.next();
                char[] let = word.toCharArray();

                for(int i = 0; i < let.length; i++){
                    System.out.print(let[i]);
                }
                if(token.hasNext()){
                    System.out.print(" + ");
                }
                else{
                    System.out.print(" = ");
                }
            //    System.out.println(Arrays.toString(let));
                for (int i = 0; i < let.length; i++) {
                    String s = "" + let[let.length - i - 1];
                    int nums = Integer.parseInt(s);
                   // if((num[num.length - i - 1]%10) == num[num.length - i - 1]) {
                        num[num.length - i - 1] = nums + num[num.length - i - 1];
                        int remainder = num[num.length-i-1] /10;
                        num[num.length-i-1] =   num[num.length-i-1] %10;
                        num[num.length-i-2] += remainder;




                  //  }
                  //else if(num[num.length - i - 1]%10 >=0 && num[num.length - i - 1]%10 != num[num.length - i - 1] ){
                    // num[num.length-i-2] += num[num.length-i-1] % 10;
                     //num[num.length-i-1] = num[num.length-i-1] %10;
                  //  }
                }
            }
       //    System.out.println(Arrays.toString(num));
        boolean done = false;
        for(int i = 0; i< num.length; i++){
            if(num[i]!=0){
                for(int j = i; j < num.length; j++){
                    done = true;
                    System.out.print(num[j]);

                }
                break;
            }

        }
        if(done == false){
            System.out.println("0");
        }
            System.out.println("");
        }


    }
}

