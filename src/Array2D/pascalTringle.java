package Array2D;

import java.util.Scanner;

public class pascalTringle {

    static void pascalTringle(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                
            }

        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of row and col :");
        int r1 = sc.nextInt() , c1 = sc.nextInt();

        int[][] arr = new int[r1][c1];

        System.out.println("enter " + r1*c1 + " element");
        for(int i =0; i < r1; i++){
            for(int j =0; j < c1; j++){
                arr[i][j] = sc.nextInt();
            }
        }

    }
}
