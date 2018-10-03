import java.util.*;

public class ArrayTraversal {
    public static void main(String[] args){
        int[] array = {5,2,4,1,3};
        oliverAlgo(array);
        malgo(array);
    }

    //oliver algorithm reverses the array using a temp array

    public static void oliverAlgo(int[] oa){

        int[] temp = new int[5];
        int tempa = 0;
        for(int i = oa.length-1; i>=0; i--){
            temp[tempa] = oa[i];
            tempa++;
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void malgo(int[] ma){
        int up = 1;
        for(int i = 0; i<=((ma.length-1)/2); i++){
            int temp = ma[i];
            ma[i] = ma[ma.length-i-1];
            ma[ma.length-i-1] = temp;

        }
        System.out.println(Arrays.toString(ma));
    }
        }

