import java.util.*;
public class Arrays2D {
    public static void main(String[] args){
        int[][] table = new int[5][10];
        for(int i = 0; i <table.length; i++) {
            for(int j = 0; j<table[i].length; j++){
                table[i][j] = (j+1)*(i+1);

        }
        }
        for(int i = 0; i<table.length; i++){
            System.out.println(Arrays.toString(table[i]));
        }

        }
    }

