import java.util.*;

public class CharlieDoernRandomHatV2 {
    public static void main(String[] args){
        intromethod();
    }
    public static void intromethod(){
        int amount = 1;
        Scanner console = new Scanner(System.in);
        do{System.out.print("How many teams: ");
            amount = console.nextInt();
        }while(amount%2!=0);
        int[] teams = new int[amount];
        int num = 1;
        for (int i = 0; i < teams.length; i++) {
            teams[i] = num;
            num++;
        }
        generate(teams,amount);
    }

    public static void generate(int[] teams,int amount){
        for(int i = 0; i < teams.length/2; i++){
            int team1 = 0;
            int team2 = 0;
            do{
                team1 = (int)(Math.random()*(amount));
                team2 = (int)(Math.random()*(amount));
            }while(teams[team1] == teams[team2] || teams[team1]== 0 || teams[team2] == 0);
            System.out.println("Team " +teams[team1]+" vs "+teams[team2]+".");
            teams[team1] = 0;
            teams[team2] = 0;
        }

    }

}