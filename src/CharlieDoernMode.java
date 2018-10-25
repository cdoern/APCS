import java.util.*;

public class CharlieDoernMode {
    public static void main(String[] args){
        System.out.print(liamPriceAlgo(124433567));
    }
    public static int liamPriceAlgo(int num){
        int length = String.valueOf(num).length();
        int[] array = new int[length+1];
        for(int i =length; i >0; i--){
            array[num%10]+=1;
            num= num/10;

        }
        int max = 0;
        int in = 0;
        for(int i = 0; i< array.length; i++){
            if(array[i] == array[in]){
                max =in;
            }
            if(array[i] > array[in]){
                max = i;
                in = i;
            }

        }
        return(max);
    }


}