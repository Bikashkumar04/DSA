package Array;

import java.util.Arrays;
import java.util.Scanner;

public class mediam {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static  int pairSum(int[] arr,int target) {
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }

        }
        return ans;
    }


    static int tripletSum(int[] arr,int target) {
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static  int uniqueNum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int largest(int[] arr) {
        int largest =Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    static int secondLargest(int[] arr) {

        int mx =largest(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondLargest = largest(arr);
        return secondLargest;
    }

    static int firstPairNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];

                }
            }
        }
        return -1;
    }

    static void swapWithoutTemp(){
        int a =5;
        int b= 7;

         a = a+b;
         b = a-b;
         a = a-b;
        System.out.println(a);
        System.out.println(b);


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

    static  void swapArray(int[] arr , int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static  void reverseArrayInplace(int[] arr, int start, int end){

        int i = 0, j = arr.length-1;
        while (i < j) {
            swapArray(arr, i, j);
            i++;
            j--;
        }

    }

    static void rotateInPlace(int[] arr , int k){
        int n = arr.length;
        k =k%n;
        reverseArrayInplace(arr,n-k,n-1);
        reverseArrayInplace(arr,0,n-k-1);
        reverseArrayInplace(arr,0,n-1);

    }

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];
        int j =0;
        for(int i=n-k ; i<n ; i++){
            rotated[j] = arr[i];
            j++;
        }
        for(int i = 0; i <n-k ; i++){
            rotated[j] = arr[i];
        }
        return rotated;
    }


    static int[] frequencyArray(int[] arr) {
        int n = arr.length;
        int[] frequency = new int[100001];
        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }
        return frequency;
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
//        System.out.println("Enter the target element");
//        int target = sc.nextInt();
//
//        rotateInPlace(arr,target);
//        printArray(arr);



        //important
        int[] freq = frequencyArray(arr);
        System.out.println("enter the number of queries");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("enter number searched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("found");
            }
            else {
                System.out.println("not found");
            }
            q--;
        }

    }
}
