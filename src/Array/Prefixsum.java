package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Prefixsum {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
         prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
           prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        return prefixSum;
    }

    static int[] prefixSumWithoutusingExtaarray(int[] arr){
        int n =arr.length;
        for(int i =1; i < n; i++){
            arr[i] =arr[i] +arr[i-1];
        }
        return arr;

    }

    static int sumofArray(int[] arr){
        int totalSum =0;
        for(int i=0; i < arr.length; i++){
            totalSum +=arr[i];
        }
        return totalSum;
    }

    static boolean suffixAndPrifix(int[] arr){
        int totalSum =sumofArray(arr);
        int prefix =0;
        for(int i = 0; i < arr.length; i++){
            prefix += arr[i];
            int suffix = totalSum - prefix;
            if(prefix == suffix){
                return true;
            }
        }
        return false;
    }

    static int[] sumofsuffix(int[] arr){
        for(int i  = arr.length - 2 ; i >= 0; i--){
            arr[i] =arr[i] + arr[i+1];
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//       int[] prefsum = prefixSumWithoutusingExtaarray(arr);
//        printArray(arr);
//
//        System.out.println("enter numer of quaries");
//        int q = sc.nextInt();
//        while (q-- >0){
//            System.out.println("enter the range");
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//
//            int ans =prefsum[r] - prefsum[l-1];
//
//            System.out.println(ans);
//        }

        int[] ans =sumofsuffix(arr);
        System.out.println(Arrays.toString(ans));

    }
}
