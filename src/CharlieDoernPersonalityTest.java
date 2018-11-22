import java.io.*;
import java.util.*;
public class CharlieDoernPersonalityTest {
    public static void main(String[] args)throws FileNotFoundException, IOException{
        String file = "";
        Scanner in = new Scanner(System.in);

      //  while(file != "personality.txt") {
            System.out.println("File name: ");
            file = in.next();
      //  }
        Scanner doc = new Scanner(new File(file));
        int counter = 0;
        while(doc.hasNextLine()){
            String line = doc.nextLine();
            Scanner tokenizer = new Scanner(line);

            if(counter%2 == 0){
                String name = line;
                System.out.println(name);
                //print name to file here
            }
            else {
                int[] total = new int[4];
                line = line.toLowerCase();
                char[] ans = line.toCharArray();
               int counter2=1;
                for(int i = 0; i <ans.length; i++){
                    if(counter2 > 7){
                        counter2 = 1;
                    }
                    if(ans[i] == 'b'){
                        if(counter2 == 1){
                            total[0]++;
                        }
                        if(counter2 == 2 || counter2 ==3){
                            total[1]++;
                        }
                        if(counter2 == 4 || counter2 ==5){
                            total[2]++;
                        }
                        if(counter2 == 6 || counter2 ==7){
                            total[3]++;
                        }
                    }
                    counter2++;
                }
                System.out.println(Arrays.toString(total));

                //for loop that goes through each index of total calculates a, and % of b and prints to file
                /*
                FileWriter fileWriter = new FileWriter("output.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter);
             //   printWriter.print("Some String");
             //   printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
                printWriter.close();

*/
            }
            counter++;
        }
    }
}

