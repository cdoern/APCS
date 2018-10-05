import java.util.*;

public class CharlieDoernRandomHatV2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
       do(System.out.print("How many teams: "));
        int amount = console.nextInt();
        if(amount%2 == 0) {
            int[] teams = new int[amount];
            for (int i = 0; i < teams.length; i++) {
                teams[i] = i;
            }
        }
    }
}
