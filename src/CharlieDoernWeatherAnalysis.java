//This program asks a user to select an amount of days, input temperatures of those days and calculates the avg emp and the amount of days over that avg and prints the results.
import java.util.*; //import scanner

public class CharlieDoernWeatherAnalysis {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many day's temperatures? "); //prompt the user to enter the amount of days
        int amount = input.nextInt(); //amount of days is users input
        int[] temps = new int[amount];
        gettemps(amount, temps, input);
    }
    public static void gettemps(int amount, int[] temps, Scanner input) { //method to get the users inputted temps
        int i = 0; //initializing the incremental value in the while loop
        System.out.print("Day "+(i+1)+"'s temperature: "); //printing the prompt for the user
        temps[i] = input.nextInt(); //inputting the users temp into the array of temps
        int total = temps[i]; //creating the total var which can be used to get the avg
        i++;//increment by one before going into loop
        while(i < amount){
            System.out.print("Day "+(i+1)+"'s temperature: "); //printing the prompt for user
            temps[i] = input.nextInt(); //inserting the users input into the correct index of the array
            total += temps[i]; //adding the users input to the total which will be used to find the avg
            i++; //incrementing loop by 1
        }
        getavg(total, amount, temps); //calling next function and passing correct variables
    }
    public static void getavg(int total, int amount, int[] temps) { //method to get the average of the temps
        double amount2 = amount/1.0; //converting the amount to a double so the avg can be a double
        double avg = total/amount2; //creating avg as a double, dividing the total by the amount of days
        avg = Math.round(avg*10.0)/10.0; //rounding it to the nearest tenth
        System.out.println("Average temp = "+avg); //print results
        getover(avg,temps); //call next function for the days over avg
    }
    public static void getover(double avg, int[] temps) { //method to get the days over the avg
        int over = 0; //create value which counts how many days over avg
        for(int j : temps){ //a for each loop that goes through each item in the array and if it is greater than the avg it increments a variable by 1
            if(j > avg){
                over++; //increment over if item in array is larger than avg
            }
            j++; //increment loop
        }
        System.out.print(over + " days were above average."); //print results
        System.out.println("");
        System.out.println("");
        System.out.println("Temperatures: "+ Arrays.toString(temps));
        int max = Integer.MIN_VALUE;
        int max2 = 0;
        for(int i = 0; i<temps.length;i++){
            if(temps[i]>max){
                max2 = max;
                max = temps[i];
            }
        }
           int min = Integer.MAX_VALUE;
        int min2 = 0;
        for(int i = 0; i<temps.length;i++){
            if(temps[i]<min){
                min2 = min;
                min = temps[i];
            }
        }
        System.out.println("Two coldest days: " + min + ", " + min2);
        System.out.print("Two hottest days: "+ max +", " + max2);
    }

}
