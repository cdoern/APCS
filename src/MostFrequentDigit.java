import java.util.Arrays;

public class MostFrequentDigit {
    public static void main(String[] args){
        liamPriceAlgo(669260267);
    }
    public static void liamPriceAlgo(int num){
        int[] array = new int[10];
        for(int i =9; i >=0; i--){
            array[num%10]+=1;
            num= num/10;

        }
     //   System.out.print(Arrays.toString(array));
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< array.length; i++){
            if(array[i] > max){
        max = i;
            }
        }
        System.out.print(max);


    }
}
