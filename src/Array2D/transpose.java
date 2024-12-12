package Array2D;

import java.util.Scanner;

public class transpose {

    static void printMatrix(int[][] arr){
        for(int i=0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }

    }

    static int[][] transposeOfMatrix(int[][] matrix , int r, int c){
        int transpose[][] = new int[c][r];
        for( int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }

    static void transposeInPlace(int[][] matrix, int r, int c){

        for(int i = 0; i < c; i++){
            for(int j = i; j < r; j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;

            }
        }
    }

    static  void swapArray(int[] arr , int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


    static  void reverseArrayInplace(int[] arr){

        int i = 0, j = arr.length-1;
        while (i < j) {
            swapArray(arr, i, j);
            i++;
            j--;
        }

    }

    static void rotateMatrix(int[][] matrix, int n){
        transposeInPlace(matrix,n,n);
        for (int i = 0; i < n; i++){
            reverseArrayInplace(matrix[i]);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of row and col :");
        int r1 = sc.nextInt() , c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("enter " + r1*c1 + " element");
        for(int i =0; i < r1; i++){
            for(int j =0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

       rotateMatrix(a,r1);
        printMatrix(a);





    }
}
