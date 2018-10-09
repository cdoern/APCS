import java.util.*;
public class CharlieDoernRandomHatV2 {
    public static void main(String[] args){
        intromethod(); // call introduction method
    }
    public static void intromethod(){
        int amount = 1; //declaring the amount variable which is used to set the amount of teams
        Scanner console = new Scanner(System.in); //scanner to read input of teams
        do{System.out.print("How many teams: "); //do while loop which asks user for team number until it is an even number of teams
            amount = console.nextInt();
        }while(amount%2!=0); //while it is not even
        int[] teams = new int[amount]; //declare array with size of the amount of teams
        int num = 1;
        for (int i = 0; i < teams.length; i++) {//for loop which populates the array from 1-amount
            teams[i] = num;
            num++;
        }
        generate(teams,amount); //call the generate method
    }
    public static void generate(int[] teams,int amount){
        for(int i = 0; i < teams.length/2; i++){ //for loop which executes length/2 times so if there are 8 teams 4 match ups are made
            int team1 = 0;// first team initialized
            int team2 = 0;//second team initialized
            do{
                team1 = (int)(Math.random()*(amount)); //set team one to a random number 0-(amount-1)
                team2 = (int)(Math.random()*(amount));// set team two to a random number 0-(amount-1
            }while(teams[team1] == teams[team2] || teams[team1]== 0 || teams[team2] == 0); //while they are different non-equal numbers
            System.out.println("Team " +teams[team1]+" vs "+teams[team2]+"."); //print the match up
            teams[team1] = 0; //set that entry into the array equal to zero
            teams[team2] = 0; //set that entry in the array equal to zero
        }
    }
}