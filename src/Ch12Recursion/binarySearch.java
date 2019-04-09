package Ch12Recursion;

public class binarySearch {
    public static void main(String[] args){
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int desired = 8;
        System.out.println(binary(list, desired));
        System.out.println(recursiveBinary(list, desired));

    }
    public static int binary(int[] list, int desired){
        int max = list.length-1;
        int min = 0;
        int mid = list.length/2;
        while(list[mid] != desired && max!=min){
            if(list[mid] > desired){
                max = mid -1;
                mid = (max+min)/2;
            }
            if(list[mid] < desired){
                min = mid+1;
                mid = (max+min)/2;
            }
        }
        if(list[mid] == desired) {
            return mid;
        }
        return -1;
    }
    public static int recursiveBinary(int[] list, int desired){
        int max = list.length -1;
        int min = 0;
        int mid = (max+min)/2;
        if(min>max){
            return -1;
        }
        if(list[mid] < desired){
            int[] list2 = new int[max-min+1];
            for(int i = mid; i < max-min+1; i++){
                list2[i] = list[i];
            }
            return recursiveBinary(list2, desired);
        }
        if(list[mid] > desired){
            int[] list2 = new int[max-min+1];
            for(int i = min; i < min-mid+1; i++){
                list2[i] = list[i];
            }
            return recursiveBinary(list2, desired);
        }
        else {
            return mid;
        }
    }
}
