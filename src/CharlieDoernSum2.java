import java.io.*;
import java.util.*;
public class CharlieDoernSum2 {
    private static int ARRAY_LENGTH; //declaring the global/final int used to make the arrays
    static{
        try{
            ARRAY_LENGTH = (findbiggest(new File("sum.txt"))); //calling the method to find the largest number in the file, and setting the final int to that num
        }
        catch(final Exception ex) { //catching the error if thrown
            throw new RuntimeException("Failed to find biggest num in file",ex);
        }
        }
    public static void main(String[] args) throws FileNotFoundException{ //main method which like many other methods has the file not found exception which allows me to safely declare scanners with files
        Scanner in = new Scanner(new File("sum.txt"));
        int counter = add(in); //calling addition method which returns the number of lines as well
        System.out.println(" ");
        System.out.print("Total lines = "+counter); //printing the number of lines

    }
    public static int add(Scanner in){ //addition method
        int counter = 0; //counter for number of lines
        while(in.hasNextLine()) { //while there is another line to the file
            counter++; //increment counter by 1
            int[] num = new int[ARRAY_LENGTH]; //declare the num array which will be the main large array for this problem
            String line = in.nextLine(); //lines 25-26 are extracting the line and tokenizing it
            Scanner token = new Scanner(line);
            while (token.hasNext()) { // this while loop says while there is another number within the line..
                String word = token.next(); //extract the number
                int[] let = new int[ARRAY_LENGTH]; //create a temp array for that number
                for(int i =0; i <word.length(); i++){// this for loop extracts each number from the string and adds it to an array from the back each index containing a digit
                   char temp =(word.charAt(word.length()-1-i));
                   String str = "" + temp;
                   int tempi = Integer.parseInt(str);
                    let[let.length -i-1] = tempi;
                }
                printingtwo(token, word); //calls  method to print the numbers being added together
                for (int i = 0; i < let.length-1; i++) { //this is the for loop in which the numbers are added and remainders handled
                    String s = "" + let[let.length - i - 1]; //pulling out each index from the char array
                    int nums = Integer.parseInt(s);
                    //
                    num[num.length - i - 1] = nums + num[num.length - i - 1]; //adding it to whatever is in the same index of the larger sum array
                        int remainder = num[num.length - i - 1] / 10; //calculating the remainder
                        num[num.length - i - 1] = num[num.length - i - 1] % 10; //this fixes the issue of each index being greater than 10
                        num[num.length - i - 2] += remainder; //adding the remainder or the carried number to the NEXT index
                }

            }
            printingone(num,counter); //calling the method which prints the results
        }
return(counter); //returning the amount of lines processed to be printed in main method
    }
    public static void printingone(int[] num,int counter){//this method prints the result
        boolean done = false;
        for(int i = 0; i< num.length; i++){// this for loop prints the numbers not equal to zero and breaks out to print those equal to zero, this is due to the fact that the array contains many arbitrary zeros we have to comb through before printing
            if(num[i]!=0){ //if a number other than zero set the boolean to true and print
                for(int j = i; j < num.length; j++){
                    done = true;
                    System.out.print(num[j]);
                }
                break; //breaking out of loop
            }
        }
        if(done == false){ //if the boolean is false, print zero
            System.out.print("0");
        }
        System.out.println(" "); //spacing


    }
    public static void printingtwo(Scanner token, String word){ //this method prints the added values
        System.out.print(word); //word is the string containing one of the numbers being added
        if(token.hasNext()){ //if the line has another value
            System.out.print(" + "); //print plus
        }
        else{
            System.out.print(" = "); //print equal if no more values
        }
    }
    public static int findbiggest(File sum)throws FileNotFoundException{ // this method handles finding the largest number to set equal to the constant
        Scanner read = new Scanner(new File("sum.txt")); //read in the file
        int biggest = 0; //declaring int for biggest values length
        while(read.hasNextLine()) { //while there is another line
            String line = read.nextLine(); //extract line
            Scanner token = new Scanner(line); //tokenize it
            while(token.hasNext()){ //while the line has another value
                String num = token.next(); //the string equals the next value in the line
                if(num.length() > biggest) { // if bigger thn current biggest, reset the value to num
                    biggest = num.length();
                }
            }
        }
        return(biggest+2); //return this value +2 to avoid out of bounds errors
    }
}