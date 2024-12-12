package Array2D;

import java.util.Arrays;
import java.util.Scanner;

public class printspiral {

    static void printMatrix(int[][] arr){
        for(int i=0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }

    }

//    static void printSpiral(int[][] matrix, int r, int c) {
//        int toprow = 0, bottomrow = r - 1;
//        int leftcol = 0, rightcol = c - 1;
//
//        int curr = 0;
//        while (curr < n*n) {
//            // Top row
//            for (int j = leftcol; j <= rightcol && curr < n*n; j++) {
//                System.out.print(matrix[toprow][j] + " ");
//                curr++;
//            }
//            toprow++;
//
//            // Right column
//            for (int i = toprow; i <= bottomrow && curr < n*n; i++) {
//                System.out.print(matrix[i][rightcol] + " ");
//                curr++;
//            }
//            rightcol--;
//
//            // Bottom row
//            for (int j = rightcol; j >= leftcol && curr < n*n; j--) {
//                System.out.print(matrix[bottomrow][j] + " ");
//                curr++;
//            }
//            bottomrow--;
//
//            // Left column
//            for (int i = bottomrow; i >= toprow && curr < n*n; i--) {
//                System.out.print(matrix[i][leftcol] + " ");
//                curr++;
//            }
//            leftcol++;
//        }
//    }

    static int[][] printSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int toprow = 0, bottomrow = n - 1;
        int leftcol = 0, rightcol = n - 1;

        int curr = 1;
        while (curr <= n*n) {
            // Top row
            for (int j = leftcol; j <= rightcol && curr <= n*n; j++) {
                matrix[toprow][j] =curr++;
                
            }
            toprow++;

            // Right column
            for (int i = toprow; i <= bottomrow && curr <= n*n; i++) {
                matrix[i][rightcol] =curr++;
                
            }
            rightcol--;

            // Bottom row
            for (int j = rightcol; j >= leftcol && curr <= n*n; j--) {
                matrix[bottomrow][j] = curr++;
                
            }
            bottomrow--;

            // Left column
            for (int i = bottomrow; i >= toprow && curr <= n*n; i--) {
                matrix[i][leftcol] = curr++;
                
            }
            leftcol++;
        }
        return matrix;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Number of row and col :");
//        int r = sc.nextInt() , c = sc.nextInt();
//
//        int[][] arr = new int[r][c];
//
//        System.out.println("enter " + r*c + " element");
//        for(int i =0; i < r; i++){
//            for(int j =0; j < c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }

        int n = sc.nextInt();
        int[][] ans =printSpiralMatrix(n);
        printMatrix(ans);



    }
}
