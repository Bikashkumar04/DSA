package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer {


    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static  void swapArray(int[] arr , int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static  void sortZerosandOnes(int[] arr) {

        int n = arr.length;
        int zero =0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < zero) {
                arr[i] =0;
            }
            else {
                arr[i] = 1;
            }
        }
    }

    static  void sortZerosandOneWithoutUsingTwoloops(int[] arr) {

        int n = arr.length;
        int left =0;
        int right = n-1;
        while(right > left) {
            if(arr[left] == 1 && arr[right] == 0){
                swapArray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left ++;
            }
            if(arr[right] == 1 ){
                right--;
            }

        }
    }

    static  void sortevenandodd(int[] arr) {
        int n = arr.length;
        int left =0;
        int right = n-1;
        while(right > left) {
            if(arr[left] %2 ==1 && arr[right] %2 == 0){
                swapArray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] %2 ==0){
                left++;
            }
            if(arr[right] %2 ==1){
                right--;
            }
        }
    }
    static int[] reverseArr(int[] arr){

        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n-1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int left = 0 ,right = n-1 , k = 0;
        int[] ans = new int[n];
        while (left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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

       int[] ans = sortSquare(arr);
        reverseArr(ans);
        printArray(ans);


    }
}
