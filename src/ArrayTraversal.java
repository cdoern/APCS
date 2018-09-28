import java.util.*;

public class ArrayTraversal {
    public static void main(String[] args){
        int[] array = {5,2,4,1,3};
        oliverAlgo(array);
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
}

