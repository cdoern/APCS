import java.io.*;
import java.util.*;
public class CharlieDoernPersonalityTest {
    public static void main(String[] args)throws FileNotFoundException, IOException { //main method creates/fetches input output files and passes them to the reading file method
        String file = "";
        Scanner in = new Scanner(System.in);
        System.out.print("File name: "); //ask user for file
        file = in.next(); //set file to user input
        File fi = new File(file); //declare file
        while (fi.exists() == false) { //while the inputted file doesn't exist re-ask
            System.out.print("File not found. Try again: ");
            file = in.next();
            fi = new File(file);
        }
        System.out.print("Output file name: "); //ask for output file
        String output = in.next();
        PrintStream document = new PrintStream(output); //create output file
        readfile(document, file);
    }
    public static void readfile(PrintStream document, String file)throws FileNotFoundException, IOException {
        Scanner doc = new Scanner(new File(file)); //read file with a scanner
        int counter = 0; //counter to keep track of which line is a name line
        while (doc.hasNextLine()) { //while there is another line
            String line = doc.nextLine(); //read in the line
       //     Scanner tokenizer = new Scanner(line);
            if (counter % 2 == 0) { //if the line is an even # line it is a name to read the line and print to file
                String name = line;
                document.println(name + ":");
                System.out.println(name);
            } else { //else if not a name
                int[] total = new int[4]; //create two arrays, one for the total amount of B's and one for the dashes
                int[] dashes = new int[4];
                line = line.toLowerCase(); //convert to lowercase to make it easier
                char[] ans = line.toCharArray(); //take the string and split it up into chars and add each char to an index in an array
                int counter2 = 1;
                for (int i = 0; i < ans.length; i++) { //for each char ...
                    if (counter2 > 7) { //if we have gone through a whole group
                        counter2 = 1; //reset
                    }
                    if (ans[i] == 'b') { //this if statement says if there is a b answer AND depending on which type of question we are on, increment the respective index of the total array by 1
                        if (counter2 == 1) {
                            total[0]++;
                        }
                        if (counter2 == 2 || counter2 == 3) {
                            total[1]++;
                        }
                        if (counter2 == 4 || counter2 == 5) {
                            total[2]++;
                        }
                        if (counter2 == 6 || counter2 == 7) {
                            total[3]++;
                        }
                    }
                    if (ans[i] == '-') { //if the answer is void AND depending which type of question we are on, increment the respective index of the dashes by 1
                        if (counter2 == 1) {
                            dashes[0]++;
                        }
                        if (counter2 == 2 || counter2 == 3) {
                            dashes[1]++;
                        }
                        if (counter2 == 4 || counter2 == 5) {
                            dashes[2]++;
                        }
                        if (counter2 == 6 || counter2 == 7) {
                            dashes[3]++;
                        }
                    }
                    counter2++; //increase the secondary counter to indicate you are in the nth number of the 10 question cylce
                }
                System.out.println(Arrays.toString(total));
                printtofile(total, document,dashes); //call the file printing method
            }
            counter++; //increment the counter by 1 to indicate if the row is a name row or not
        }
    }
    public static void printtofile(int[] total, PrintStream document, int[] dashes){
                String id = "";
                String[] pers = new String[4]; //percent array which will contain the % b answers
                for(int i = 0; i < total.length; i ++){ //for each index in the total array  (amount of b)
                    /* I will comment out one of these if statements
                    because they all do the same the same thing
                     */
                    if(i == 0){  //if we are at the first index (this is special because it only has 10 questions in total bc the first question of each set is an I/E question
                        int a = (10-dashes[0]) - total[i]; //find total number of a answers by subtracting the number of dashes and b answers from the total number of questions
                        document.print(a+"A-"+total[i]+"B "); //print the amount of a and b to file like so 9A-2B
                        double first = (total[i]/10.0)*100.0; //get the percent as a double for precision
                        int per = (int)(first); //round to an int
                        pers[i] = per+"%"; //add the percent sign and add to the array of percents
                        if(a==total[i]){ //if the amount of a = b add X to the ID for no result
                            id+="X";
                        }
                      else if(a<total[i]){ //if more b's add the b result to the ID in this case "I"
                            id+="I";
                        }
                        else{ //else if neither of these are true, must be A so add the a result to the ID in this case "E"
                            id+="E";
                        }
                    }
                   else if(i == 1){
                        int a = (20-dashes[1]) - total[i];
                        document.print(a+"A-"+total[i]+"B ");
                        double first = (total[i]/20.0)*100.0;
                        int per = (int)(first);
                        pers[i] = per+"%";
                        if(a==total[i]){
                            id+="X";
                        }
                     else if(a<total[i]){
                            id+="N";
                        }
                        else{
                            id+="S";
                        }
                    }
                    else if(i == 2){
                        int a = (20-dashes[2]) - total[i];
                        document.print(a+"A-"+total[i]+"B ");
                        double first = (total[i]/20.0)*100.0;
                        int per = (int)(first);
                        pers[i] = per+"%";
                        if(a==total[i]){
                            id+="X";
                        }
                       else if(a<total[i]){
                            id+="F";
                        }
                        else{
                            id+="T";
                        }
                    }
                    else if(i == 3){
                        int a = (20-dashes[3]) - total[i];
                        document.println(a+"A-"+total[i]+"B ");
                       double first = (total[i]/20.0)*100.0;
                        int per = (int)(first);
                        pers[i] = per+"%";
                        if(a==total[i]){
                            id+="X";
                        }
                      else if(a<total[i]){
                            id+="P";
                        }
                        else{
                            id+="J";
                        }
                    }
                }
                document.print(Arrays.toString(pers)); //print the array or percents
                document.println(" = "+id); //print the ID "ENFP" for example
                document.println(""); //spacing in the file
                System.out.println(id);
            }

        }