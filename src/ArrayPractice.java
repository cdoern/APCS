import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args){
     //   int[] numbers = new int[10];
    //    System.out.println(Arrays.toString(numbers));

     //   for(int i = 0; i < numbers.length; i++){
        //    numbers[i] = i+1;
     //   }
      //  System.out.println(Arrays.toString(numbers));
        randomArray();
    }

    public static void randomArray(){

        int randol = (int)(Math.random()*10)+1;
      int [] randoms = new int[randol];
      for(int i = 1; i<randoms.length; i++){
          int rando = (int)(Math.random()*10)+1;
          randoms[i] = rando;


      }
        System.out.print(Arrays.toString(randoms));
    }
}
