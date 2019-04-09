package Ch12Recursion;

public class Factorial {
    public static void main(String[] args){
       System.out.println(iterativeFactorial(3));
    }
    public static int iterativeFactorial(int param){
        int total = param;
        for(int i = param; i>=2; i--){
            total*=i-1;
        }
        return total;
    }
    public static int recursiveFactorial(int param){
        if(param == 0){
            return 1;
        }
        else{
            return recursiveFactorial(param-1) * param;
        }
    }
    public static void printStars(int n){
        if(n == 0){
            System.out.println();
        }
        else{
            System.out.println("*");
            printStars(n-1);
        }
    }
}
