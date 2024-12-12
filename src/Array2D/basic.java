package Array2D;

import java.util.Scanner;

public class basic {

    static void printArray(int[][] arr){
        for(int i=0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }

    }

    static void sumOfMatrix(int[][] a,int r1, int c1, int[][] b, int r2, int c2){

        if( r1 != r2 || c1 != c2){
            System.out.println("wrong input not possible");
            return;
        }

        int[][] sum = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(sum);
    }

    static  void multofMatrix(int[][] a,int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("multiplication not possible");
            return;
        }
        int[][] multiplicationOfMatrix =new int[r1][c2];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                 for(int k = 0; k < c1; k++) {
                     multiplicationOfMatrix[i][j] += a[i][k] * b[k][j];
                 }
            }
        }
        printArray(multiplicationOfMatrix);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//       System.out.println("Number of row and col :");
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

        //
        System.out.println("Number of row and col :");
        int r1 = sc.nextInt() , c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("enter " + r1*c1 + " element");
        for(int i =0; i < r1; i++){
            for(int j =0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix 1 :");
        printArray(a);

        System.out.println("Number of row and col :");
        int r2 = sc.nextInt() , c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("enter " + r2*c2 + " element");
        for(int i =0; i < r2; i++){
            for(int j =0; j < c2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 2 :");
        printArray(b);

        System.out.println("multi of matrix");
         multofMatrix(a,r1,c1,b,r2,c2);





    }
}
